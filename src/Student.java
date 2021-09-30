
public class Student {
    String name;
    double percentage;

    Student(String a, double b) {
        name = a;
        percentage = b;
    }

}
class test{
    public static void main(String[] args) {
        Student s1 = new Student("Anushka",97);
        Student s2 = new Student("Tulsi",88);
        Student s3 = new Student("Ash", 98);

        if(s1.percentage > s2.percentage && s1.percentage > s3.percentage)
            System.out.println(s1.name + " " + s1.percentage);
        else if(s2.percentage > s3.percentage && s2.percentage > s1.percentage)
            System.out.println(s2.name + " " + s2.percentage);
        else
            System.out.println(s3.name + " " + s3.percentage);
    }
}