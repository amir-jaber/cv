package com.entage.amirj.cv;

import android.util.Log;

/**
 * Created by amirj on 11/1/2017.
 */

public class Bisection {
    double f(double x) { return x * x * x + 5 * x - 3; }

    double f1(double x) { return x * x - 8; }

    double f2(double x) { return (x + 5 * x) / 2 * x; }


    public double findMax(double a, double b, double eps, int n) {

        double c = 0;
        switch (n) {
            case 0:
                while ((b - a) > 2 * eps) {
                    c = (a + b) / 2;
                    if (f(c) == 0) {
                        break;
                    }
                    if (f(a) * f(c) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                break;
            case 1:
                while ((b - a) > 2 * eps) {
                    c = (a + b) / 2;
                    if (f1(c) == 0) {
                        break;
                    }
                    if (f1(a) * f1(c) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                break;
            case 2:
                while ((b - a) > 2 * eps) {
                    c = (a + b) / 2;
                    if (f2(c) == 0) {
                        break;
                    }
                    if (f2(a) * f2(c) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                break;
        }


        Log.d("TAG", "max is " + c);
        return c;
    }


    public double findMin(double a, double b, double eps, int n) {

        double c = 0;
        switch (n) {
            case 0:
                while ((b - a) > 2 * eps) {
                    c = (a + b) / 2;
                    if (f(c) == 0) {
                        break;
                    }
                    if (f(a) * f(c) > 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                break;
            case 1:
                while ((b - a) > 2 * eps) {
                    c = (a + b) / 2;
                    if (f1(c) == 0) {
                        break;
                    }
                    if (f1(a) * f1(c) > 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                break;
            case 2:
                while ((b - a) > 2 * eps) {
                    c = (a + b) / 2;
                    if (f2(c) == 0) {
                        break;
                    }
                    if (f2(a) * f2(c) > 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                break;
        }


        Log.d("TAG", "min is " + c);
        return c;
    }
}


