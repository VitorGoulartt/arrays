package atividadeOito;
import java.util.Arrays;

public class Oito {

    public void array(){
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        System.out.println(Arrays.equals(a , b));

        for( int i = 1; i < b.length; i++){
            Arrays.fill(b, 5);

            System.out.println(b[i]);

        }
        System.out.println(Arrays.equals(a , b));


    }

}
