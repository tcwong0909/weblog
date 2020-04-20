package com.tcwong.pattern.principle.liskov;

public class Rectangle implements QuadRangle {

    private long height;
    private long width;

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
