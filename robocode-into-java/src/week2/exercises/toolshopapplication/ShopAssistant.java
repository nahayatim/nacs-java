package week2.exercises.toolshopapplication;

import week2.exercises.paintingapplication.Tool;

import java.util.List;

public class ShopAssistant {

    public Toolbox findToolbox(String color, List<String>toolNames){
        Toolbox toolbox= new Toolbox(color);
        for (String toolName : toolNames) {
            Tool tool= new Tool(toolName);
            toolbox.add(tool);
        }
        return toolbox;
    }




}
