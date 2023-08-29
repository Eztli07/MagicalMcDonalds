public class Karen
{
    public String name;

    public Karen(String name)
    {
        this.name = name;
    }

    public Karen ()
    {

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Karen{" +
                "name='" + name + '\'' +
                '}';
    }
}
