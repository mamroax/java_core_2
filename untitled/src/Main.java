public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{0, 2, 1, 0, 0, 2, 0, 3, 4};
        System.out.println("Количество четных элементов массива:");
        printMas(array);
        System.out.print("-> ");
        System.out.println(countEven(array));
        System.out.println("Разница между самым болшим и самым маленьким элементами массива:");
        printMas(array);
        System.out.print("-> ");
        System.out.println(difference(array));
        System.out.println("В переданном массиве есть два соседних элемента, с нулевым значением:");
        printMas(array);
        System.out.print("-> ");
        System.out.println(hasAdjacentZeros(array));
    }

    //Написать метод, возвращающий количество чётных элементов массива.
    // countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    private static int countEven(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) result++;
        }
        return result;
    }

    //Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
    // переданного не пустого массива.
    private static int difference(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }
        return max - min;
    }

    //Написать функцию, возвращающую истину,
    // если в переданном массиве есть два соседних элемента, с нулевым значением.
    private static boolean hasAdjacentZeros(int[] array) {
        boolean result = false;
        for (int i = 1; i < array.length; i++) {
            if ((array[i - 1] == 0) && (array[i] == 0)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void printMas(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(Integer.toString(array[i]) + ' ');
        }
    }
}