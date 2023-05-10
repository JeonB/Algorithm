public class FibonacciDP {
    public static int fibonacci(int n) {
        // 이전 계산 결과를 저장할 배열 선언
        int[] fib = new int[n + 1];

        // 초기값 설정
        fib[0] = 0;
        fib[1] = 1;

        // 피보나치 수열 계산
        for (int i = 2; i <= n; i++) {
            // 이전 두 항의 합을 저장
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // n번째 피보나치 수 반환
        return fib[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
