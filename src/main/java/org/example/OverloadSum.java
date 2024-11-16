package org.example;

public class OverloadSum {
    public void sum(final int a, final int b)
    {
        int s = a+b;
        //return a+b;
        System.out.println("sum of integers : " + s);
    }

    public void sum(final String a, final String b)
    {
        String result = a + b;
        System.out.println("sum of integers : " + result);
        //return a+b;
    }

    public void sum(final float a, final float b)
    {
        float result = a + b;
        System.out.println("sum of integers : " + result);
        //return a+b;
    }

    public void sum(final double a, final double b)
    {
        double result = a + b;
        System.out.println("sum of integers : " + result);
    }
}
