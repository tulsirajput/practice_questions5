import java.util.Scanner;

public class Car {
    String manufacturer;
    int price;

    public Car(int price, String manufacturer) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car ob1 = new Car(sc.nextInt(), sc.nextLine());
        Car ob2 = new Car(sc.nextInt(), sc.nextLine());
        Car ob3 = new Car(sc.nextInt(), sc.nextLine());

        if(ob1.price > ob2.price && ob1.price > ob3.price){
            if(ob2.price > ob3.price){
                System.out.println(ob1.manufacturer+" "+ob1.price);
                System.out.println(ob2.manufacturer+" "+ob2.price);
                System.out.println(ob3.manufacturer+" "+ob3.price);
            }
            else{
                System.out.println(ob1.manufacturer+" "+ob1.price);
                System.out.println(ob3.manufacturer+" "+ob3.price);
                System.out.println(ob2.manufacturer+" "+ob2.price);

            }
        }
        else if (ob2.price > ob1.price && ob2.price > ob3.price){
            if(ob1.price > ob3.price){
                System.out.println(ob2.manufacturer+" "+ob2.price);
                System.out.println(ob1.manufacturer+" "+ob1.price);
                System.out.println(ob3.manufacturer+" "+ob3.price);
            }
            else{
                System.out.println(ob2.manufacturer+" "+ob2.price);
                System.out.println(ob3.manufacturer+" "+ob3.price);
                System.out.println(ob1.manufacturer+" "+ob1.price);

            }
        }
        else{
            if(ob1.price > ob2.price){
                System.out.println(ob3.manufacturer+" "+ob3.price);
                System.out.println(ob1.manufacturer+" "+ob1.price);
                System.out.println(ob2.manufacturer+" "+ob2.price);
            }
            else{
                System.out.println(ob3.manufacturer+" "+ob3.price);
                System.out.println(ob2.manufacturer+" "+ob2.price);
                System.out.println(ob1.manufacturer+" "+ob1.price);

            }
        }
    }
}