package Java;
import java.util.Scanner;
public class Student_Grade_Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of Subject: ");
        int sub = sc.nextInt();
        int sum = 0;
        int i;
        boolean fail = false;
        for(i=1 ; i<=sub ; i++)
        {
            int mark;
            do
            {
                System.out.print("Enter marks you obtain " +i+ "= ");
                mark = sc.nextInt();
                if (mark < 0 || mark > 100)
                {
                    System.out.println("Marks must be between 0 and 100.");
                }
            }while(mark < 0 || mark > 100);
            sum += mark;
            if (mark < 33) 
            {
                fail = true;
            }
        }
        float percentage = sum/sub;
        char grade;
        
        if(percentage >= 90)
        {
            grade = 'A';
        }
        else if(percentage>=80)
        {
            grade = 'B';
        }
        else if(percentage>=65)
        {
            grade = 'C';
        }
        else if(percentage>= 50)
        {
            grade = 'D';
        }
        else if(percentage>=35)
        {
            grade = 'E';
        }
        else
        {
            System.out.println("You are fail.!");
            grade = 'F';
        }

        if (fail)
        {
            System.out.println("Your Result: Fail. \nYou got less marks in some subject");
        }

        else
        {
            System.out.println("\n\"Displaying Your Result\"");
            System.out.println("Total Marks: " + sum);
            System.out.println("Average Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);
        }
       
        sc.close();
    }
}
