
import java.util.Scanner;

public class Programming {
    String s;
    Programming(){
        s = "I lobe programming languages";
    }
    Programming(String s){
        this.s = "I lobe "+ s;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sa = s.nextLine();
        Programming obj = new Programming(sa);
        System.out.println(obj.s);
    }
}
