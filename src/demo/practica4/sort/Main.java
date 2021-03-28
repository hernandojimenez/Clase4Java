package demo.practica4.sort;

import java.io.IOException;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        Sorter sorter = (Sorter)MiFactory.getInstance("sorterQuick");

        Integer[] arr = new Integer[9998];

        int j = 0;

        for (int i = arr.length; i > 0; i--) {
            arr[j] = i;

            j++;
        }

        Comparator<Integer> c = (a, b) -> a - b;
        sorter.sort(arr, c);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("\n El tiempo transcurrido fue de " + Timer.elapsedTime() / 1000 + " segundos");
    }
}
