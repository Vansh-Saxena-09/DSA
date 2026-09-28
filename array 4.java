public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 42, 18};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest = " + min);
    }
}
