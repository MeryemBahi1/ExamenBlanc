package com.example.examenblanc.Interf;

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