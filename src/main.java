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

        //heres what this would print out.
        //Animal
        //Animal sound
        //Kai
        //Bark
        //Kai2
        //Bark

        Snake mySnake = new Snake();
        mySnake.whatsMyName();
        int aNewNum = 12;
        mySnake.setNum1(aNewNum);
        int myNewestNum = mySnake.getNum1();
        System.out.println(myNewestNum);
        //Animal
        //the value has been set for num 1 in snake to: 12
        //we are now returning the value of num1
        //12
    }
}
