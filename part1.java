import java.util.Scanner;

public class part1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter Grade: ");
        String gradeGiven = input.nextLine();
        int grade = Integer.parseInt(gradeGiven);

        if (grade >= 90) {
            System.out.println("Got an A");
        }
        else if (grade < 90 && grade >= 80) {
            System.out.println("Got an B");
        }
        else if (grade < 80 && grade >= 70) {
            System.out.println("Got an C");
        }
        else if (grade < 70 && grade >= 60) {
            System.out.println("Got an D");
        }
        else if (grade < 60) {
            System.out.println("Got an F - OOF");
        }
        input.close();
    }
}