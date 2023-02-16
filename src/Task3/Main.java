package Task3;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            LinkedList<Integer> list = getIntegerList(n);
            System.out.println("Minimum element: " + getMinimum(list));
        }
    }

    private static LinkedList<Integer> getIntegerList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        return list;
    }

    private static int getMinimum(LinkedList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}