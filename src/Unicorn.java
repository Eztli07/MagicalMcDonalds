public class Unicorn extends MagicAnimal
{
    public int hornSharp;

    public Unicorn(String name, String type, int speed, double weight, int hornSharp) {
        super(name, type, speed, weight);
        this.hornSharp = hornSharp;
    }

    public int getHornSharp() {
        return hornSharp;
    }

    public void setHornSharp(int hornSharp) {
        this.hornSharp = hornSharp;
    }

    @Override
    public String toString() {
        return "Unicorn{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
