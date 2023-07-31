import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int min(int[] values) {
        int min = values[0];
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int occuranceScan(int[] values, int target) {
        int count = 0;
        for (int value : values) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }

    public static int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static boolean contains(int[] values, int target) {
        for (int value : values) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] dataPoints = new int[100];

        Random random = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i != dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        int sum = sum(dataPoints);
        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);
        System.out.println("The minimum value in the array is: " + min(dataPoints));
        System.out.println("The maximum value in the array is: " + max(dataPoints));

        Scanner scanner = new Scanner(System.in);
        int userValue1 = SafeInput.getRangedInt(scanner, "Enter an integer value between 1 and 100: ", 1, 100);

        int count1 = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue1) {
                count1++;
            }
        }

        if (count1 > 0) {
            System.out.println("The value " + userValue1 + " was found " + count1 + " times in the array.");
        } else {
            System.out.println("The value " + userValue1 + " was not found in the array.");
        }

        int userValue2 = SafeInput.getRangedInt(scanner, "Enter another integer between 1 and 100: ", 1, 100);

        int position2 = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue2) {
                position2 = i;
                break;
            }
        }

        if (position2 != -1) {
            System.out.println("The value " + userValue2 + " was found at array index " + position2 + ".");
        } else {
            System.out.println("The value " + userValue2 + " was not found in the array.");
        }

        scanner.close();
    }
}
