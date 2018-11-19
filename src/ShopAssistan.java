import java.util.List;
public class ShopAssistan {
    public Toolbox findToolbox(String color, List<String>toolList) {
        Toolbox toolbox = new Toolbox(color);
        for(String toolName : toolList) {
            Tool tool = new Tool(toolName);
            toolbox.add(tool);
        }
        return toolbox;
    }
}
