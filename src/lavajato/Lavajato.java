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
public class Lavajato {

    public static void main(String[] args) {
        // TODO code application logic here
        Agendador agendador = new Agendador();
        
    Lavador l1 = new Lavador();
    Lavador l2 = new Lavador();
    
    Balde b1 = new Balde();
    Balde b2 = new Balde();
    
    Mangueira m1 = new Mangueira();
    Mangueira m2 = new Mangueira();
    
    agendador.el1.inserir(l1);
    agendador.el1.inserir(l2);
    
    agendador.espb.inserir(b1);
    agendador.espb.inserir(b2);
    
    agendador.em.inserir(m1);
    agendador.em.inserir(m2);
    
    agendador.agenda.inserir(0, "chegadaCarro");
    
    while (agendador.cont < 10){
        agendador.faseA();
        agendador.faseB();
        agendador.faseC();
        
    }
    
    }
    
}
