package atividadeSete;

import java.util.Arrays;

public class Sete {
    public void array(){

        int[] original = {3, 6, 9, 12, 15};
        int[] copia = Arrays.copyOf(original, original.length);
         int[] copiadois = Arrays.copyOfRange(original, 1,  3);
         System.out.println(Arrays.toString(copia));
         System.out.println(Arrays.toString(copiadois));



    }

}
