public class Dragon extends MagicAnimal
{
    public int wings;

    public Dragon(String name, String type, int speed, double weight, int wings)
    {
        super(name, type, speed, weight);
        this.wings = wings;
    }



    public Dragon()
    {
    int wings;
    }

    public int getWings()
    {
        return wings;
    }

    public void setWings(int wings)
    {
        this.wings = wings;
    }

    @Override
    public String toString()
    {
        return "The " + type + " is named " +  name + " it has a speed of  " + speed + " it weighs " + weight + " it has " + wings + " wings";
    }
}
