public class Animal {
    //static so that you cannot change the variables from the main class using . notation
    static String name = "Animal";
    static String sound = "Animal sound";

    Animal(){
        //this is a constructor which is not doing anything but allows you to call it using that
    }

    public void whatsMyName(){
        System.out.println(name);
    }

    public void speak(){
        System.out.println(sound);
    }
}
