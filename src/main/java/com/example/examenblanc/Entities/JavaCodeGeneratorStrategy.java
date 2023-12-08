package com.example.examenblanc.Entities;

import com.example.examenblanc.Interf.CodeGeneratorStrategy;
import com.example.examenblanc.Interf.StructureFactory;

public class JavaCodeGeneratorStrategy implements CodeGeneratorStrategy {
    private StructureFactory structureFactory;

    public JavaCodeGeneratorStrategy(StructureFactory structureFactory) {
        this.structureFactory = structureFactory;
    }

    @Override
    public void generateCode() {
        // Implementation for Java code generation using StructureFactory.
    }
}