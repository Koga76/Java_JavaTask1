import java.util.Scanner;

public class Task1 {
    public static String safe = "Safe Zone";
    public static String dang = "Dangerous Zone";

    public static int zone(int difference, int max) {
        if ((float) difference >= (.5 * max)) return 1;
        else if ((float) difference < (.5 * max)) return 2;
        return 0;

    }
//diff=7   .5*8=4
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Values:");
        int no_Values = in.nextInt();
        int max = 0, min = 0;
        for (int i = 0; i < no_Values; i++) {

            int val = in.nextInt();

            if (i == 0) {

                min = max = val;
            }
            if (val > max) max = val;
            else if (val < min) {
                min = val;
            }
        }
        int difference = max - min;

        int z = zone(difference, max);
        if (z == 1) {
            System.out.println(safe);
        }
        else if (z==2)
        {
            System.out.println(dang);
        }

    }
}






