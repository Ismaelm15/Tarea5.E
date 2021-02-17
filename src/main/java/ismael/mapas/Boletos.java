/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ismael.mapas;

import java.util.Random;

/**
 *
 * @author ismael
 */
public class Boletos {

    int numero;
    Random rnd  = new Random();
    String numero2;

    public Boletos() {
        this.numero=rnd.nextInt(100000);
        numeroCeros();
    }

    public Boletos(int numero) {
        this.numero = numero;
        numeroCeros();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Boletos other = (Boletos) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }
    
    public void numeroCeros(){
    this.numero2=String.valueOf(this.numero);
    while(this.numero2.length()<7){
    this.numero2="0"+this.numero2;
    }

    }
    
    @Override
    public String toString() {
        return "boletos{" + "numero=" + this.numero2+ '}';
    }
    
    
}
