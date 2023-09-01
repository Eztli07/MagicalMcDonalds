import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Karen karen = new Karen("");

        Dragon dragon = new Dragon("", "Dragon", 18, 20000.00, 2);

        Unicorn unicorn = new Unicorn("", "Unicorn", 200, 700.20, 7);
   
        Griffith griffith = new Griffith("", "Griffith", 70, 500.60, "Gold");

        ArrayList<MagicAnimal> mcdonalds = new ArrayList<>();
        mcdonalds.add(dragon);
        mcdonalds.add(unicorn);
        mcdonalds.add(griffith);

        Scanner scan = new Scanner(System.in);

        System.out.println("Name yourself");
        karen.setName(scan.nextLine());

        System.out.println("Name your dragon");
        dragon.setName(scan.nextLine());

        System.out.println("Name your unicorn");
        unicorn.setName(scan.nextLine());

        System.out.println("Name your griffith");
        griffith.setName(scan.nextLine());

        System.out.println(karen.toString());
        System.out.println(dragon.toString());
        System.out.println(unicorn.toString());
        System.out.println(griffith.toString());

    }
}