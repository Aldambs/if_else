package if_else;

import java.util.Scanner;

public class senha_Quest_17 {

    /**
     * Faça um programa que verifique a validade de uma senha fornecida pelo usuário
     * A senha é 4531. O programa deve mostrar uma mensagem de permissão de acesso ou não.
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        int senha = ler.nextInt();
        
        if(senha == 4531){
            System.out.println("ACESSO PERMITIDO!!");
        }else{
            System.out.println("ACESSO NEGADO!!");
        }
    }
    
}
