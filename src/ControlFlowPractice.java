
import java.util.*;
public class ControlFlowPractice {

    public static void main(String[] args) {
        // simple if statement
        int x = 12;
        int y = 10;
        if (x + y > 20) {
            System.out.println("x + y is greater than 20");

            // if else

            int x = 10;
            int y = 5;
            if (x + y < 10) {
                System.out.println("x + y is less than 10");
            } else {
                System.out.println("x + y is greater than 14");

                // if else if statement
                String city = "Delhi";
                if (city == "Meerut") {
                    System.out.println("city is Meerut");

                } else if (city == "Noida") {
                    System.out.println("city is Noida");
                } else if (city == "Agra") {
                    System.out.println("city is Agra");
                } else {
                    System.out.println(city);


                    // Switch statements

                    //  Loop statements
                    // for loop

                    int sum = 0;
                    for (int i = 1; i <= 10; i++) {
                        sum = sum + i;
                    }
                    System.out.println("The sum of the first 10 numbers is " + sum);
                    //Enhanced for loop with Array or collection

                    String[] names = {"Abdi", "Ibrahim", "Adow"};
                    System.out.println("Printing the content of the Array names:\n");

                    for (String name : names) {
                        System.out.println(name);
                        //While loop
                        int i = 0;
                        System.out.println("Printing the first 10 even numbers \n");

                        while (i <= 10) {
                            System.out.println(i);
                            i = i + 2;

                            //do while loop
                            int i = 0;
                            System.out.println("Printing the first 10 even numbers \n");
                            do {
                                System.out.println(i);
                                i = i + 2;
                            } while (i <= 10);

        System.out.println("Andi");

                        }
                    }
                }
            }
        }
    }
}


















