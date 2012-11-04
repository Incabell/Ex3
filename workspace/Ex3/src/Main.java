import java.util.Scanner;
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
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Value for n? ");
        int n = scan.nextInt();
        int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0, sum7 = 0;
        Integer[] sum = {sum1, sum2, sum3, sum4, sum5, sum6, sum7};
        // Fragment #1
        for ( int i = 0; i < n; i ++)
            sum[0]++;

        // Fragment #2
        for ( int i = 0; i < n; i ++)
            for ( int j = 0; j < n; j ++)
                sum[1]++;

        // Fragment #3
        for ( int i = 0; i < n; i ++)
            for ( int j = i; j < n; j ++)
                sum[2]++;

        // Fragment #4
        for ( int i = 0; i < n; i ++)
            sum4 ++;
            for ( int j = 0; j < n; j ++)
                sum[3]++;

        // Fragment #5
        for ( int i = 0; i < n; i ++)
            for ( int j = 0; j < n*n; j ++)
            sum[4]++;

        // Fragment #6
        for ( int i = 0; i < n; i ++)
            for ( int j = 0; j < i; j ++)
                sum[5]++;

        // Fragment #7
        for ( int i = 1; i < n; i ++)
            for ( int j = 0; j < n*n; j ++)
                if (j % i == 0)
                   for (int k = 0; k < j; k++)
                       sum[6]++;
        
        	String s= "";
	        for(int i = 0; i < sum.length; i++) {
	        	s += " " + sum[i];
	        }
        System.out.println("For the value " + n + " for n, the steps of execution for the different functions are:" + s);
    }
}
