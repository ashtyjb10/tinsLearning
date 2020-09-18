public class Snake extends Animal {
    int num1;
    int num2;

    public void setNum1(int myNum1){
        this.num1 = myNum1;
        System.out.println("the value has been set for num 1 in snake to: "+ num1);
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }

    public int getNum1(){
        System.out.println("we are now returning the value of num1");
        return this.num1;
    }

    public int getNum2(){
        return num2;
    }

    public int addNum1Num2(){
        return num1 + num2;
    }


    @Override
    public void whatsMyName() {
        super.whatsMyName();
    }
}
