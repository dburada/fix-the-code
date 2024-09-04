//Purpose : This Program is to find max between two numbers a and b
//Task : This program is producing incorrect results fix it and also include condition to check if both the numbers are same


public class MaxOfTwo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int max;

        if(num1>num2)
        {
            max = num2;
        }
        else
        {
            max = num1;
        }

        System.out.println("The maximum number is: " + max);
    }
}
