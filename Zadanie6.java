package zad6;

public class Zadanie6 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        printArray(sortArray(arr));

    }

    public static int[] sortArray(int[] tablica){
        int temp;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = i+1; j < tablica.length; j++) {
                if(tablica[i] > tablica[j]) {
                    temp = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = temp;
                }
            }
        }
        return tablica;
    }

   public static void printArray(int[] tablica){
        for(int x : tablica){
            System.out.print(x + ", ");
        }
    }
}
