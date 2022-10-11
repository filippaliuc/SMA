package com.example.secondapp;

import android.graphics.Color;

import java.util.HashMap;
import java.util.Map;

public class ColorMap {
    private Map<String, Integer> colorMap = new HashMap<>();

    public ColorMap() {
        colorMap.put("Red", Color.RED);
        colorMap.put("Blue",Color.BLUE);
        colorMap.put("Yellow",Color.YELLOW);
        colorMap.put("Green",Color.GREEN);
        colorMap.put("Magenta",Color.MAGENTA);
        colorMap.put("Gray",Color.GRAY);
    }

    public Integer getColorMap(String color) {
        return colorMap.get(color);
    }
}
