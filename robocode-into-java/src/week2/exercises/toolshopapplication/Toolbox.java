package week2.exercises.toolshopapplication;

import week2.exercises.paintingapplication.Tool;

import java.util.ArrayList;
import java.util.List;

public class Toolbox {

    private String color;
    private List<Tool>tools= new ArrayList<>();

    public Toolbox(String color) {
        this.color = color;
    }

    public void add(Tool tool){
        tools.add(tool);
    }

    public String getColor() {
        return color;
    }

    public List<Tool> getTools() {
        return tools;
    }
}


