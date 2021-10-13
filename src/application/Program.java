package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		System.out.println(); 
		System.out.print("Enter the number of tax payers: ");
		int numberPayers = sc.nextInt();
		for (int i=0; i<numberPayers; i++) {
			System.out.println("Tax payer#"+(i+1)+" data:");
			System.out.print("Indidual or company (i/c)? ");
			char typePayer = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			if (typePayer == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum = 0.0;
		for (TaxPayer tp : list) {
			sum+= tp.tax();
			System.out.println(tp);
		}
		System.out.printf("TOTAL TAXES: $ %.2f",sum);
		System.out.println();
		sc.close();

	}

}
