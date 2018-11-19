package HorseRunner;

public class Mustang implements Horse{
    private String name;
    private int weight;
    public String toString() {
        String output = "";
        output += this.getName() + "," + "weights " + this.getWeight();
        return output;
    }
}