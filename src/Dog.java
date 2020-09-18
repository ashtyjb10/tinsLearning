public class Dog extends Animal{
    String sound = "Bark";
    String name;
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
