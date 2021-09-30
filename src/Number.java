import java.math.BigInteger;
import java.util.Scanner;

public class Number {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }
    boolean isZero(){
        return (num==0);
    }
    boolean isPositive(){
        return (num>0);
    }
    boolean isNegative(){
        return (num<0);
    }
    boolean isOdd(){
        return (num%2 !=0);
    }
    boolean isEven(){
        return (num%2==0);
    }
    boolean isArmstrong(){
        int s = String.valueOf(num).length();
        int a = num;
        int d=0;
        while(a>0){
            d= d+ (int) (Math.pow(a%10,s));
            a=a/10;
        }
        return (d==num);
    }
    static BigInteger sum1  = new BigInteger("1");
    public static BigInteger getFactorial(int num){
        while (num>0){
            sum1 =sum1.multiply(BigInteger.valueOf(num));
            num--;
        }
        return sum1;
    }
    int getSqrt(){
        return (int) Math.sqrt(num);
    }
    int getSqr(){
        return (int) Math.pow(num,2);
    }
    int getSumdigits(){
        int a = num;
        int s =0;
        while(a>0){
            s=s+(a%10);
            a/=10;
        }
        return s;
    }
    void dispBinary(){
        System.out.println(Integer.toBinaryString(num));
    }
    void dispHexa(){
        System.out.println(Integer.toHexString(num));
    }
    void dispOctal(){
        System.out.println(Integer.toOctalString(num));
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        Number obj1 = new Number();
        obj1.setNum(n);
        System.out.println("Factorial = "+obj1.getFactorial(n));
        System.out.println("Square = "+obj1.getSqr());
        System.out.println("Square root =" +obj1.getSqrt());
        System.out.println("Sum of digits ="+obj1.getSumdigits());
        System.out.println("Is armstrong ? "+ obj1.isArmstrong());
        System.out.println("Is even? "+ obj1.isEven());
        System.out.println("Is odd? " +obj1.isOdd());
        System.out.println("Is zero? "+obj1.isZero());
        System.out.println("Is negative ? "+obj1.isNegative());
        System.out.println("Is positive ? " +obj1.isPositive());
        obj1.dispBinary();
        obj1.dispHexa();
        obj1.dispOctal();
    }
}
