
import java.util.Scanner;

public class Room {
    boolean AC_ON,HOME_THEATRE_ON,LIGHT_ON;
    Room(String a, String b, String c){
        if(a.equals("ON"))
            AC_ON = true;
        else
            AC_ON = false;
        if(b.equals("ON"))
            HOME_THEATRE_ON = true;
        else
            HOME_THEATRE_ON = false;
        if(c.equals("ON"))
            LIGHT_ON = true;
        else
            LIGHT_ON = false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("----------------------------------------------------------WELCOME--------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                      Please select your choice");
        System.out.println("                      1. Press 1 to turn the AC ON : ");
        System.out.println("                      2. Press 2 to turn the Home Theatre ON : ");
        System.out.println("                      3. Press 3 to turn Light ON : ");
        a = s.nextInt();
        System.out.flush();
        String b,c,d;
        if(a==1)
            b = "ON";
        else
            b = "OFF";
        if(a==2)
            c = "ON";
        else
            c = "OFF";
        if(a==3)
            d = "ON";
        else
            d = "OFF";
        Room room = new Room(b,c,d);
        System.out.println("                    Status of the appliances         ");
        if(room.AC_ON)
            b = "ON";
        else
            b = "OFF";
        if(room.HOME_THEATRE_ON)
            c = "ON";
        else
            c = "OFF";
        if(room.LIGHT_ON)
            d = "ON";
        else
            d = "OFF";
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                    1. AC : "+ b);
        System.out.println("                    2. Home Theatre : " + c);
        System.out.println("                    3. Light : "+ d);
    }
}