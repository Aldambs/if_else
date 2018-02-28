package if_else;

import java.util.Scanner;

public class delta {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("DIGITE O VALOR DE A: ");
        short a = ler.nextShort();
        System.out.print("DIGITE O VALOR DE B: ");
        short b = ler.nextShort();
        System.out.print("DIGITE O VALOR DE C: ");
        short c = ler.nextShort();
      
        double delta = (b * b) - (4 * a * c);
        
        if(delta < 0){
            System.out.println("NÃO HÁ RAIZ!");
        }else{
            System.out.println("EXISTE RAIZ!");
        }
        
        System.out.println("\nO DELTA É = " +delta);
        double d = 2 * a;
        
        double x1 = (-b + Math.sqrt(delta)) / d;
        double x2 = (-b - Math.sqrt(delta)) / d;
        
        if (d != 0) {
            System.out.println("O VALOR DE X1 = " + x1);
            System.out.println("O VALOR DE X2 = " + x2);
        }else{
            System.out.println("OS VALORES DE X1 E X2 NÃO EXISTE!");
        }
        
    }
    
}
