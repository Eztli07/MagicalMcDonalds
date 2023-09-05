public class MagicAnimal
{
    public String name;
    public String type;
    public int speed;
    public double weight;

    public MagicAnimal(String name, String type, int speed, double weight)
    {
        this.name = name;
        this.type = type;
        this.speed = speed;
        this.weight = weight;
    }

    public MagicAnimal()
    {
    String name;
    String type;
    int speed;
    double weight;
    }

    public MagicAnimal(String name)
    {
        this.name = name;
        this.type = "Dragon";
        this.type = "Unicorn";
        this.type = "Griffith";
    }

    public String feed()
    {
        speed += 20;
        weight += 5;
        return ("Your " + type + "now has a speed of " + speed + " and a weight of " + weight);
    }
    public double speed()
    {
        double raceSpeed = ((speed * weight)/10);
        return raceSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return "MagicAnimal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
