package POO.application.encapsulamento;

import POO.entities.encapsulamento.Account;

import java.util.Locale;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account; //Declarar a variável, pelo qual o objeto será instanciado.

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine(); // Consome a nova linha deixada por nextInt()
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit); //Conta é instanciada com o construtor de três argumentos.
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue); //Esta operação realiza o depósito na conta — conta.metodo(variavel).
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.widhdr(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();

    }
}
