package com.rajni.patterns.adapter;

public class GalleryApp implements ImageViewer {

    @Override
    public void show(ImageFormat imageFormat, String fileName) {
        ImageAdapter imageAdapter = new ImageAdapter(imageFormat);
        imageAdapter.show(imageFormat, fileName);
    }
}
