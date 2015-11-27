/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lavajato;

/**
 *
 * @author ALUNO
 */
public class Carro {
    double tempoChegada;

    public double getTempoChegada() {
        return tempoChegada;
    }

    public void setTempoChegada(double tempoChegada) {
        this.tempoChegada = tempoChegada;
    }
    
    
   public Carro(double t){
    tempoChegada = t;
}
    
}
