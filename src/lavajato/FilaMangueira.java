

package lavajato;

import java.util.LinkedList;

public class FilaMangueira {

   LinkedList <Mangueira> listamangueira;
   
   public FilaMangueira(){
       listamangueira = new LinkedList<Mangueira>();
       
   }
   
   public void inserir (Mangueira c){
      listamangueira.add(c);
   }
  
   public Mangueira remover (){
       return listamangueira.remove();
   }
    
   public int FMtamanho (){
       return listamangueira.size();
   }
}
