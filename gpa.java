/*  Dominic Deibert
   GPA Calculator
   Started 1/13/23
*/

//Comments Received: Lines 18 - 61+63 should be in a function

import java.util.Scanner;
public class gpa
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("How many classes did you have this semester? ");
        int ClassNum = in.nextInt();
        int[] grades;
        grades = new int[ClassNum];


        for (int i = 1; i <= ClassNum; i++)
        {
            System.out.println("Is class " + i + " an AP class? (y/n): ");
            char APvalue = in.next().charAt(0);
            if (APvalue == 'y')
            {
                System.out.println("Enter the letter grade for class " + i + ": ");
                char Grade = in.next().charAt(0);
                if (Grade == 'A')
                    grades[i - 1] = 5;
                else if (Grade == 'B')
                    grades[i - 1] = 4;
                else if (Grade == 'C')
                    grades[i - 1] = 3;
                else if (Grade == 'D')
                    grades[i - 1] = 2;
                else
                    grades[i - 1] = 0;
            }
            else if (APvalue == 'n')
            {
                System.out.println("Enter the letter grade for class " + i + ": ");
                char Grade = in.next().charAt(0);
                if (Grade == 'A')
                    grades[i - 1] = 4;
                else if (Grade == 'B')
                    grades[i - 1] = 3;
                else if (Grade == 'C')
                    grades[i - 1] = 2;
                else if (Grade == 'D')
                    grades[i - 1] = 1;
                else
                    grades[i - 1] = 0;
            }
        }
        int TotalGrade = 0;
        for (int i = 0; i < ClassNum; i++)
        {
            TotalGrade += grades[i];
        }
        System.out.println("Total Grade: " + TotalGrade);
        int FinalGPA = TotalGrade / ClassNum;
        System.out.println(FinalGPA);
    }
}
