public class MaximumInteger {

    static int solve(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int result = solve(a, b);
        System.out.println(result);
    }
}