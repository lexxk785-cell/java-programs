/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overduecharge;

/**
 *
 * @author K63-10969-2024 : Alex Maina.
 */
       import java.time.LocalDate;
       import java.time.temporal.ChronoUnit;
       import java.util.Scanner;

       public class Overduecharge {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        Scanner input = new Scanner(System.in);

        // i. Get inputs
        System.out.print("Enter book ID: ");
        String bookID = input.nextLine();

        System.out.print("Enter due date (YYYY-MM-DD): ");
        LocalDate dueDate = LocalDate.parse(input.nextLine());

        System.out.print("Enter return date (YYYY-MM-DD): ");
        LocalDate returnDate = LocalDate.parse(input.nextLine());

        // ii. Calculate days overdue
        long daysOverdue = ChronoUnit.DAYS.between(dueDate, returnDate);

        // iii. Determine fine rate and calculate fine
        double fineRate = 0;
        double fineAmount = 0;

        if (daysOverdue > 0) {
            if (daysOverdue <= 7) {
                fineRate = 20; // Ksh. 20 per day
            } else if (daysOverdue <= 14) {
                fineRate =50; // Ksh. 50 per day
            } else { // 15 days or more
                fineRate = 100; // Ksh. 100 per day
            }
            fineAmount = fineRate * daysOverdue;
        }

        // iv. Display the output
        System.out.println("\n--- Library Fine Details ---");
        System.out.println("bookID: " + bookID);
        System.out.println("dueDate: " + dueDate);
        System.out.println("returnDate: " + returnDate);
        System.out.println("daysOverdue: " + daysOverdue);
        System.out.println("fineRate: Ksh. " + fineRate);
        System.out.println("fineAmount: Ksh. " + fineAmount);

        input.close();
    }
}
    
    

