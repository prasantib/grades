import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an exam score:");
        int score = scan.nextInt();
        int count = 0;
        String input = "99";
        int grade = Integer.parseInt(input);
        String answer;
        answer = "y";
        while (answer.equals("y")) {
            count++;
            if (score >= 90 && score <= 100) {
                System.out.println("Good job. Your grade is A");}
            else if (score >= 80 && score <= 89) {
                System.out.println("Good job. Your grade is B");}
            else if (score >= 70 && score <= 79) {
                System.out.println("Good job. Your grade is C");}
            else if (score >= 60 && score <= 69) {
                System.out.println("Good job. Your grade is D");}
            else if (score >= 0 && score <= 59) {
                System.out.println("Good job. Your grade is E");}
            System.out.println("Do you want to enter another score? ");
            answer = scan.next();
        }

    }
}