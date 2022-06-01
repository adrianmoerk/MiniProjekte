package de.IGW.arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] kek = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 47, 59, 68, 78, 99, 100, 109, 119, 129,};

        System.out.println(medianSort(kek, 68));


    }

    public static int medianSort(int[] array, int schluessel) {
        int[] newArray = new int[array.length / 2];
        if (array[array.length / 2] == schluessel) {
            // DEBUG
            System.out.println(" == SCHLÜSSEL");
            return (array.length / 2);
        } else if (array[array.length / 2 + 1] > schluessel) {
            // DEBUG
            System.out.println(" >>> SCHLÜSSEL");
            for (int i = 0; i < array.length / 2; i++) {
                newArray[i] = array[i];
            }
            return medianSort(newArray, schluessel);
        } else if (array[array.length / 2 + 1] < schluessel) {
            //DEBUG
            System.out.println(" <<< schluessel");
            for (int i = array.length / 2; i < array.length; i++) {
                newArray[i] = array[i];
            }
            return medianSort(newArray, schluessel);
        } else {
            return -1;
        }

    }


}

