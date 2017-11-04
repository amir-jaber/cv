package com.entage.amirj.cv;

import android.widget.Switch;

/**
 * Created by amirj on 11/1/2017.
 */

public class GoldenSection{

    final double PHI = (1 + Math.sqrt(5)) / 2;

    double f(double x){
        return Math.pow(x + 1, 3) + 5 * Math.pow(x, 2);
    }

    double f1(double x){
        return x + 5 * Math.pow(x, 3);
    }

    double f2(double x){
        return x - Math.pow(x, 2);
    }


    double findMin(double a, double b, double e, int n){
        double x1, x2;
        while (true){
            x1 = b - (b - a) / PHI;
            x2 = a + (b - a) / PHI;

            switch(n){

                case 0:

                    if (f(x1) >= f(x2))
                        a = x1;
                    else
                        b = x2;
                    break;
                case 1:

                    if (f1(x1) >= f1(x2))
                        a = x1;
                    else
                        b = x2;
                    break;
                case 2:

                    if (f2(x1) >= f2(x2))
                        a = x1;
                    else
                        b = x2;
                    break;
            }

            if (Math.abs(b - a) < e)
                break;
        }
        return (a + b) / 2;
    }

    double findMax(double a, double b, double e, int n){
        double x1, x2;
        while (true){
            x1 = b - (b - a) / PHI;
            x2 = a + (b - a) / PHI;

            switch(n) {

                case 0:
                    if (f(x1) <= f(x2))
                        a = x1;
                    else
                        b = x2;
                    break;
                case 1:
                    if (f1(x1) <= f1(x2))
                        a = x1;
                    else
                        b = x2;
                    break;
                case 2:
                    if (f2(x1) <= f2(x2))
                        a = x1;
                    else
                        b = x2;
                    break;

            }
            if (Math.abs(b - a) < e)
                break;
        }
        return (a + b) / 2;
    }

}
