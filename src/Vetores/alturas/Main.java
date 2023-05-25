package Vetores.alturas;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoas[] vect = new Pessoas[n];

        for (int i = 0; i < vect.length; i++){
            System.out.println("Dados da " + (i+1) + " a pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoas(nome, idade, altura);
        }

        double soma= 0.0;
        for (int i = 0; i < vect.length; i++){
            soma += vect[i].getAltura();
        }
        double media = soma / vect.length;
        System.out.printf("Altura média: %.2f\n", media);

        int contador = 0;
        for (int i = 0; i < vect.length; i++){
            if (vect[i].getIdade() < 16){
                contador += 1;
            }
        }
        double menores = contador * 100.0 / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", menores);

        for (int i = 0; i < vect.length; i++){
            if (vect[i].getIdade() < 16){
                System.out.println(vect[i]);
            }
        }






    }
}
