//package org.example;
//
//
//
//public  class Main {
//    int fib(int n, int[] dp) {
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//
//        if (dp[n] != -1) {
//            return dp[n];
//        }
//        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
//        return dp[n];
//    }
//
//    public static void fibonacci(String[] args) {
//
//    }
//
//    public void main() {
//        Main m = new Main();
//        int n = 50;
//        int dp[] = new int[n + 1];
//        for (int i = 1; i <= n; i++) {
//            dp[i] = -1;
//        }
//        System.out.println("finding fibonacci numbers: " + n);
//        System.out.println(m.fibonacci(n,dp));
//    }
//
//}
