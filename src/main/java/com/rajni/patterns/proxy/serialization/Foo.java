package com.rajni.patterns.proxy.serialization;

import com.rajni.patterns.proxy.cloneable.Address;
import com.rajni.patterns.proxy.cloneable.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Foo implements Serializable {
    private String fieldOne;
    private String fieldsTwo;

    public static void main(String[] args) {
        Foo foo = new Foo("42", "RAJNI");
        Foo foo2 = SerializationUtils.roundtrip(foo);

        foo2.fieldsTwo = "Rajni";
        System.out.println(foo);
        System.out.println(foo2);

        Person rajni = Person.builder()
                .name(new String[] {"Rajni", "Ubhi"})
                .address(Address.builder()
                        .streetName("1")
                        .postalCode("141003")
                        .country("India")
                        .houseNumber(1233)
                        .state("Punjab")
                        .streetName("London Street")
                        .build())
                .build();

        Person newRajni = SerializationUtils.roundtrip(rajni);

        newRajni.getAddress().setCountry("London");
        newRajni.getAddress().setHouseNumber(1234);
        System.out.println(rajni);
        System.out.println(newRajni);
    }
}
