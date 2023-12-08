package com.example.examenblanc.Entities;

import com.example.examenblanc.Interf.ClasseStructure;

import java.beans.Visibility;
import java.lang.reflect.Parameter;
import java.util.List;

public class JavaClassStructure implements ClasseStructure {
    @Override
    public void addAttribute(String attributeName, String attributeType, Visibility visibility, boolean isStatic, boolean isFinal) {

    }

    @Override
    public void addMethod(String methodName, String returnType, Visibility visibility, boolean isStatic, boolean isFinal, List<Parameter> parameters) {

    }
    // Implementation for Java class structure.
}