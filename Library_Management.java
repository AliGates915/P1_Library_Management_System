package AliGates;
import java.util.ArrayList;
import java.util.Scanner;
class LibrarySystem {
    ArrayList<String> listOfBooks = new ArrayList<>();
    public void welcome(){
        System.out.println("     ***********************");
        System.out.println("**** Welcome to Govt. College Library ****");
        System.out.println("     ***********************");
    }
    public void facilities()
    {
        System.out.print("""
                Please Choose an Option (1-4) :
                1. List All The Books
                2. Request/Borrow a Book
                3. Add/Donate a Book
                4. Exit The Library
                """);
        }
    public void facilities2()
    {
        System.out.print("""
                Please Choose an Option (1-5):
                1. List All The Books
                2. Request/Borrow a Book
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
    public int Roll_no;
    public void student_info()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll_no from (901 - 928) ");
        Roll_no = sc.nextInt();
        switch (Roll_no)
        {
            case 901:
                System.out.println("Roll_No 901 Student is Aneela");
                break;
            case 902:
                System.out.println("Roll_No 902 Student is Amna");
                break;
            case 903:
                System.out.println("Roll_No 903 Student is Saman");
                break;
            case 904:
                System.out.println("Roll_No 904 Student is Arooj");
                break;
            case 905:
                System.out.println("Roll_No 905 Student is Muzamil");
                break;
            case 906:
                System.out.println("Roll_No 906 Student is Nimra");
                break;
            case 907:
                System.out.println("Roll_No 907 Student is Sana");
                break;
            case 908:
                System.out.println("Roll_No 908 Student is Nisha");
                break;
            case 909:
                System.out.println("Roll_No 909 Student is Habiba");
                break;
            case 910:
                System.out.println("Roll_No 910 Student is Romina Boxer");
                break;
            case 911:
                System.out.println("Roll_No 911 Student is Touseeq");
                break;
            case 912:
                System.out.println("Roll_No 912 Student is Ahsan");
                break;
            case 913:
                System.out.println("Roll_No 913 Student is Waleed");
                break;
            case 914:
                System.out.println("Roll_No 914 Student is Zahan Jaib");
                break;
            case 915:
                System.out.println("Roll_No 915 Student is Ali Gates");
                break;
            case 917:
                System.out.println("Roll_No 917 Student is Hussnain");
                break;
            case 918:
                System.out.println("Roll_No 918 Student is Wajid");
                break;
            case 920:
                System.out.println("Roll_No 920 Student is Rao Rashid");
                break;
            case 921:
                System.out.println("Roll_No 921 Student is zahid");
                break;
            case 922:
                System.out.println("Roll_No 922 Student is Adil");
                break;
            case 928:
                System.out.println("Roll_No 928 Student is Usman");
                break;
            default :
                System.out.println("Invalid Enter Roll_Number " +Roll_no);
        }
    }
    public void takeBooks(String book_name)
    {
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
    // This is Main
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
                        l.student_info();
                        if(l.Roll_no >= 900  &&  l.Roll_no != 919 || l.Roll_no == 928)
                        {
                            l.bookName_Author();
                            System.out.print("Enter Name of Book for Issued : ");
                            String bookname = sc.next();
                            String book = bookname.toLowerCase();
                            try{
                                l.takeBooks(book);
                                System.out.println("You successfully issued book from Roll_no. : " +l.Roll_no);
                             }
                            catch (Exception e){
                                System.out.println("Not Available!");
                            }
                            l.facilities2();
                        }
                    }
                    catch (Exception e){
                        System.out.println("Please Enter Valid Input!");
                    }
                }
                else if (option == 3){
                    l.student_info();
                    if(l.Roll_no >= 900  || l.Roll_no == 928)
                    {
                        l.bookName_Author();
                        System.out.print("Enter Name of Book for Addition : ");
                        try{
                            String bookname = sc.next();
                            String book = bookname.toLowerCase();
                            l.returnBook(book);
                            System.out.println("You successfully added a book to Library from Roll_no. : " +l.Roll_no);
                        }
                        catch (Exception e){
                            System.out.println("Please Enter Valid Input!");
                        }
                        finally {
                            l.facilities2();
                        }
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
                        System.out.println("You successfully returned a book to Library from Roll_no. : " +l.Roll_no);
                    }
                    catch (Exception e){
                        System.out.println("Please Enter Valid Input!");
                    }
                    finally {
                        l.facilities2();
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
