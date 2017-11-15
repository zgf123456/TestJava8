package com.zgf.func.demo1;

/**
 * Created by zgf on 17/11/7.
 */
public class PrimeUtil {

    /**
     * 判断是否素数
     *
     * @param number
     * @return
     */
    public static boolean isPrime(int number) {
        int tmp = number;
        if (tmp < 2) {
            return false;
        }

        double sqrt = Math.sqrt(tmp);
        for (int i = 2; i <= sqrt; i++) {
            if (tmp % i == 0) {
                return false;
            }
        }
        return true;
    }
}
