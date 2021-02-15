import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String a = "Hello";
        String b = "He";
        String c = "oll";
        String d = b + c;

        System.out.println(a.equals(d));

//        Random rand = new Random();
////        String s = sc.nextLine();
//        int min = 100;
//        int max = 200;
//        int diff = max - min;
//        int s = rand.nextInt(diff);
//        s += min;
//        System.out.println(s);

    }

    public static int readIntegerFromConsole()
    {
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("Введите цело число!");
            if (sc.hasNextInt())
            {
                return sc.nextInt();
            }

            sc.nextLine();
        }
        while (true);
    }

}
