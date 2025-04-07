package org.lenny.behavioural.strategy;


/**
 * Defines a family of algorithms, encapsulates each one, and
 *  makes them interchangeable without altering the client code.
 *
 * Examples:
 *  > Payment Methods – Switches between strategies like Credit Card, PayPal, or Bank Transfer during checkout.
 *  > Sorting or Filtering – Applies different sorting/filtering logic dynamically based on user selection or data type.
 *  > Authentication Strategies – Allows swapping between LDAP, OAuth, or JWT-based authentication mechanisms.
 *  > Discount Calculation – Applies various pricing strategies like seasonal, percentage, or bulk discounts.
 *  > File Compression – Supports different compression strategies (e.g., ZIP, RAR, GZIP) for export or storage.
 * **/
public class Client {
    public static void main(String[] args) {
        LowercaseStrategy str1 = new LowercaseStrategy();
        UppercaseStrategy str2 = new UppercaseStrategy();
        RandomCaseStrategy str3 = new RandomCaseStrategy();
        String input = "LOREM ipsum DOLOR sit amet";

        Executor executor = new Executor(str1);
        executor.printString(input);

        executor.setStrategy(str2);
        executor.printString(input);

        executor.setStrategy(str3);
        executor.printString(input);
    }
}
