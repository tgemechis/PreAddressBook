package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// write your code here

        ArrayList<Person> addressBook = new ArrayList<>();



        Person individual; //create an object of type Person
        Scanner scan = new Scanner(System.in);

        for(int i=1; i <= 5; i++) {

            individual = new Person();


            System.out.println("Please enter your first name ");
            individual.setFirstName(scan.nextLine());


            System.out.println("Please enter your last name ");
            individual.setLastName(scan.nextLine());


            System.out.println("Please enter address ");
            individual.setAddress(scan.nextLine());


            System.out.println("Please enter phone ");
            individual.setPhone(scan.nextLine());

            System.out.println("Enter email ");
            individual.setEmail(scan.nextLine());

            addressBook.add(individual); //adding an individual to the arraylist


        }

       for(Person eachPerson: addressBook){
           System.out.println("First names are " + eachPerson.getFirstName() );

       }
    }


}
