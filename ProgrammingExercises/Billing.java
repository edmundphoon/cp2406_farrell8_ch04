import java.util.Scanner;

// This class uses a FixDebugBox class to instantiate two Box objects
public class Billing {
   public static void main(String args[]) {

      double priceOfYourBook;
      Scanner inputPrice = new Scanner(System.in);
      System.out.println("Enter the price of the photo book ordered: ");
      priceOfYourBook = inputPrice.nextDouble();

      int quantityOrdered;
      Scanner inputQuantity = new Scanner(System.in);
      System.out.println("Enter your last name: ");
      quantityOrdered = inputQuantity.nextInt();

      double couponOrdered;
      Scanner inputCoupon = new Scanner(System.in);
      System.out.println("Enter your last name: ");
      couponOrdered = inputCoupon.nextDouble();

      double totalPrice;
      totalPrice = computeBill(priceOfYourBook);
      System.out.println("The total cost for a photobook worth $" + priceOfYourBook + " is " + totalPrice);

      totalPrice = computeBill(priceOfYourBook, quantityOrdered);
      System.out.println("The total cost for " + quantityOrdered + " photobooks worth $" + priceOfYourBook + " is " + totalPrice);

      totalPrice = computeBill(priceOfYourBook, quantityOrdered, couponOrdered);
      System.out.println("The total cost for " + quantityOrdered + " photobooks worth $" + priceOfYourBook + " with a $" + couponOrdered + " is " + totalPrice);
   }

   public static double computeBill(double priceOfBook) {
      double tax = 0.08 * priceOfBook;
      double total = priceOfBook + tax;
      return total;
   }

   public static double computeBill(double priceOfBook, int quantity) {
      double numOfBook = priceOfBook * quantity;
      double tax = 0.08 * numOfBook;
      double total = numOfBook + tax;
      return total;
   }

   public static double computeBill(double priceOfBook, int quantity, double couponValue) {
      double numOfBook = priceOfBook * quantity;
      double withCoupon = numOfBook - couponValue;
      double tax = 0.08 * withCoupon;
      double total = withCoupon + tax;
      return total;
   }
}
