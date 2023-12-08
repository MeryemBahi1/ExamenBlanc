package com.example.examenblanc.Entities;

import com.example.examenblanc.Interf.DiagramSerializer;

import java.io.OutputStream;
import java.io.PrintWriter;

public class SVGSerializer implements DiagramSerializer {
    @Override
    public void serialize(Diagram diagram, OutputStream outputStream) {
        try (PrintWriter writer = new PrintWriter(outputStream)) {
            // Génération du contenu SVG en fonction de la structure du diagramme.

            // Exemple simple : une balise SVG avec un texte indiquant le nom du diagramme.
            writer.println("<svg width=\"100\" height=\"100\">");
            writer.println("</svg>");
        } catch (Exception e) {
            e.printStackTrace(); // Gestion des erreurs de sérialisation SVG.
        }
    }
}