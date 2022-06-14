package exercicio4;


import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String motivo = "";

        System.out.println("Dia: ");
        int diaNascimento = teclado.nextInt();
        if (diaNascimento < 1 || diaNascimento > 31) motivo = "Dia invalido";

        System.out.println("Mes: ");
        int mesNascimento = teclado.nextInt();
        if (mesNascimento < 1 || mesNascimento > 12) motivo = "Mês invalido";

        System.out.println("Ano: ");
        int anoNascimento = teclado.nextInt();
        if (anoNascimento > 2000) motivo = "Ano invalido";

        if (diaNascimento < 1 || diaNascimento > 31 || mesNascimento < 1 || mesNascimento > 12 || anoNascimento > 2000) {
            System.out.println("Data Inválida. Motivo: " + motivo);
        } else {
            System.out.println("Data valida");
        }
    }
}
