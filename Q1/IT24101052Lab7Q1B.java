import java.util.Scanner;
public class IT24101052Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int student;
        double average;
        for (student = 1; student <= 3; student++) 
        {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");
            String[] marksInput = scanner.nextLine().split(" ");
            int[] marks = new int[4];
            int sum = 0;
            for (int i = 0; i < 4; i++) 
            {
                marks[i] = Integer.parseInt(marksInput[i]);
            }
            for (int mark : marks) 
            {
                sum += mark;
            }
            average = (double)sum / 4;
            String grade;

            if (average >= 75) 
            {
                grade = "Distinction";
            } else if (average >= 50) 
            {
                grade = "Credit";
            } else 
            {
                grade = "Fail";
            }
            System.out.println("Average is: " + average);
            System.out.println("Overall Grade is: " + grade);
            System.out.println("");
        }
    }
}