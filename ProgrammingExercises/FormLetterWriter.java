import java.util.Scanner;

// This class uses a FixDebugBox class to instantiate two Box objects
public class FormLetterWriter {
   public static void main(String args[]) {

      String firstName;
      Scanner inputFirstName = new Scanner(System.in);
      System.out.println("Enter your first name: ");
      firstName = inputFirstName.nextLine();

      String lastName;
      Scanner inputLastName = new Scanner(System.in);
      System.out.println("Enter your last name: ");
      lastName = inputLastName.nextLine();

      String lastName2;
      Scanner inputLastName2 = new Scanner(System.in);
      System.out.println("Enter your last name: ");
      lastName2 = inputLastName2.nextLine();

      displaySalutation(lastName);
      displaySalutation(firstName, lastName2);

   }


   public static void displaySalutation(String lastName) {
      System.out.println("Dear Mr. or Ms. " + lastName);
      System.out.println("Thank you for your recent order.");
   }

   public static void displaySalutation(String firstName, String lastName) {
      System.out.println("Dear " + firstName + " " + lastName);
      System.out.println("Thank you for your recent order.");
   }
}
