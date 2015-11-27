
package lavajato;

import java.util.LinkedList;

public class FilaBalde {
    LinkedList <Balde> listabalde;
   
   public FilaBalde(){
       listabalde = new LinkedList<Balde>();
       
   }
   
   public void inserir (Balde c){
      listabalde.add(c);
   }
  
   public Balde remover (){
       return listabalde.remove();
   }
   
   public int FBtamanho (){
       return listabalde.size();
   }
    
    
}
