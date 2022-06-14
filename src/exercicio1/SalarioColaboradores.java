package exercicio1;

import java.util.Scanner;

public class SalarioColaboradores {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int aumento = 0;
        double salario = 0d;

        System.out.println("Salario: ");
        double salarioInicial = teclado.nextDouble();


        if (salarioInicial <= 280) {
            aumento = 20;
            salario= salarioInicial + (0.2 *salarioInicial);

        } else if (salarioInicial > 280 && salarioInicial <= 700) {
            aumento = 15;
            salario= salarioInicial + (0.15 *salarioInicial);

        } else if (salarioInicial > 700 && salarioInicial <= 1500) {
            aumento = 10;
            salario= salarioInicial + (0.1 *salarioInicial);
        } else {
            aumento = 5;
            salario= salarioInicial + (0.05 *salarioInicial);
        }


        System.out.println("Salario antes do reajuste: "+salarioInicial);
        System.out.println("Aumento aplicado: " + aumento);
        System.out.println("Valor do aumento: " + (salario - salarioInicial));
        System.out.println("Salario após aumento: " + salario);

    }
}
