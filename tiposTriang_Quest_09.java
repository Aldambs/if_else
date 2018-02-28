package if_else;

import java.util.Scanner;

public class tiposTriang_Quest_09 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       double x, y, z;
       
       System.out.print("DIGITE O 1º VALOR: ");
       x = ler.nextDouble();
       System.out.print("DIGITE O 2º VALOR: ");
       y = ler.nextDouble();
       System.out.print("DIGITE O 3º VALOR: ");
       z = ler.nextDouble();
       
       if((y + z) > x && (y + x) > z && (x + z) > y){
           System.out.println("Forma um triângulo!");
        }else{
            System.out.println("Não forma um triângulo!");
        
       }
    }
    
}
