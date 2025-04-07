public class Animal
{
    private String name;
    private String species;

    public Animal()
    {
       this(null, null);
    }
    public Animal(String name, String species)
    {
        this.species = species;
        this.name = name;
    }
    public String getName()
    {
        return name; 
    }

    public String getSpecies()
    {
        return species;
    }
    public  void matingCall()
    {
        System.out.println("generic sound");
    }
}