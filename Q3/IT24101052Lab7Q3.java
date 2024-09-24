import java.util.Scanner;
public class IT24101052Lab7Q3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        final int NUM_CUSTOMERS = 5;
        double totalBill;
        double discount;
        double amountToPay;
        for (int i = 1; i <= NUM_CUSTOMERS; i++) 
        {
            System.out.println("Customer" +" " +i);
            System.out.print("Enter total bill amount :" );
            totalBill = scanner.nextDouble();
            System.out.print("Enter mode of payment (C for Cash, O for Other): ");
            char paymentMode = scanner.next().charAt(0);
            paymentMode = Character.toUpperCase(paymentMode); 
            switch (paymentMode) 
            {
                case 'C':
                    discount = totalBill * 0.05;
                    System.out.println("Discount is:"+ discount);
                    amountToPay = totalBill - discount;
                    System.out.println("Amount to be paid:"+ amountToPay);
                    break;
                case 'O':
                    amountToPay = totalBill;
                    System.out.println("No Discount applicable");
                    System.out.println("Amount to be paid:"+ amountToPay);
                    break;
                default:
                    System.out.println("Payment Mode is Not Valid");
                    i--; 
                    break;
            }
            System.out.println();
        }

    }
}