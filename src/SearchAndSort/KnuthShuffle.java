package SearchAndSort;
import java.util.Random;

// Manche Algorithmen benötigen ein Shuffle damit sie richtig funktionieren

public class KnuthShuffle {

    public static void shuffle(int[] array){
        Random rn = new Random();
        int arrayLength = array.length-1;
        for(int i = 0; i<arrayLength; i++){
            exchange(array, i, rn.nextInt(0,arrayLength) );
        }
    }

    private static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
