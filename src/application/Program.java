package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		// Reading the data
		System.out.println("Enter the account data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Initial balance: ");
		Double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		// instantiation		
		Account account = new Account(number, name, initialBalance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter the amount for withdraw: ");
		Double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println( account);
		}
		
		 catch(DomainException e) {
			 System.out.println("Withdraw error: " + e.getMessage());
			 		 }
		
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}

}
