package if_else;

import java.util.Scanner;

public class prodCOMP_Quest_23 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("DIGITE O CÓDIGO DO PRODUTO: ");
        byte cod = ler.nextByte();
        System.out.print("DIGITE A QUANTIDADE COMPRADA DE UM PRODUTO: ");
        int qtd = ler.nextInt();
        
        double precoT = 0, precoF = 0, desc = 0;
        
        if(cod >= 1 && cod <= 10){
            precoT = qtd * 10;
            if(precoT <= 250){
                desc = precoT * 0.05;            
                precoF =  precoT - desc;
            }
            if(precoT > 250 && precoT <= 500){
                desc = precoT * 0.10;            
                precoF =  precoT - desc;
            }
            if(precoT > 500){
                desc = precoT * 0.15;            
                precoF =  precoT - desc;
            }
        }
        
        if(cod >= 11 && cod <= 20){
            precoT = qtd * 15;
            if(precoT <= 250){
                desc = precoT * 0.05;            
                precoF =  precoT - desc;
            }
            if(precoT > 250 && precoT <= 500){
                desc = precoT * 0.10;            
                precoF =  precoT - desc;
            }
            if(precoT > 500){
                desc = precoT * 0.15;            
                precoF =  precoT - desc;
            }
        }
        
        if(cod >= 21 && cod <= 30){
            precoT = qtd * 20;
            if(precoT <= 250){
                desc = precoT * 0.05;            
                precoF =  precoT - desc;
            }
            if(precoT > 250 && precoT <= 500){
                desc = precoT * 0.10;            
                precoF =  precoT - desc;
            }
            if(precoT > 500){
                desc = precoT * 0.15;            
                precoF =  precoT - desc;
            }
        }
        
        if(cod >= 31 && cod <= 40){
            precoT = qtd * 30;
            if(precoT <= 250){
                desc = precoT * 0.05;            
                precoF =  precoT - desc;
            }
            if(precoT > 250 && precoT <= 500){
                desc = precoT * 0.10;            
                precoF =  precoT - desc;
            }
            if(precoT > 500){
                desc = precoT * 0.15;            
                precoF =  precoT - desc;
            }
        }
        System.out.println(" ");
        System.out.println("O preço total,  R$ = " +precoT);
        System.out.println("O valor do desconto,  R$ = " +desc);
        System.out.println("O preço final,  R$ = " +precoF);
    }
    
}
