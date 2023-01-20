/*  Dominic Deibert
   GPA Calculator
   Started 1/13/23
*/


import java.util.Scanner;
import java.util.ArrayList;

public class gpa
{
    public static void main(String[] args)
    {


        Scanner in = new Scanner(System.in);


        System.out.println("How many classes did you have this semester? ");
        int ClassNum = in.nextInt();


        int TotalGrade = 0;
        for (int i = 1; i <= ClassNum; i++)
        {
            System.out.println("Is class " + i + " an AP class? (y/n): ");
            char APvalue = in.next().charAt(0);
            if (APvalue == 'y')
            {
                System.out.println("Enter the letter grade for class " + i + ": ");
                char Grade = in.next().charAt(0);
                if (Grade == 'A')
                    TotalGrade += 5;
                else if (Grade == 'B')
                    TotalGrade += 4;
                else if (Grade == 'C')
                    TotalGrade += 3;
                else if (Grade == 'D')
                    TotalGrade += 2;
                else
                    TotalGrade += 0;
            }
            else if (APvalue == 'n')
            {
                System.out.println("Enter the letter grade for class " + i + ": ");
                char Grade = in.next().charAt(0);
                if (Grade == 'A')
                    TotalGrade += 4;
                else if (Grade == 'B')
                    TotalGrade += 3;
                else if (Grade == 'C')
                    TotalGrade += 2;
                else if (Grade == 'D')
                    TotalGrade += 1;
                else
                    TotalGrade += 0;
            }
        }
        System.out.println("Total Grade: " + TotalGrade);
        System.out.println("GPA: " + (TotalGrade/ClassNum));
        int FinalGPA = TotalGrade / ClassNum;
        System.out.println(FinalGPA);
    }
}
