package testegit;
import java.sql.*;



public class Banco {
    private static Connection conectar;
    private static Statement enviar;
    private static ResultSet pegar;
    private static ResultSetMetaData retornar;
    
    public void ConectaBanco(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsalao","adm","adm");
            enviar = conectar.createStatement();
            System.out.println("Banco de dados conectado com sucesso!");
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println("Banco de dados não conectado!");
        }
        /*finally{
            try{
                enviar.close();
                conectar.close();
                System.out.println("Banco de dados finalizado com sucesso!");
            }
            catch (Exception exception){
                System.out.println("Banco de dados não foi finalizado com sucesso!");
            }
        }*/
    }
    
    public void cadastra (String sql){
        try{
            enviar=null;
            enviar=conectar.createStatement();
            enviar.executeUpdate(sql);
        }
        catch (Exception e){
            System.out.println("Já existe!");
        }
    }
    
    public void deleta (String sql){
        try{
            enviar=null;
            enviar=conectar.createStatement();
            enviar.executeUpdate(sql);
        }
        catch (Exception e){
            System.out.println("Não foi possível deletar!");
        }
    }
    
    public void atualiza (String sql){
        try{
            enviar=null;
            enviar=conectar.createStatement();
            enviar.executeUpdate(sql);
        }
        catch (Exception e){
            System.out.println("Já foi modificado!");
        }
    }
    
    public void consulta_cliente(){
       try{
           pegar = enviar.executeQuery("SELECT * FROM cad_cliente");
           retornar = pegar.getMetaData();
       
           while(pegar.next()){
               int coluna = retornar.getColumnCount();
               for (int i=1; i<=coluna; i++){
                   System.out.printf("%-2s\t", pegar.getObject(i));
               }
               System.out.println();
           }
       } 
       catch (Exception e) {
           System.out.println("Não foi possvel consultar!");
       }
        
    }
}
