package com.example.examenblanc.Entities;

import com.example.examenblanc.Interf.DiagramSerializer;

import java.io.*;

public class BinarySerializer implements DiagramSerializer {
    @Override
    public void serialize(Diagram diagram, OutputStream outputStream) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(diagram);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
