package com.example.examenblanc.Interf;

import com.example.examenblanc.Entities.Diagram;

import java.io.OutputStream;

public interface DiagramSerializer {
    void serialize(Diagram diagram, OutputStream outputStream);
}