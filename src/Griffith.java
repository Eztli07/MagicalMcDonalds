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
        String featherColor;
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
        return "The " + type + " is named " +  name + " it has a speed of  " + speed + " it weighs " + weight + " its feathers are " + featherColor;
    }
}
