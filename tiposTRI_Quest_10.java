package if_else;

import java.util.Scanner;

public class tiposTRI_Quest_10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        double a = ler.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = ler.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = ler.nextDouble();

        if(a == b && b == c && a == c){
            System.out.println("Forma o triângulo equilátero!");
        }
        if(a == c || b == c || a == b){
            System.out.println("Forma o triângulo isóscelos!");
        }
        if(a != b && b != c && a != c){
            System.out.println("Forma o triângulo escaleno!");
        }
        
    }
}
