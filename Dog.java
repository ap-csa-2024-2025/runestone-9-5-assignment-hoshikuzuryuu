public class Dog extends Animal
{
    private String breed;
    public Dog(String breed, String name)
    {
        super(name , "canine");
        this.breed = breed;
    }
    public void wagTail()
    {
        System.out.println("waggin");
    }
    public void matingCall()
    {
        System.out.println("woof");
    }
    public String getBreed()
    {
        return breed;
    }

    public String toString()
    {
        return ("A" + getBreed() + "dog named " + super.getName());
    }
}