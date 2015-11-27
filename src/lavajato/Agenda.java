
package lavajato;

import java.util.LinkedList;

public class Agenda {
    LinkedList <celula> listaAgenda;
    
    public Agenda(){
        listaAgenda = new LinkedList<celula>();
    }
    
   public void inserir(double a, String b){
      celula ab = new celula(a,b);
      listaAgenda.add(ab);
   }
   
   public double procurar_menor(){
     double aux = listaAgenda.get(0).getHora();
     for(int i = 1 ; i<listaAgenda.size();i++){
         if(aux > listaAgenda.get(i).getHora()){
             aux = listaAgenda.get(i).getHora();
          }
     }  
     return aux;
       
   }
   
   
   
}
