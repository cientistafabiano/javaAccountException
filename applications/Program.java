package applications;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Entre com os dados da conta: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Valor inicial da conta: ");
			double balance = sc.nextDouble();
			System.out.print("Saque limite: ");
			double withDrawLimit = sc.nextDouble();			
			System.out.print("Entre com a quantia(amount) para saque: ");
			double amount = sc.nextDouble();
			Account conta = new Account(number,holder,balance,withDrawLimit);
			conta.withDraw(amount);
			System.out.print("New balance: " + conta.getBalance());
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}