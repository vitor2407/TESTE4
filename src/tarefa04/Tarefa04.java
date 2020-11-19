/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa04;
import Campeonato.*;
import java.util.Scanner;
public class Tarefa04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lutador[] l1 = criarLutador();
        Luta luta1 = new Luta(l1[0], l1[1]);
        luta1.Lutar();
        Lutador vencedor = luta1.vencedor();
        System.out.println("O vencedor é :" + vencedor.apresentarLutador());
        
    }
        
        
      public static Lutador[] criarLutador() 
      {
          
          Scanner scan = new Scanner(System.in);
        Lutador[] lute = new Lutador[2];
        for(int i=0; i<lute.length; i++){
            System.out.print("\nEscreva o nome do lutador : ");
            String nome = scan.nextLine();
            System.out.print("\nEscreva a nacionalidade do lutador : ");
            String nacionalidade = scan.nextLine();
            System.out.print("\nEscreva se o lutador está aposentado : ");
            boolean aposentado = Boolean.parseBoolean(scan.nextLine());
            System.out.print("\nEscreva o peso do lutador : ");
            float peso = Float.parseFloat(scan.nextLine());
            System.out.print("\nEscreva a idade do lutador : ");
            int idade = Integer.parseInt(scan.nextLine());
            System.out.print("\nEscreva a quantidade de vitorias do lutador : ");
            int vitorias = Integer.parseInt(scan.nextLine());
            System.out.print("\nEscreva a quantidade de derrotas do lutador : ");
            int derrotas = Integer.parseInt(scan.nextLine());
            System.out.print("\nEscreva a quantidade de empates do lutador : ");
            int empates = Integer.parseInt(scan.nextLine());
            lute[i] = new Lutador(nome, nacionalidade, aposentado, peso, idade, vitorias, derrotas, empates);
            lute[i].informarcategoria();
            System.out.println(lute[i].apresentarLutador()); 
            System.out.println("Deseja alterar algum dado do jogador" +i);
            String resp = scan.nextLine();
            System.out.println("1 - nome \n  2 - nacionalidade \n 3 - Se está aposentado \n 4 - peso \n 5 - idade");
            int op = scan.nextInt();
            System.out.println("Pode ser feita até 2 alterações");
            if(resp == "sim")
            {
                switch (op){
                    case 1:
                        
            }
            
                
            
            }
            
      
      }
        return lute;
      }
}