//Determining Student's Division
package studentdiv;
import java.util.*;

public class StudentDiv{
    public static void main(String[] args) {
        int m1, m2, m3, per;
        Scanner sc;

        sc = new Scanner(System.in);
        System.out.println("Enter marks of 1st subject:");
        m1 = sc.nextInt();
        System.out.println("Enter marks of 2st subject:");
        m2 = sc.nextInt();
        System.out.println("Enter marks of 3st subject:");
        m3 = sc.nextInt();
        per = (m1 + m2 + m3) * 100 / 30;

        if (per >=60)
            System.out.println("First Division");

        if ((per >= 50) && (per < 59))
            System.out.println("Second Division");

        if ((per >= 40) && (per < 49))
            System.out.println("Third Division");

        if (per < 40)
            System.out.println("Fail");

    }
}