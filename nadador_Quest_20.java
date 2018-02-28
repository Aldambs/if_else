package if_else;

import java.util.Scanner;

public class nadador_Quest_20 {

    /**
     * Faça um programa que receba a idade de um nadador e mostre a sua categoria
     * usando as regras a seguir.
       Categoria                             Idade
       Infantil                              5 a 7
       Juvenil                               8 a 10
       Adolescente                           11 a 15
       Adulto                                16 a 30
       Sênior                                Acima de 30
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("DIGITE A IDADE DO NADADOR: ");
        byte id = ler.nextByte();
        
        if(id >= 5 && id <= 7){
            System.out.println("INFANTIL!");
        }
        if(id >= 8 && id <= 10){
            System.out.println("JUVENIL!");
        }
        if(id >= 11 && id <= 15){
            System.out.println("ADOLESCENTE!");
        }
        if(id >= 16 && id <= 30){
            System.out.println("ADULTO!");
        }
        if(id > 30){
            System.out.println("SÊNIO!");
        }
    }
    
}
