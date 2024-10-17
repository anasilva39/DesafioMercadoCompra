
package desafiomercadocompra;

import java.util.Scanner;


public class DesafiomercadoCompra {

    
    public static void main(String[] args) {
        
        System.out.println("------------------------------");
        System.out.println("    Mercado de Bebidas        ");
        System.out.println("    (1) Cerveja               ");
        System.out.println("    (2) Refrigerante          ");
        System.out.println("    (3) Água                  ");
        System.out.println("------------------------------");
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha a sua opção: ");
        int opcao = teclado.nextInt();
        
        
        if (opcao ==1){
            System.out.println("Informe sua idade: ");
            int i = teclado.nextInt();
            
            if(i >= 18){
                System.out.println("Compra efetuada com sucesso!");
            }else {
                System.out.println("Compra negada");   
                
            }
        }    if((opcao == 2) || (opcao == 3)){
                System.out.println("Compra efetuada com sucesso!");
             
            }        
        
    }
    
}
