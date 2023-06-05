public class Main {
    public static void main(String[] args) {

//        divideByZero();
        arrayOutOfBounds();
    }
    public static void divideByZero() {
        int a = 0;
        int b = 2;
        if((a == 0 || b == 0) || (a == 0 && b == 0))
        {
           System.out.println("Одно или оба числа равны НУЛЮ");
        }
        else {
            System.out.println("Результат деления = " + a / b);
        }

    }


    public static void arrayOutOfBounds() {
        int[] arr = new int[5];
        arr[10] = 1;
    }


    public static void nullPointer() {
        String str = null;
        int len = str.length();
    }


    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
    // NumberFormatException, NullPointerException, ArrayIndexOutOfBoundsException, IndexOutOfBoundsException, Exception

    public static int[] diffArrays(int[] a, int[] b) throws IllegalArgumentException {
        if (a.length != b.length) {
            throw new RuntimeException("Длины массивов не равны!");
        }
        int n = a.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = a[i] - b[i];
        }
        return result;
    }
}