package com.example.examenblanc.Interf;

public interface StructureFactory {
    ClasseStructure createClassStructure(String className);
    InterfaceStructure createInterfaceStructure(String interfaceName);
    EnumStructure createEnumStructure(String enumName);
    AnnotationStructure createAnnotationStructure(String annotationName);
}