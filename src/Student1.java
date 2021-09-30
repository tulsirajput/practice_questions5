import java.util.Scanner;

public class Student1 {
    String name;
    int age;
    String address;

    Student1() {
        name = "Unknown";
        age = 0;
        address = "not available";
    }

    public void setinfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setinfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student1[] arr = new Student1[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Student1();
            arr[i].setinfo(sc.next(), sc.nextInt(), sc.next());
        }
        System.out.flush();
        System.out.println("Info of " + n + " students");
        for (int i = 0; i < n; i++) {
            System.out.println("Name : " + arr[i].name);
            System.out.println("Age : " + arr[i].age);
            System.out.println("Address : " + arr[i].address);
        }
    }
}