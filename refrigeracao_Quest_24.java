package if_else;

import java.util.Scanner;

public class refrigeracao_Quest_24 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("DIGITE A CATEGORIA: "
                               + " \n 1.LIMPEZA "
                               + " \n 2.ALIMENTAÇÃO "
                               + " \n 3.VESTUÁRIO\n ");
        byte categ = ler.nextByte();
        System.out.print("DIGITE A SITUAÇÃO:"
                               + " \n R.PRODUTO QUE NECESSITAM DE REFRIGERAÇÃO "
                               + " \n N.PRODUTO QUE NÃO NECESSITAM DE REFRIGERAÇÃO\n ");
        String situ = ler.next();
        System.out.print("DIGITE O VALOR DO PRODUTO: ");
        double valor = ler.nextDouble();
        double aum = 0;
        
        if(valor <= 25){
            if(categ == 1){
                aum = (valor * 0.05);
            }
            if(categ == 2){
                aum = (valor * 0.08);
            }
            if(categ == 3){
                aum = (valor * 0.10);
            }
        }
        
        if(valor > 25){
            if(categ == 1){
                aum = (valor * 0.12);
            }
            if(categ == 2){
                aum = (valor * 0.15);
            }
            if(categ == 3){
                aum = (valor * 0.18);
            }
        
        }
        
        double novoV, valorI = 0;
        novoV = valor + aum;
        System.out.println("O aumento do percentual = " +aum);
        System.out.println("O novo valor é = " +novoV);
        
        if(categ == 2 || situ.equalsIgnoreCase("R")){
            valorI = (novoV * 0.05);
        }
        if(categ == 2 || situ.equalsIgnoreCase("N")){
            valorI = (novoV * 0.08);
        }
        System.out.println("O valor do imposto = R$ " +valorI);
        
        if(novoV <= 50){
            System.out.println("BARATO!");
        }
        if(novoV > 50 && novoV <= 120){
            System.out.println("NORMAL!");
        }
        if(novoV > 120){
            System.out.println("CARO!");
        }
    }  
}
