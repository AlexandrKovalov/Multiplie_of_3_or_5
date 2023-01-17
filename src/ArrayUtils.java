

public class ArrayUtils {
    public static int [] arrayInit (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }
    public static void arrayOut (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
