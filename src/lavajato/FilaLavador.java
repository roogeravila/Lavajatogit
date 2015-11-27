/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lavajato;

import java.util.LinkedList;

/**
 *
 * @author ALUNO
 */
public class FilaLavador {
    LinkedList <Lavador> listalavador;
   
   public FilaLavador(){
       listalavador = new LinkedList<Lavador>();
       
   }
   
   public void inserir (Lavador c){
      listalavador.add(c);
   }
  
   public Lavador remover (){
       return listalavador.remove();
   }
    
   public int FLtamanho (){
       return listalavador.size();
   }
}
