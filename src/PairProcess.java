import java.util.Scanner;

public class PairProcess {
    public static void main(String args[]){
        int num1,num2;
        int numSum, numPro;
        float numAver;

        Scanner keyboard = new Scanner (System.in);

        System.out.print("first Number? : ");
        num1 = keyboard.nextInt();

        System.out.print("last Number? : ");
        num2 = keyboard.nextInt();

        // Numer2 > 3000
        if (num2 >3000){
            System.out.println("Wow, you chose a big number. " + num2 + " is number 2");

        }
        //calcutate the sum and print it
        numSum = num1+num2;
        System.out.println("The sum of the numbers is : " + numSum +".");

        //calcutate the product and print it
        numPro = num1*num2;
        System.out.println("The product of the numbers is : " + numPro +".");

        //calcutate the Averagre and print it
        numAver = (num1+num2)/2;
        System.out.println("The average of the numbers is : " + numAver +".");


        if (numSum > 200)
        {
            if (numSum < 1000) {
                System.out.println("The sum = *~" + numSum);
            }else {
                System.out.println("The sum = *" + numSum);
            }
        }else if (numSum<1000){
            System.out.println("The sum = ~" + numSum);

        }else {
            System.out.println("The sum = " + numSum);
        }



    }
}
