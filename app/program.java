package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import app.entities.Individual;
import app.entities.LegalEntity;
import app.entities.Person;

public class program {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Person> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Tax payer #1 data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            if(ch == 'i'){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome , healthExpenditures));
            }else{
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numerEmployees = sc.nextInt();
                list.add(new LegalEntity(name, anualIncome, numerEmployees));
            }
        }


        sc.close();
    }
}
