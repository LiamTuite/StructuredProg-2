//Exercise2.java
//
// JAVA!
//
//

/*This programme declares variables of different types for storing the
 *details of a book, and then gets the user to input values for the variables*/
 
 import java.util.Scanner;
 
 public class Exercise2 {
         public static void main(String args[])
              {
                  String title, author;
                  int pages, yearPub;  
                  float price;

Scanner input = new Scanner(System.in);

System.out.print("Please enter the name of the book: ");
title = input.nextLine();

System.out.print("Please enter the name of the author: ");
author = input.nextLine();

System.out.print("Please enter the no. of pages: ");
pages = input.nextInt();

System.out.print("Please enter the year published: ");
yearPub = input.nextInt();

System.out.print("Please enter the price of the book; ");
price = input.nextFloat();

System.out.println("\n\n=====Book Details=====\nTitle: " + title 
                    + "\nAuthor: " + author + "\nNo. of Pages: " + pages
                    + "\nYear Published: " + yearPub + "\nPrice: EUR" + price); 
              }
              
 }