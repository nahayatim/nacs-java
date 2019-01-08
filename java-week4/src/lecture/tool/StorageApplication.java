package lecture.tool;

import lecture.tool.Storage;
import lecture.tool.Tool;
import lecture.tool.ToolMaker;

import java.util.Optional;

public class StorageApplication {
    public static void main(String[] args) {

        Storage toolStorage = new Storage();

        ToolMaker toolMaker = new ToolMaker();

        toolMaker.fillStorage(toolStorage);

        Optional<Tool> tool = toolStorage.getTool("hammer");
        if (tool.isPresent()){

            System.out.println("start working with: "+tool.get().getName());
        } else {
            System.out.println("oh no, I have got no tool");
        }


    }
}
