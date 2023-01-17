public class Main {
    static int [] array = new int[1000];
    static int count = 0;
    public static void main(String[] args) {
        ArrayUtils.arrayInit(array);
        System.out.println(sum(array));
    }
    public static int sum (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3 ==0 || arr[i]%5 ==0) {
                count = count + i;
            } else {
                count = count +0;
            }
        }
        return count;
    }
}