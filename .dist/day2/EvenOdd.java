public class EvenOdd {
    static boolean check(int n){
        return n % 2 == 0;   // true if even
    }

    public static void main(String[] args) {
        int n = 5;

        boolean result = check(n);
        System.out.println(result);
    }
}
