package exercicio3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IdadePesoAltura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<Integer> listaIdades = new ArrayList<>();
        List<Float> listaPesos = new ArrayList<>();
        List<Float> listaAlturas = new ArrayList<>();
        float somaIdade = 0;
        int numeroPessoa = 10;
        int cont = 0;
        int cont2 = 0;

        for (int i = 0; i < numeroPessoa; i++) {
            System.out.println("Idade: ");
            int idade = teclado.nextInt();
            somaIdade += idade;
            listaIdades.add(idade);

            System.out.println("Peso: ");
            float peso = teclado.nextFloat();
            listaPesos.add(peso);

            System.out.println("Altura: ");
            float altura = teclado.nextFloat();
            listaAlturas.add(altura);

            if (peso > 90 && altura < 1.50) cont++;
            if (altura > 1.90 && idade > 10 && idade < 30) cont2++;
        }

        System.out.println("Media das idade: " + somaIdade / listaIdades.size());
        System.out.println("Quantidade de pessoas com peso superior a 90 quilos e altura inferior\n" +
                "a 1,50" + cont);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as\n" +
                "pessoas que medem mais de 1,90" + (cont2 * 100) / 10);
    }

}
