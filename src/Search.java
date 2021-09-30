
import java.util.Scanner;

public class Search {
    public boolean search(int[] arr, int num){
        boolean s = false;
        for (int j : arr) {
            if (j == num) {
                s = true;
                break;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Search obj1 = new Search();
        boolean a = obj1.search(arr,n);
        if(a){
            System.out.println(a);
        }
        else
            System.out.println("Element not found");
    }
}