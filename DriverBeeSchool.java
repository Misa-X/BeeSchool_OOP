package week4;
import java.util.Scanner;

public class DriverBeeSchool {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        beeSchool bSchool = new beeSchool();

        System.out.println("Bee School");
        System.out.println("========================");
        System.out.println("1. Insert New Subject");
        System.out.println("2. View All Subject");
        System.out.println("3. Insert New Student");
        System.out.println("4. View All Student");
        System.out.println("5. Insert Student Score");
        System.out.println("6. View Student Score");
        System.out.println("7. Exit");
        System.out.println("========================");
        int menuChoice = input.nextInt();

        if(menuChoice == 1) {
            bSchool.insertSubject();

        }
        if(menuChoice == 2) {
            bSchool.viewSubject();
        }
        if(menuChoice == 3) {
            bSchool.insertStudent();
        }
        if(menuChoice == 4) {
            bSchool.viewStudent();
        }
        if(menuChoice == 5) {
            bSchool.insertStudentScore();
        }
        if(menuChoice == 6) {
            bSchool.viewStudentScore();
        }
        if(menuChoice == 7) {
            System.exit(0);
        }

    }

}
