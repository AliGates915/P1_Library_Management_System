package P1_Library_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

class LibrarySystem {
    ArrayList<String> listOfBooks = new ArrayList<>();
    public void welcome(){
        System.out.println("     ***********************");
        System.out.println("**** Welcome to Govt. College Library ****");
        System.out.println("     ***********************");
    }
    public void facilities() {
        System.out.print("""
                Please Choose an Option :
                1. List All The Book
                2. Request a Book
                3. Add/Donate a Book
                4. Return Book
                5. Exit The Library
                """);
    }
    public void addBook(){
        listOfBooks.add("java");
        listOfBooks.add("Database");
        listOfBooks.add("c++");
        listOfBooks.add("java2");
        listOfBooks.add("SQl");
    }
    public void takeBooks(String book_name){
        String book = book_name.toLowerCase();
        listOfBooks.remove(book);
    }
    public void bookName_Author(){
        System.out.println("Available books : ");
        System.out.println(listOfBooks);
        System.out.println();
    }

    public void returnBook(String book_name){
        String book = book_name.toLowerCase();
        listOfBooks.add(book);
    }
}
public class Library_Management
{
    public static void main(String[] args) {

        LibrarySystem l = new LibrarySystem();
        l.welcome();
        l.facilities();
        l.addBook();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Choose Option : ");
            try{
                int option = sc.nextInt();
                if (option == 1)
                {
                    l.bookName_Author();
                    l.facilities();
                }
                else if (option == 2){
                    try {
                        l.bookName_Author();
                        System.out.print("Enter Name of Book for Issued : ");
                        String bookname = sc.next();
                        String book = bookname.toLowerCase();
                        try{
                            l.takeBooks(book);
                            System.out.println("You successfully issued book!");
                        }

                        catch (Exception e){
                            System.out.println("Not Available!");
                        }
                        l.facilities();
                    }
                    catch (Exception e){
                        System.out.println("Please Enter Valid Input!");
                    }
                }
                else if (option == 3){
                    l.bookName_Author();
                    System.out.print("Enter Name of Book for Addition : ");
                    try{
                        String bookname = sc.next();
                        String book = bookname.toLowerCase();
                        l.returnBook(book);
                        System.out.println("You successfully added a book to Library");
                    }
                    catch (Exception e){
                        System.out.println("Please Enter Valid Input!");
                    }
                    finally {
                        l.facilities();
                    }
                }
                else if (option == 4)
                {
                    l.bookName_Author();
                    System.out.print("Enter Name of Book for Returned: ");
                    try{
                        String bookname = sc.next();
                        String book = bookname.toLowerCase();
                        l.returnBook(book);
                        System.out.println("You successfully returned a book to Library");
                    }
                    catch (Exception e){
                        System.out.println("Please Enter Valid Input!");
                    }
                    finally {
                        l.facilities();
                    }
                }
                else {
                    System.out.println("Thank You for using this library. Have A Nice Day!");
                    System.out.println("****Coder: Ali G@te$!****");
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Please Enter Valid Input!");
                System.out.println("Only Single Digit Enter...");
                break;
            }
        }
    }
}
