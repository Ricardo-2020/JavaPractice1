import java.util.Scanner;

public class part2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter Grade: ");
        String gradeGiven = input.nextLine();
        int grade = Integer.parseInt(gradeGiven);

        if (grade >= 90) {
            System.out.println("Got an A");
        }
        if (grade < 90 && grade >= 80) {
            System.out.println("Got an B");
        }
        if (grade < 80 && grade >= 70) {
            System.out.println("Got an C");
        }
        if (grade < 70 && grade >= 60) {
            System.out.println("Got an D");
        }
        if (grade < 60) {
            System.out.println("Got an F - OOF");
        }
        int i = 1;
        switch (grade) {
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
            System.out.println("Got an F - OOF");
                break;
        }





        input.close();
    }
}