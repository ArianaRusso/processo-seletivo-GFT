package exercicio2;


import java.util.Scanner;

public class MenuOpcoes {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float nota1, nota2, nota3;
        int peso1, peso2, peso3;

        boolean naoSair= true;

        while (naoSair) {

            System.out.println("Bem vindo ao sistema Escolha a opção desejada");
            System.out.println("1- Média aritmética");
            System.out.println("2- Média ponderada");
            System.out.println("3- Sair");
            int opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Nota 1: ");
                    nota1 = teclado.nextFloat();
                    System.out.println("Nota 2: ");
                    nota2 = teclado.nextFloat();
                    System.out.println("Media: " + (nota1 + nota2) / 2);
                    break;

                case 2:
                    System.out.println("Nota 1: ");
                    nota1 = teclado.nextFloat();
                    System.out.println("Peso nota 1: ");
                    peso1 = teclado.nextInt();
                    System.out.println("Nota 2: ");
                    nota2 = teclado.nextFloat();
                    System.out.println("Peso nota 2: ");
                    peso2 = teclado.nextInt();
                    System.out.println("Nota 3: ");
                    nota3 = teclado.nextFloat();
                    System.out.println("Peso nota 3: ");
                    peso3 = teclado.nextInt();

                    System.out.println("Media ponderada: " + (nota1 * (peso1 / 10) + (nota2 * (peso2 / 10) + nota3 * peso3 / 10)));
                    break;

                case 3:
                    naoSair = false;
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
        }

    }
}
