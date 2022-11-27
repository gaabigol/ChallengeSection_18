package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero:");
		int number = sc.nextInt();

		System.out.println("");
		System.out.print("Data(dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("valor do contrato: ");
		double contractValue = sc.nextDouble();

		Contract obj = new Contract(number, date, contractValue);

		System.out.print("Entre com o numero de parcelas: ");
		int numberinstallments = sc.nextInt();
		System.out.println("Parcelas: ");

		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(obj, numberinstallments);

		for (Installment installments : obj.getInstallments()) {
			System.out.println(installments);
		}

		sc.close();
	}

}
