public class main
{
    public static void main (String [] args)
    {
        //code problem 1 here
        int number1 = 5;
        double number2 = 5.2;
        String name = "Tennison";

        //code problem 2 here
        if(number1 == 5){
            number1 ++; //or number1 += 1
            System.out.println(number1);
        } else {
            System.out.println("error");
        }

        //code problem 3 here
        if(number1 + number2 == 11.2){
            System.out.println("success");
        }

        //code problem 4 here
        for(int index = 0; index < name.length(); index++) {
            System.out.println(name.charAt(index));
        }
    }
}
