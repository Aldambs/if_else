package if_else;

import java.util.Scanner;

public class gratificacao_Quest_25 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o número de horas trabalhada: ");
        double hE = ler.nextDouble();
        System.out.print("Digite o número de horas de faltas: ");
        double hF = ler.nextDouble();
        
        double h = (hE) - 2/3 * (hF);
        
        if (h > 2.400) {
            System.out.println("\nO valor da hora: " + h + "\nGratificação de R$ 500,00");
        } else {
            if (h >= 1.800 && h < 2.400) {
                System.out.println("\nO valor da hora: " + h + "\nGratificação de R$ 400,00");
            } else {
                if (h >= 1.200 && h >= 1.800) {
                    System.out.println("\nO valor da hora: " + h + "\nGratificação de R$ 300,00");
                } else {
                    if (h >= 600 && h < 1.200) {
                        System.out.println("\nO valor da hora: " + h + "\nGratificação de R$ 200,00");
                    } else {

                        if (h < 600) {
                            System.out.println("\nO valor da hora: " + h + "\nGratificação de R$ 100,00");
                        }
                    }
                }
            }
        }
    }
}

