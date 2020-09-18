public class main
{
    public static void main (String [] args)
    {
       Animal animal = new Animal();
       animal.whatsMyName();
       animal.speak();

       Animal myKai = new Dog("Kai");
       myKai.whatsMyName();
       myKai.speak();

       //or You can do this as well which will give the same output:
        Dog myDog = new Dog("Kai2");
        myDog.whatsMyName();
        myDog.speak();
    }
}
