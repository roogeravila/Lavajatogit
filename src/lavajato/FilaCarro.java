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
public class FilaCarro {
    
   LinkedList <Carro> listacarro;
   
   public FilaCarro(){
       listacarro = new LinkedList<Carro>();
       
   }
   
   public void inserir (Carro c){
      listacarro.add(c);
   }
  
   public Carro remover (){
      return listacarro.remove();
   }
    
   public int FCtamanho (){
       return listacarro.size();
   }
}
