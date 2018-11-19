import java.util.ArrayList;
import java.util.List;
public class Toolbox {
    private String color;
    private List<Tool> toolList = new ArrayList();
    public Toolbox(String color) {
        this.color = color;
    }
    public void add(Tool tool) {
        toolList.add(tool);
    }
    public List<Tool> getTools() {
        return toolList;
    }
    public String getColor() {
        return color;
    }
}
