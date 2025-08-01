package estruturaRepetitiva.validacaoExercicios;

import java.util.Scanner;

public class verifTipoCombMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite o tipo de combustível abastecido (1. Àlcool; 2. Gasolina; 3. Diesel; 4. Fim): ");
        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool += 1;
            }
            else if (tipo == 2) {
                gasolina += 1;
            }
            else if (tipo == 3) {
                diesel += 1;
            }

           tipo = sc.nextInt();

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("\nQuantidade de clientes que abasteceram cada tipo de combustível: \n");
        System.out.println("Àlcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();

    }
}
