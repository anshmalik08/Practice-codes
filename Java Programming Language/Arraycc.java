import java.util.Scanner;

public class Arraycc {
    public static void main(String args[]) {
        // Creating an array
        // int mark[] = new int[50];
        // int numbers[] = { 1, 2, 3 };
        // String fruits[] = { "Apple" };


        // Input of an array
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();
        // marks[0] = sc.nextInt();// phy
        // marks[1] = sc.nextInt();// chem
        // marks[2] = sc.nextInt();// math

        // System.out.println("phy : " + marks[0]);
        // System.out.println("chem : " + marks[1]);
        // System.out.println("math : " + marks[2]);

        // // marks[2] = 100;
        // marks[2] = marks[2] + 1;
        // System.out.println("math : " + marks[2]);

        // float percent = (marks[0]+marks[1]+marks[2]/3);
        // System.out.println(percent + "%");

        System.out.println("Length of array = "+ marks.length );
    }
}
