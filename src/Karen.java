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

        /*
        while(animal1 != "Dragon" || animal1 != "Unicorn" || animal1 !=  "Griffith");
        return "Please enter a valid animal";
        if (animal1 == "Dragon")
        {
            return "" + Dragon.toString();
        }
        else if (animal1 == "Unicorn")
        {
            return "" + Unicorn.toString();
        }
        else if (animal1 == "Griffith")
        {
            return "" + Dragon.toString();
        }

        while(animal2 != "Dragon" || animal2 != "Unicorn" || animal2 !=  "Griffith" || animal2 == animal1);
        return "Please enter a valid animal";
        if (animal2 == "Dragon")
        {
            return "" + Dragon.toString();
        }
        else if (animal2 == "Unicorn")
        {
            return "" + Unicorn.toString();
        }
        else if (animal2 == "Griffith")
        {
            return "" + Dragon.toString();
        }
        */

        System.out.println("You chose the " + animal1 + " and the " + animal2 + " to race");
        System.out.println("Choose an animal in the race to feed");
        String feeding = scan.nextLine();

        /*
        while (feeding != animal1 && feeding  != animal2) //this validation was stuck in a loop of repeating itself
        {
            System.out.println("Choose an animal in the race");
            feeding = scan.nextLine();
        }
        */

        /*
        System.out.println("Your animal now has " + feeding.feed() + " speed");

        if (animal1.speed() > animal2.speed())
        {
            return animal1.getName()  + "  wins!";
        }
        else
        {
            return animal2.getName() + " wins!";
        }
        */

        return "You fed the " + feeding + "!";
    }
}
