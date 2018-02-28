package if_else;

import java.util.Scanner;

public class opcoa_quest_06 {

    /**
     * Faça um programa que receba dois números e execute uma das operações 
     * listadas a seguir de acordo com a escolha do usuário. Se for digitada uma 
     * opção inválida mostrar mensagem de erro e terminar o programa. As opções são:
       1.Média entre os dois números.
       2.Diferença do maior pelo menor.
       3.O produto entre os dois números.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        byte op = 0;
        float med, dif = 0, prod, n1, n2;
        
        System.out.print("Digite o primeiro número: ");
        n1 = ler.nextFloat();
        System.out.print("Digite o segundo número: ");
        n2 = ler.nextFloat();
        
        System.out.print("Informe a opção desejada (1, 2, 3): ");
        op = ler.nextByte();
                
        if (op == 1) {
            med = (n1 + n2) / 2;
            System.out.println("A MÉDIA = " + med);
        }
        if (op == 2) {
            if (n1 > n2) {
                dif = n1 - n2;
            } else {
                dif = n2 - n1;
            }
            System.out.println("A diferença = " + dif); 
        }
        if(op == 3){
            prod = n1 * n2;
            System.out.println("O produto = " +prod);
        }
        if(op != 1 && op != 2 && op != 3){
            System.out.println("OPÇÃO INVÁLIDA!");
        }
    }
}
