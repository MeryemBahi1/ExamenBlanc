package com.example.examenblanc.Entities;

import com.example.examenblanc.Enums.ActionType;

public class DiagramAction {
    private ActionType type;
    private String details;

    public DiagramAction(ActionType type, String details) {
        this.type = type;
        this.details = details;
    }

}
