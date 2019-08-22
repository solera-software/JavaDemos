package com.solerasoftware.decorator;

import com.solerasoftware.decorator.enums.*;

import java.util.Objects;

public class Carpet implements DecorItem {
    private String originCountry;
    private String manufacturer;
    private String weavingTechnique;
    private String material;
    private int width, height;
    private Style style;

    public Carpet(String originCountry, String manufacturer, String weavingTechnique, String material,
                  int width, int height, Style style) {
        this.originCountry = originCountry;
        this.manufacturer = manufacturer;
        this.weavingTechnique = weavingTechnique;
        this.material = material;
        this.width = width;
        this.height = height;
        this.style = style;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getWeavingTechnique() {
        return weavingTechnique;
    }

    public String getMaterial() {
        return material;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Style getStyle() {
        return style;
    }

    //--------------------- interface implentation -------------------//
    @Override
    public Size getItemSize() {
        int area = width * height;
        if (area < 1) return Size.SMALL;
        if (area < 10) return Size.MEDIUM;
        else return Size.LARGE;
    }

    @Override
    public Style getItemStyle() {
        return getStyle();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getHeight(), this.getWidth());
    }
}
