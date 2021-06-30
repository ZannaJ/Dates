package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Date date = new Date(); // Date includes all the data surrounding that date.
        // including the day, month, year, timezone
        // while the localdate and localtime classes only show what is needed.
//        System.out.println("David went out on " + LocalDate.now());


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: "); // This is a prompt
        // print:  it doesn't add escape characters after your print statement.
        // println: adds a \n(next line) at the end of your print statement.
        String name = scanner.nextLine(); // collect the value the user enters


        System.out.println("The name entered by the user is " + name); // output the name interactively

    }
}