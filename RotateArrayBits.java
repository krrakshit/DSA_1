public class RotateArrayBits {
    public static void main(String[] args) {
        int[] array = { 10, 11, 12, 13 }; // Example array with 4 integers

        System.out.println("Original Array:");
        printIntArray(array);
        printBinaryArray(array);

        rotateRightByBits(array, 2);

        System.out.println("\nRotated Array (2 bits to the right):");
        printIntArray(array);
        printBinaryArray(array);
    }

    private static void rotateRightByBits(int[] arr, int bits) {
        int n = arr.length;

        // Rotate each element in the array
        for (int i = 0; i < n; i++) {
            arr[i] = (arr[i] >>> bits) | (arr[i] << (32 - bits));
        }
    }

    private static void printIntArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printBinaryArray(int[] arr) {
        for (int num : arr) {
            String binaryString = Integer.toBinaryString(num);
            // Ensure leading zeros for a 32-bit representation
            binaryString = String.format("%32s", binaryString).replace(' ', '0');
            System.out.print(binaryString + " ");
        }
        System.out.println();
    }
}
