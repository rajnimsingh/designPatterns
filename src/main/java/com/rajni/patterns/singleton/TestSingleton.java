package com.rajni.patterns.singleton;

import com.google.common.collect.Iterables;
import com.google.common.reflect.Reflection;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonRecordFinder finder = new SingletonRecordFinder();
        int totalPopulation = finder.getTotalPopulation(List.of("Mumbai", "Pune", "New York"));
        System.out.println(totalPopulation);
    }
}

class SingletonDatabase {
    private Map<String, Integer> capitals = new HashMap<>();
    private static SingletonDatabase INSTANCE = new SingletonDatabase();
    private static int instanceCount = 0;

    private SingletonDatabase() {
        instanceCount++;
        System.out.println("Initializing Database");

        try  {
            File file = new File("src/main/resources/capitals.txt");
            Path fullPath = Paths.get(file.getPath());
            List<String> lines = Files.readAllLines(fullPath);

            Iterable<List<String>> partition = Iterables.partition(lines, 2);

            partition.forEach(kv -> {
                capitals.put(kv.get(0), Integer.parseInt(kv.get(1)));
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SingletonDatabase getInstance() {
        return INSTANCE;
    }

    public int getPopulation(String name) {
        return INSTANCE.capitals.get(name);
    }

    public static boolean isSingleton(Supplier<Object> func) throws InvocationTargetException, IllegalAccessException {
        Object o = func.get();
        Method[] methods = o.getClass().getMethods();
        for (Method method : methods) {
            Class<?> returnType = method.getReturnType();
            if (returnType == o.getClass()) {
                Object newObject = method.invoke(o);
                if (newObject == o) {
                    return true;
                }
            }
        }
        return false;
    }
}

class SingletonRecordFinder {
    public int getTotalPopulation(List<String> names) {
        int result = 0 ;

        for (String name : names) {
            result += SingletonDatabase.getInstance().getPopulation(name);
        }
        return result;
    }
}
