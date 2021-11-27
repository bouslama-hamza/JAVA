public class Util {
    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if ((m > 0) && (n == 0)) {
            return ackermann(m-1, n);
        } else if ((m > 0) && (n > 0)) {
            return ackermann(m-1, ackermann(m,n-1));
        } else {
            return 0;
        }
    }
}
