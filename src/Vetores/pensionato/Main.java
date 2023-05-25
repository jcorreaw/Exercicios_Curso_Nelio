package Vetores.pensionato;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluguel[] vect = new Aluguel[10];

        System.out.print("Quantos quartos serão  alugados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Quarto " + (i +1)  + ": ");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Numero do quarto: ");
            int numeroDoQuarto = sc.nextInt();
            vect[numeroDoQuarto] = new Aluguel(nome, email);
        }

        for (int i = 0; i < 10; i++){
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }

        }


    }
}
