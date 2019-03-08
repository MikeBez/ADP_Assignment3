package za.ac.cput.projects.Assignment3;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner input = new Scanner(System.in);
    public static void main( String[] args )
    {
        FailedTest firstName = new FailedTest();

        System.out.println("Enter name: ");
        String name = input.next();

        System.out.println( "Name is: " + firstName.fname(name) );
    }
}
