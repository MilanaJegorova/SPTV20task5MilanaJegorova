package sptv20task5milanajegorova;

import java.util.Arrays;

public class SPTV20task5MilanaJegorova {

    public static void main(String[] args) {
        int[][] numbers = new int[5][];
        int[] numbers_all = new int[32];

        int iteration = 0;

        numbers[0] = new int[3];
        numbers[1] = new int[5];
        numbers[2] = new int[7];
        numbers[3] = new int[8];
        numbers[4] = new int[9];

        for (int k = 0; k < numbers.length; k++) {
            for (int l = 0; l < numbers[k].length; l++) {
                numbers[k][l] = (int)(Math.random() * 50 + 50);
            }
        }

        printNumbers(numbers);

        for (int x = 0; x < numbers.length; x++) {
            for (int y = 0; y < numbers[x].length; y++) {
                numbers_all[iteration] = numbers[x][y];
                iteration++;
            }
        }

        iteration = 0;
        System.out.println(" ");

        Arrays.sort(numbers_all);

        for (int s = 0; s < numbers.length; s++) {
            for (int v = 0; v < numbers[s].length; v++) {
                numbers[s][v] = numbers_all[iteration];
                iteration++;
            }
        }

        printNumbers(numbers);

    }

    public static void printNumbers(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}