public class Unicorn extends MagicAnimal
{
    public int hornSharp;

    public Unicorn(String name, String type, int speed, double weight, int hornSharp) {
        super(name, type, speed, weight);
        this.hornSharp = hornSharp;
    }

    public Unicorn()
    {
        int hornSharp;
    }

    public int getHornSharp() {
        return hornSharp;
    }

    public void setHornSharp(int hornSharp) {
        this.hornSharp = hornSharp;
    }

    @Override
    public String toString()
    {
        return "The " + type + " is named " +  name + " it has a speed of  " + speed + " it weighs " + weight + " its horn sharpness is " + hornSharp;
    }
}
