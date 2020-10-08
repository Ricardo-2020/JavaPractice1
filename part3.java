import java.util.Scanner;

public class part3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter Grade: ");
        String gradeGiven = input.nextLine();
        int grade = Integer.parseInt(gradeGiven);

        // if (grade >= 90) {
        //     System.out.println("Got an A");
        // }
        // if (grade < 90 && grade >= 80) {
        //     System.out.println("Got an B");
        // }
        // if (grade < 80 && grade >= 70) {
        //     System.out.println("Got an C");
        // }
        // if (grade < 70 && grade >= 60) {
        //     System.out.println("Got an D");
        // }
        // if (grade < 60) {
        //     System.out.println("Got an F - OOF");
        // }

        if (grade <= 90) {
            if (grade <= 80) {
                if (grade <= 60) {
                    if (grade < 60) {
                        System.out.println("Got an F - OOF");
                    }
                    else {
                        System.out.println("Got an D");
                    }
                }
                else {
                    System.out.println("Got an C");
                }
            }
            else {
                System.out.println("Got an B");
            }
        }
        else {
            System.out.println("Got an A");
        }
    input.close();
    }
    
}