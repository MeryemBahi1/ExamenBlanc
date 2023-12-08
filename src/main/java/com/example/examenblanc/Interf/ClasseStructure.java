package com.example.examenblanc.Interf;

import java.beans.Visibility;
import java.lang.reflect.Parameter;
import java.util.List;

import java.util.List;

public interface ClasseStructure {
    void addAttribute(String attributeName, String attributeType, Visibility visibility, boolean isStatic, boolean isFinal);

    void addMethod(String methodName, String returnType, Visibility visibility, boolean isStatic, boolean isFinal, List<Parameter> parameters);


}



