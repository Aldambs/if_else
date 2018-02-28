package if_else;

import java.util.Scanner;

public class atuSal_Quest_13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("DIGITE O SALÁRIO: ");
        double sal = ler.nextDouble();
        
        double atual = 0;
        
        if(sal <= 500){
            atual = sal + (sal * 0.50);
        }else if(sal >= 500.01 && sal <= 1000){
            atual = sal + (sal * 0.40);
        }else if(sal >= 1000.01 && sal <= 2000){
            atual = sal + (sal * 0.30);
        }else if(sal >= 2000.01 && sal <= 2500){
            atual = sal + (sal * 0.20);
        }else if(sal > 2500){
            atual = sal + (sal * 0.10);
        }
        System.out.println("O salário atual é = " +atual);
    }
    
}
