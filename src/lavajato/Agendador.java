package lavajato;

import java.util.Random;

public class Agendador {
    int cont = 0;
    Carro auxC;
    Lavador auxL;
    Mangueira auxM;
    Balde auxB;
    Random gerador = new Random();
    double r;
    
    double Relogio;
    Agenda agenda = new Agenda();
    
    FilaCarro ec1 = new FilaCarro();
    FilaCarro ec2 = new FilaCarro();
    FilaCarro ec3 = new FilaCarro();
    
    FilaCarro enxinC = new FilaCarro();
    FilaCarro ensabC = new FilaCarro();
    FilaCarro enxfimC = new FilaCarro();
    
    FilaLavador el1 = new FilaLavador();
    FilaLavador el2 = new FilaLavador();
    FilaLavador el3 = new FilaLavador();
    
    FilaLavador enxinL = new FilaLavador();
    FilaLavador ensabL = new FilaLavador();
    FilaLavador enxfimL = new FilaLavador();
    
    FilaBalde espb = new FilaBalde();
    FilaBalde ensabb = new FilaBalde();
    
    FilaMangueira em = new FilaMangueira();
    FilaMangueira enxinM = new FilaMangueira();
    FilaMangueira enxfimM = new FilaMangueira();
    
    public void chegadaCarro(){
        System.out.println("Chegada do carro no tempo de " + Relogio);
        Carro c1 = new Carro(Relogio);
        ec1.inserir(c1);
        //sorteia quando sera a prox. chegada
        double r; // sortiar e colocar no r
        r = gerador.nextDouble();
        //agenda a prox. chegada
        agenda.inserir(Relogio+r, "chegadaCarro");
        System.out.println("Agendou uma chegada para o tempo " + (Relogio+r));
       
    }
    
    public void ini_enx_in(){
        if (ec1.FCtamanho() > 0 && el1.FLtamanho() > 0 && em.FMtamanho() > 0){
            System.out.println("Inicio do enxague inicial do carro no tempo de " + Relogio);
            auxC = ec1.remover();
            enxinC.inserir(auxC);
            auxL = el1.remover();
            enxinL.inserir(auxL);
            auxM = em.remover();
            enxinM.inserir(auxM);
            
            //sorteia quando acaba enxaque inicial, inserir hora aleatoria na agenda passando hora e função.
            float r; // sortiar e colocar no r
            r = gerador.nextFloat();
            //agenda a prox. chegada
            agenda.inserir(Relogio+r, "Fim enxague inicial");
            //agenda o fim do enxaque inicial, e agenda hora da prox função, no caso, enxage final.
            System.out.println("Agendou o fim do enxague inicial para o tempo " + (Relogio+r));
        }
    }
    public void fim_enx_in(){
        System.out.println("Fim do enxaque incial do carro no tempo de " + Relogio);
            auxC = enxinC.remover();
            ec2.inserir(auxC);
            auxL = enxinL.remover();
            el2.inserir(auxL);
            auxM = enxinM.remover();
            em.inserir(auxM);
    }
    
    public void ensab_ini(){
        if (ec2.FCtamanho() > 0 && el2.FLtamanho() > 0 && espb.FBtamanho() > 0){
            System.out.println("Inicio do ensaboamento do carro no tempo de " + Relogio);
            auxC = ec2.remover();
            ensabC.inserir(auxC);
            auxL = el2.remover();
            ensabL.inserir(auxL);
            auxB = espb.remover();
            ensabb.inserir(auxB);
            
            float r; // sortiar e colocar no r
        r = gerador.nextFloat();
        //agenda a prox. chegada
        agenda.inserir(Relogio+r, "fim ensaboamento");
        System.out.println("Agendou o fim do ensaboamento para o tempo " + (Relogio+r));    
            //sorteia quando acaba ensaboamento
            //agenda o fim do ensaboamento
            
        }
    }
    
    public void ensab_fim(){
        System.out.println("Fim do ensaboamento do carro no tempo de " + Relogio);
            auxC = ensabC.remover();
            ec3.inserir(auxC);
            auxL = ensabL.remover();
            el3.inserir(auxL);
            auxB = ensabb.remover();
            espb.inserir(auxB);
    }
    
    public void ini_enx_fim(){
        if (ec3.FCtamanho() > 0 && el3.FLtamanho() > 0 && em.FMtamanho() > 0){
            System.out.println("Inicio do enxague final do carro no tempo de " + Relogio);
            auxC = ec3.remover();
            enxfimC.inserir(auxC);
            auxL = el3.remover();
            enxfimL.inserir(auxL);
            auxM = em.remover();
            enxfimM.inserir(auxM);
            
            float r; // sortiar e colocar no r
        r = gerador.nextFloat();
        //agenda a prox. chegada
        agenda.inserir(Relogio+r, "fim do segundo enxague");
            //sorteia quando acaba enxaque final
            //agenda o fim do enxaque final
        System.out.println("Agendou o fim do enxague final para o tempo " + (Relogio+r));
        }
    }
    public void fim_enx_fim(){
        System.out.println("Fim do enxague final do carro no tempo de " + Relogio);
            auxC = enxfimC.remover();
        System.out.println(Relogio - auxC.getTempoChegada());
            auxL = enxfimL.remover();
            el1.inserir(auxL);
            auxM = enxfimM.remover();
            em.inserir(auxM);
            cont++;
    }
    
    
   
   public void faseA (){
    Relogio = agenda.procurar_menor();
}
   
   public void faseB (){
       int i;
       String funcao;
       for (i = agenda.listaAgenda.size()-1; i>=0; i--){
           if (agenda.listaAgenda.get(i).getHora() == Relogio){
               funcao = agenda.listaAgenda.get(i).getFunçao();
               if (funcao.equals("chegadaCarro")){ 
                   chegadaCarro();
               }
               else if (funcao.equals("Fim enxague inicial")){
                   fim_enx_in();
               }
               else if (funcao.equals("fim ensaboamento")){
                   ensab_fim();
               }
               else if (funcao.equals("fim do segundo enxague")){
                   fim_enx_fim();
               }
               agenda.listaAgenda.remove(i);
           }
           
       }
    // percrrer toda a lista da agenda , verificando nas celulas se o getHora == valor do relogio.
       // se for igual chamar a função que esta no celula.getFuncao
       // se não for igual, continua verificando as celulas
       // 
}
   
   public void faseC(){
       ini_enx_in();
       ensab_ini();
       ini_enx_fim();
       
   }
}
