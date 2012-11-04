/**
 * 
 * @author Charlene Kritschmar, Lucie Kaffee
 *
 */
public class Main {

    /**
     * Tells you whether an int is a prime number or not
     * @param n the int you want to test
     * @return the boolean, false means it´s not a prime, true means it is a prime
     */
    public static boolean isPrime(int n) {
        boolean boo = true;
        if (n == 1) {        //1 is a prime number.
            return true;
        }
        for (int i = 2; i < n; i++) { //can only be divided by 1 and itself
            if((n%i) == 0) {
                boo = false;
            }
        }
        return boo;
    }
    
    public static void main(String[] args){
        int n = 10;
        int sum = 0;
        // Fragment #1
        for ( int i = 0; i < n; i ++)
            sum++;

        // Fragment #2
        for ( int i = 0; i < n; i ++)
            for ( int j = 0; j < n; j ++)
                sum++;

        // Fragment #3
        for ( int i = 0; i < n; i ++)
            for ( int j = i; j < n; j ++)
                sum++;

        // Fragment #4
        for ( int i = 0; i < n; i ++)
            sum ++;
            for ( int j = 0; j < n; j ++)
                sum ++;

        // Fragment #5
        for ( int i = 0; i < n; i ++)
            for ( int j = 0; j < n*n; j ++)
            sum++;

        // Fragment #6
        for ( int i = 0; i < n; i ++)
            for ( int j = 0; j < i; j ++)
                sum++;

        // Fragment #7
        for ( int i = 1; i < n; i ++)
            for ( int j = 0; j < n*n; j ++)
                if (j % i == 0)
                   for (int k = 0; k < j; k++)
                       sum++;
    }
}
