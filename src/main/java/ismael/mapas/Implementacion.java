/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ismael.mapas;

import java.util.Random;
import java.util.TreeMap;

/**
 *
 * @author ismael
 */
public class Implementacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         TreeMap<Integer, Boletos> premios = new TreeMap<>();
         Random rnd=new Random();
         int numerorand;

         for(int i=0;i<100;i++){
         numerorand=rnd.nextInt(200);
         premios.put(numerorand, new Boletos());
         }
         premios.put(1515, new  Boletos(21));
         System.out.println(premios.values());
         
         System.out.println(premios.keySet());
        
    }
    
}
