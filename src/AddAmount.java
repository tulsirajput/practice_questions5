import java.util.Scanner;

public class AddAmount {
    int amount;
    AddAmount(){
        amount = 50;
    }
    AddAmount(int s){
        amount = 50 + s;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        AddAmount obj = new AddAmount(n);
        System.out.println("Final Amount : "+obj.amount);
    }
}