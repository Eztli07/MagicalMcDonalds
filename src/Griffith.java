public class Griffith extends MagicAnimal
{
    public String featherColor;

    public Griffith(String name, String type, int speed, double weight, String featherColor)
    {
        super(name, type, speed, weight);
        this.featherColor = featherColor;
    }

    public Griffith()
    {

    }

    public String getFeatherColor()
    {
        return featherColor;
    }

    public void setFeatherColor(String featherColor)
    {
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {
        return "Griffith{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
