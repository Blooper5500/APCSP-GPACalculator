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
        ArrayList<Integer> grades = new ArrayList<Integer>();
        //I know this wasn't how I was shown to create a list in class, but I forgot and when I looked it up this is how I was shown to create one by the internet.


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
                    grades.add(5);
                else if (Grade == 'B')
                    grades.add(4);
                else if (Grade == 'C')
                    grades.add(3);
                else if (Grade == 'D')
                    grades.add(2);
                else
                    grades.add(0);
            }
            else if (APvalue == 'n')
            {
                System.out.println("Enter the letter grade for class " + i + ": ");
                char Grade = in.next().charAt(0);
                if (Grade == 'A')
                    grades.add(4);
                else if (Grade == 'B')
                    grades.add(3);
                else if (Grade == 'C')
                    grades.add(2);
                else if (Grade == 'D')
                    grades.add(1);
                else
                    grades.add(0);
            }
        }
        /* Note: All of this code is useless at the moment.
        I have a list but no idea how to find the sum or average of it.
        It's 11pm, I'm tired and want to go to bed :(


        System.out.println("Total Grade: " + TotalGrade);
        System.out.println("GPA: " + (TotalGrade/ClassNum));
        int FinalGPA = TotalGrade / ClassNum;
        System.out.println(FinalGPA);
        */
        System.out.println(grades);
    }
}
