import java.util.Scanner;
public class Karen
{
    public String name;

    public Karen(String name)
    {
        this.name = name;
    }

    public Karen ()
    {
        String name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    Scanner scan = new Scanner(System.in);

    @Override
    public String toString()
    {
        return "The Karen is " + name + "!";
    }

    public String racing()
    {
        String animal1;
        String animal2;

        System.out.println("Choose the first animal to race");
        animal1 = scan.nextLine();

        System.out.println("Choose the second animal to race");
        animal2 = scan.nextLine();
        return "" + animal1 + animal2;
    }
}
