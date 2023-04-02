package com.rajni.patterns.adapter;

public class ImageAdapter implements ImageViewer {

    private AdvancedImageViewer advancedImageViewer;

    public ImageAdapter(ImageFormat imageFormat) {
        if (imageFormat == ImageFormat.JPG) {
            advancedImageViewer = new JPGViewer();
        } else if (imageFormat == ImageFormat.PNG) {
            advancedImageViewer = new PNGViewer();
        }
    }

    @Override
    public void show(ImageFormat imageFormat, String fileName) {
        if (imageFormat == ImageFormat.JPG) {
            advancedImageViewer.showJPG(fileName);
        } else if (imageFormat == ImageFormat.PNG) {
            advancedImageViewer.showPNG(fileName);
        }
    }


}
