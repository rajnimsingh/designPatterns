package com.rajni.patterns.adapter;

public class JPGViewer implements AdvancedImageViewer {
    @Override
    public void showPNG(String fileName) {
        System.out.println("JPG Viewer showing PNG Image : " + fileName);
    }

    @Override
    public void showJPG(String fileName) {
        System.out.println("JPG Viewer showing JPG Image : " + fileName);
    }
}
