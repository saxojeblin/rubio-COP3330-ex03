package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        String quote;
        String name;
        char marks  = '"';

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("What is the quote? ");
        quote = sc2.nextLine();

        System.out.print("Who said it? ");
        name = sc.nextLine();

        System.out.println(name + " says, " + marks + quote + marks);

    }
}
