package atividadedois;


public class Dois {
    public void arrays(){
        String[] nomes = new String[3];
         nomes[0] = "joao";
         nomes[1] = "marcos";
         nomes[2] = "maria";

         System.out.println(nomes[0]+" " + " "+ nomes[2]);

         for(String pessoas : nomes){
            pessoas += "a";          
            System.out.println(pessoas);

         }

    }

    
    

   

}