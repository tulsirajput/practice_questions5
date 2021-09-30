
public class Specific {
    static int count;
    public Specific(){
        count++;
    }

    public static void main(String[] args) {
        Specific ob1 = new Specific();
        Specific ob2 = new Specific();

        System.out.println(ob2.count);

    }
}