package ExHerancaEpoliNelioFixacao1.main;

import ExHerancaEpoliNelioFixacao1.entities.Contribuinte;
import ExHerancaEpoliNelioFixacao1.entities.Empresa;
import ExHerancaEpoliNelioFixacao1.entities.Individual;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Quantos contribuintes: ");
        int contribuintes = sc.nextInt();

        for (int i = 1; i <= contribuintes; i++){
            System.out.println("Dados do #" + i +" contribuinte");
            System.out.print("Individual ou Empresa (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.next();
            String nome = sc.nextLine();
            System.out.print("Renda Anual: ");
            Double rendaAnual = sc.nextDouble();
            if (ch == 'i'){
                System.out.print("Gastos com saude: ");
                Double gastosComSaude = sc.nextDouble();
                list.add(new Individual(nome, rendaAnual, gastosComSaude));
            } else {
                System.out.print("Numero de funcionarios: ");
                int numeroDeFuncionarios = sc.nextInt();
                list.add(new Empresa(nome, rendaAnual, numeroDeFuncionarios));
            }
        }

        double sum = 0.0;
        System.out.println("Taxas a pagar: ");
        for (Contribuinte cont : list){
            double taxas = cont.imposto();
            System.out.println(cont.getNome() + ": $ " + String.format("%.2f", taxas));
            sum += taxas;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
