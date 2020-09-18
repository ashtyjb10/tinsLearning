public class Dog extends Animal{
    static String sound = "Bark";
    //this static will make it so that you cannot just change the variable from the main class. and make you use the constructor.
    static String name;
    Dog(String name){
        this.name = name;
    }

    @Override
    public void whatsMyName() {
        System.out.println(name);
    }

    @Override
    public void speak() {
        System.out.println(sound);
    }
}
