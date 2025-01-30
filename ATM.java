// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class ATM {
   public ATM() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      double var2 = 1000.0;

      int var4;
      do {
         System.out.println("Welcome to the ATM!");
         System.out.println("1. Check Balance");
         System.out.println("2. Deposit Money");
         System.out.println("3. Withdraw Money");
         System.out.println("4. Exit");
         System.out.print("Please select an option: ");
         var4 = var1.nextInt();
         switch (var4) {
            case 1:
               System.out.println("Your current balance is: $" + var2);
               break;
            case 2:
               System.out.print("Enter amount to deposit: $");
               double var5 = var1.nextDouble();
               var2 += var5;
               System.out.println("You have successfully deposited: $" + var5);
               break;
            case 3:
               System.out.print("Enter amount to withdraw: $");
               double var7 = var1.nextDouble();
               if (var7 <= var2) {
                  var2 -= var7;
                  System.out.println("You have successfully withdrawn: $" + var7);
               } else {
                  System.out.println("Insufficient balance!");
               }
               break;
            case 4:
               System.out.println("Thank you for using the ATM. Goodbye!");
               break;
            default:
               System.out.println("Invalid option! Please try again.");
         }

         System.out.println();
      } while(var4 != 4);

      var1.close();
   }
}
