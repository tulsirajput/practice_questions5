
import java.util.Scanner;

class Calculator {
    static int powerInt(int num1, int num2){
        return (int) Math.pow((double) num1, (double) num2);
    }
    static double powerdouble(double num1, double num2){
        return Math.pow(num1,num2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        double num3 = s.nextDouble();
        double num4 = s.nextDouble();
        System.out.println(powerdouble(num3,num4));
        System.out.println(powerInt(num1,num2));

    }
}