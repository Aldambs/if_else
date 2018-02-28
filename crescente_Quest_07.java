   package if_else;

import java.util.Scanner;

public class crescente_Quest_07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor para a: ");
        short a  = ler.nextShort();
        System.out.println("Digite o valor para b: ");
        short b = ler.nextShort();
       
        if(a < b){
            System.out.println("Ordem crescente: " +a+ " , " +b);
        }else{
          if(a > b){
              System.out.println("Ordem crescente:  " +b+ " , " +a);
          }  
        }
    }   
}
