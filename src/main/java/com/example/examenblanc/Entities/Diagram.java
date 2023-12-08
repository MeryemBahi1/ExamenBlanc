package com.example.examenblanc.Entities;

import com.example.examenblanc.Interf.ClasseStructure;

import java.util.ArrayList;
import java.util.List;

public class Diagram {
    private List<ClasseStructure> classes;
    private List<Relationship> relationships;

    public Diagram() {
        this.classes = new ArrayList<>();
        this.relationships = new ArrayList<>();
    }

    public void addClass(ClasseStructure classStructure) {
        classes.add(classStructure);
    }

    public void addRelationship(Relationship relationship) {
        relationships.add(relationship);
    }

    // Méthodes getter pour accéder aux classes et aux relations.

    // Autres méthodes nécessaires pour la manipulation du diagramme.
}

