package atividadequatro;
import java.util.Arrays;

public class Quatro {
    int[] numeros = {5, 2, 8, 1, 9};
    public void array(){

        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);

        System.out.println(Arrays.toString(numeros));

        System.out.println("Atividade 5\n");

        int indice = Arrays.binarySearch(numeros, 0);

        System.out.println(indice);

        





    }

}
