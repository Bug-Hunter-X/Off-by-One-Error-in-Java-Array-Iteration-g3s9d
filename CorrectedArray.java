public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) { // Corrected: i < array.length
            array[i] = i * 2;
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}