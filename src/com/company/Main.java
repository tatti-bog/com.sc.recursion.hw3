package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println( telephone(10));
    }

    // recursive
    public static int telNum (int num)
    {
        if (num == 0 || num == 1)
            return 1;
        if ( num >= 2)
        {
            int b = telNum(num -1) + (num-1)*telNum(num-2);
            return b;
        }
        else
            return 404;
    }

    public static int telephone ( int n)
    {
        int first = 1;
        int second = 1;
        if (n == 0 || n==1)
            return 1;

        if ( n >=2)
        {
            int result = 1;

            for ( int i = 1; i < n; i ++)

            {
                result = second + i * first;
                first = second;
                second = result;
            }
             return result;

        }
        else
            return 404;
    }
}
