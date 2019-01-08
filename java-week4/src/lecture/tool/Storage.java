package lecture.tool;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Storage {

    Set<Tool> tools = new HashSet<>();

    public void addTool(Tool newTool){
        tools.add(newTool);

    }

    public Optional<Tool> getTool(String nameOfTool){
        for (Tool tool : tools) {
            if (tool.getName().equals(nameOfTool)){
                return Optional.of(tool);
            }

        }
        return Optional.empty();
    }
}
