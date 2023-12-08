package com.example.examenblanc.Entities;

import com.example.examenblanc.Interf.AnnotationStructure;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

public class JavaAnnotationStructure implements AnnotationStructure {
    private String annotationName;
    private Map<String, String> annotationProperties;

    public JavaAnnotationStructure(String annotationName) {
        this.annotationName = annotationName;
        this.annotationProperties = new HashMap<>();
    }

    @Override
    public void addProperty(String propertyName, String propertyValue) {
        annotationProperties.put(propertyName, propertyValue);
    }
}
