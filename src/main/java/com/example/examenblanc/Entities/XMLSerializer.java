package com.example.examenblanc.Entities;

import com.example.examenblanc.Interf.DiagramSerializer;

import java.io.OutputStream;
import java.io.PrintWriter;

public class XMLSerializer implements DiagramSerializer {
    @Override
    public void serialize(Diagram diagram, OutputStream outputStream) {
        try (PrintWriter writer = new PrintWriter(outputStream)) {
            // Génération du contenu XML en fonction de la structure du diagramme.

            // Exemple simple : une balise XML avec un élément représentant le nom du diagramme.
            writer.println("<diagram>");
            // Ajoutez ici la logique pour générer d'autres éléments XML en fonction de votre modèle.
            writer.println("</diagram>");
        } catch (Exception e) {
            e.printStackTrace(); // Gestion des erreurs de sérialisation XML.
        }
    }
}