import java.util.Scanner;
public class IT24101052Lab7Q1A
{
    public static void main(String[] args)
    {
        int mark1,mark2,mark3,mark4;
        double average;
        char grade; 

        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks for four subjects:");
        System.out.print("Enter subject marks 1:");
        mark1= input.nextInt();
        System.out.print("Enter subject marks 2:");
        mark2= input.nextInt();
        System.out.print("Enter subject marks 3:");
        mark3= input.nextInt();
        System.out.print("Enter subject marks 4:");
        mark4= input.nextInt();
        System.out.println();
        average = (mark1 + mark2 + mark3 + mark4) /4;
        System.out.println("Average is :" + average);
        if((average<=100)&&(average>=75))
        {
            System.out.println("Overall grade is: Distinction");
        }
        else if((average<75)&&(average>=50))
        {
            System.out.println("Overall grade is: Credit");
        }
        else if((average<50)&&(average>=0))
        {
            System.out.println("Overall grade is: Fail");
        }
    }
}