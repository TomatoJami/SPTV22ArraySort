package arraysort;

import java.util.Arrays;
import java.util.Random;


public class ArraySort {

    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < 400; i++) {
            line = line.append("-");
        }
        
        int[] array1 = new int[20];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(19 - 0 + 1) + 0;
            
        }
        for (int j = 0; j < array1.length; j++) {
            for (int i = 0; i < array1.length-1; i++) {
                if(array1[i] > array1[i+1]) {
                    array1[i] = array1[i] + array1[i+1];
                    array1[i+1] = array1[i] - array1[i+1];
                    array1[i] = array1[i] - array1[i+1];
                }
            }
        }
        
        System.out.println("No sort: "+Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sort: "+Arrays.toString(array1));
        int a = 1;
        int b = 2;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("a = %d, b = %d", a, b);
        System.out.println("");
        
        int[][] array2 = new int[100]
                [100];
        
        System.out.println(line);
        System.out.println("No sort:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array2[i][j] = random.nextInt(1000);
                System.out.printf("%4d", array2[i][j]);
                 
            }
            System.out.println();
        }
        
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                for (int k = 0; k < array2[j].length; k++) {
                    for (int m = 0; m < array2[k].length; m++) {
                        if (array2[i][j] < array2[k][m]) {
                            array2[i][j] = array2[i][j] + array2[k][m];
                            array2[k][m] = array2[i][j] - array2[k][m];
                            array2[i][j] = array2[i][j] - array2[k][m];
                        } 
                    } 
                }
            }
        }
        
        System.out.println(line);
        System.out.println("Sort:");
        
        
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.printf("%4d", array2[i][j]);
            }
            System.out.println();
        }
        System.out.println(line);
        System.out.println("Спасибо за внимание!");
    }
}   

