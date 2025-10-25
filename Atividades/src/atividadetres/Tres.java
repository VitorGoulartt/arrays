package atividadetres;

public class Tres {
    int[] pares = {2, 4, 6, 8, 10};
    public void arra(){
        for(int i = 0; i < pares.length; i++){
            System.out.println(i);

            
        } 
        System.out.println("----");
        for(int i : pares){
            System.out.println(i);
        }
        

    }

    




}
