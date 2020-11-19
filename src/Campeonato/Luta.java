

package Campeonato;
import java.util.Random;
/**
 *
 * @author Vitor
 */
public class Luta {
    Lutador l1,l2;
  public static int numlutas;
  private  int somadepontospl1=0 , somadepontospl2=0;
  int[] pl1 = new int[15];
  int[] pl2 = new int[15];
  public Luta(Lutador l1, Lutador l2)
    {
        this.l1 = l1;
        this.l2 = l2;
        
    }
    
    public void Lutar()
    {
        Random aleatorio = new Random();
        if((l1.getAposentado() == false ) && (l2.getAposentado() == false) && (l1.getCategoria().equals(l2.getCategoria()) ))
        {
        for(int i=0 ; i<15 ; i++)
        {
            
            pl1[i] = aleatorio.nextInt(20)+1;
            pl2[i] = aleatorio.nextInt(20)+1;
            
            somadepontospl1 = somadepontospl1 + pl1[i];
            somadepontospl2 = somadepontospl2 + pl2[i];
        }
        numlutas++;
        }else
        {
            System.out.println("A luta não poderá acontecer");
        }
        
    }
    
    public Lutador vencedor()
    {
        if(somadepontospl1 > somadepontospl2)
        {
            l1.setVitorias(l1.getVitorias()+1);
            l2.setDerrotas(l2.getDerrotas()+1);
            
            return l1;
        }
        if(somadepontospl2 > somadepontospl1)
            
        {
            l2.setVitorias(l2.getVitorias()+1);
            l1.setDerrotas(l1.getDerrotas()+1);
            return l2;
        }else
        {
            l1.setEmpates(l1.getEmpates()+1);
            l2.setEmpates(l2.getEmpates()+1);
            return null;
            
        }
        
     }
    
    
    
    
 }
  
    

