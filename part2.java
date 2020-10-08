import java.util.Scanner;

public class part2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter Grade: ");
        String gradeGiven = input.nextLine();
        int grade = Integer.parseInt(gradeGiven);
        int i = 0;

        if (grade >= 90) {
            i = 1;
        }
        if (grade < 90 && grade >= 80) {
            i = 2;
        }
        if (grade < 80 && grade >= 70) {
            i = 3;
        }
        if (grade < 70 && grade >= 60) {
            i = 4;
        }
        if (grade < 60) {
            i = 5;
        }
        
        switch (i) {
            case 1:
                System.out.println("Got an A");
                break;
            case 2:
                System.out.println("Got an B");
                break;
            case 3:
                System.out.println("Got an C");
                break;
            case 4:
                System.out.println("Got an D");
                break;  
            default:
            System.out.println("Got an F -> OOF");
                break;
        }
        input.close();
    }
}