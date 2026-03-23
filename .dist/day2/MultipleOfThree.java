public class MultipleOfThree {

    static boolean check(int n){
        return n % 3 == 0;
    }

    public static void main(String[] args) {
        int n = 9;

        if(check(n)){
            System.out.println("");
        } else {
            System.out.println("Not a Multiple of 3");
        }
    }
}