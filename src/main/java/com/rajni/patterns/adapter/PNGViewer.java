package com.rajni.patterns.adapter;

public class PNGViewer implements AdvancedImageViewer {
    @Override
    public void showPNG(String fileName) {
        System.out.println("PNGViewer showing PNG Image : " + fileName);
    }

    @Override
    public void showJPG(String fileName) {
        System.out.println("PNGViewer showing JPG Image : " + fileName);
    }
}
