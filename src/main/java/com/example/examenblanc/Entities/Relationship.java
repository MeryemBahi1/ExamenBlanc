package com.example.examenblanc.Entities;

import com.example.examenblanc.Enums.Cardinality;
import com.example.examenblanc.Enums.RelationshipType;

import javax.swing.text.html.parser.Entity;

public class Relationship {
    private Entity sourceEntity;
    private Entity destinationEntity;
    private RelationshipType type;
    private Cardinality sourceCardinality;
    private Cardinality destinationCardinality;

    public Relationship(Entity sourceEntity, Entity destinationEntity, RelationshipType type,
                        Cardinality sourceCardinality, Cardinality destinationCardinality) {
        this.sourceEntity = sourceEntity;
        this.destinationEntity = destinationEntity;
        this.type = type;
        this.sourceCardinality = sourceCardinality;
        this.destinationCardinality = destinationCardinality;
    }

    // Méthodes getter pour accéder aux propriétés de la relation.

    // Autres méthodes nécessaires pour la manipulation des relations.
}
