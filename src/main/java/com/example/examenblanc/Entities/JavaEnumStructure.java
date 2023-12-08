package com.example.examenblanc.Entities;

import com.example.examenblanc.Interf.EnumStructure;

import java.util.ArrayList;
import java.util.List;

public class JavaEnumStructure implements EnumStructure {
    private String enumName;
    private List<String> enumValues;

    public JavaEnumStructure(String enumName) {
        this.enumName = enumName;
        this.enumValues = new ArrayList<>();
    }

    @Override
    public void addValue(String value) {
        enumValues.add(value);
    }
}
