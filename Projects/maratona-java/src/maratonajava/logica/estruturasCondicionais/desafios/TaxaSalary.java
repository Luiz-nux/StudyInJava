package maratonajava.logica.estruturasCondicionais.desafios;

import java.util.Scanner;

public class TaxaSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual o seu salario anual?");
        double salary = scanner.nextDouble();
        double porcentagem;
        if (salary <= 34712) {
            porcentagem = 9.70;
        } else if (salary <= 68507) {
            porcentagem = 37.35;
        } else {
            porcentagem = 49.50;
        }
        double taxaSalary = salary*porcentagem / 100;
        System.out.println("a taxe q você tera q pagar é de "+porcentagem+"%: "  + taxaSalary);
    }
}