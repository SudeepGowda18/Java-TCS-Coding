public class SumOfFibonacci {
    public static int sumOfFibo(int n) {
        if(n == 1)
            return 0;
        int first = 0;
        int second = 1;
        int sum = first + second;
        for (int i = 2; i < n; i++) {
            int next = first + second;
            sum += next;
            first = second;
            second = next;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfFibo(n));
    }
}