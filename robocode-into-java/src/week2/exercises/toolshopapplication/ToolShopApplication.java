package week2.exercises.toolshopapplication;

import week2.exercises.paintingapplication.Tool;

import java.util.ArrayList;
import java.util.List;

public class ToolShopApplication {

    public static void main(String[] args) {
        String tool1= "hammer";
        String tool2= "Screw-driver";
        String tool3= "Driller";

        List<String>toolNames= new ArrayList<>();
        toolNames.add(tool1);
        toolNames.add(tool2);
        toolNames.add(tool3);

        ShopAssistant shopAssistant= new ShopAssistant();
        Toolbox toolbox = shopAssistant.findToolbox("red", toolNames);

        System.out.println("Toolbox color : "+ toolbox.getColor());
        List<Tool>tools= toolbox.getTools();
        for (Tool tool : tools) {
            System.out.println("Toolbox has: "+ tool.getName());

        }


    }



}
