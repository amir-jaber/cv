package com.entage.amirj.cv;

import android.util.Log;

/**
 * Created by amirj on 11/1/2017.
 */

public class Fibonacci {

    double f(double x) {
        return Math.pow(x + 1, 3) + 5 * Math.pow(x, 2);
    }

    double f1(double x) {
        return x + 5 * Math.pow(x, 3);
    }

    double f2(double x) {
        return x - Math.pow(x, 2);
    }

    public double findMax(double a, double b, double e, int n) {
        double d = e / 10;
        long Fn = 50000;


        int F1, F0, F, N;
        double x1, x2, y1, y2, x = 0, y = 0;
        F0 = 1;
        F1 = 1;
        F = 0;
        N = 0;
        switch (n) {
            case 0:
                while (F < Fn) {
                    F = F1 + F0;
                    if (F < Fn) {
                        F0 = F1;
                        F1 = F;
                    }
                }
                x1 = a + F0 * (b - a) / F;
                x2 = a + F1 * (b - a) / F;
                y1 = f(x1);
                y2 = f(x2);
                N = 0;
                do {
                    if (y1 <= y2) {
                        b = x2;
                        x2 = x1;
                        y2 = y1;
                        x1 = a + b - x2;
                        y1 = f(x1);
                    } else {
                        a = x1;
                        x1 = x2;
                        y1 = y2;
                        x2 = a + b - x1;
                        y2 = f(x2);
                    }
                    N++;
                }
                while (b - a > 2 * e);
                if (y1 <= y2) {
                    b = x2;
                    x2 = x1;
                    y2 = y1;
                } else a = x1;
                x1 = x2 - d;
                y1 = f(x1);
                x = (a + b) / 2;
                y = f(x);

                break;
            case 1:
                while (F < Fn) {
                    F = F1 + F0;
                    if (F < Fn) {
                        F0 = F1;
                        F1 = F;
                    }
                }
                x1 = a + F0 * (b - a) / F;
                x2 = a + F1 * (b - a) / F;
                y1 = f1(x1);
                y2 = f1(x2);
                N = 0;
                do {
                    if (y1 <= y2) {
                        b = x2;
                        x2 = x1;
                        y2 = y1;
                        x1 = a + b - x2;
                        y1 = f1(x1);
                    } else {
                        a = x1;
                        x1 = x2;
                        y1 = y2;
                        x2 = a + b - x1;
                        y2 = f1(x2);
                    }
                    N++;
                }
                while (b - a > 2 * e);
                if (y1 <= y2) {
                    b = x2;
                    x2 = x1;
                    y2 = y1;
                } else a = x1;
                x1 = x2 - d;
                y1 = f1(x1);
                x = (a + b) / 2;
                y = f1(x);

                break;
            case 2:
                while (F < Fn) {
                    F = F1 + F0;
                    if (F < Fn) {
                        F0 = F1;
                        F1 = F;
                    }
                }
                x1 = a + F0 * (b - a) / F;
                x2 = a + F1 * (b - a) / F;
                y1 = f2(x1);
                y2 = f2(x2);
                N = 0;
                do {
                    if (y1 <= y2) {
                        b = x2;
                        x2 = x1;
                        y2 = y1;
                        x1 = a + b - x2;
                        y1 = f2(x1);
                    } else {
                        a = x1;
                        x1 = x2;
                        y1 = y2;
                        x2 = a + b - x1;
                        y2 = f2(x2);
                    }
                    N++;
                }
                while (b - a > 2 * e);
                if (y1 <= y2) {
                    b = x2;
                    x2 = x1;
                    y2 = y1;
                } else a = x1;
                x1 = x2 - d;
                y1 = f2(x1);
                x = (a + b) / 2;
                y = f2(x);

                break;
        }

        return x;
    }

    public double findMin(double a, double b, double e, int n) {
        double d = e / 10;
        long Fn = 50000;


        int F1, F0, F, N;
        double x1, x2, y1, y2, x = 0, y = 0;
        F0 = 1;
        F1 = 1;
        F = 0;
        N = 0;
        switch (n) {
            case 0:
                while (F < Fn) {
                    F = F1 + F0;
                    if (F < Fn) {
                        F0 = F1;
                        F1 = F;
                    }
                }
                x1 = a + F0 * (b - a) / F;
                x2 = a + F1 * (b - a) / F;
                y1 = f(x1);
                y2 = f(x2);
                N = 0;
                do {
                    if (y1 <= y2) {
                        b = x2;
                        x2 = x1;
                        y2 = y1;
                        x1 = a + b - x2;
                        y1 = f(x1);
                    } else {
                        a = x1;
                        x1 = x2;
                        y1 = y2;
                        x2 = a + b - x1;
                        y2 = f(x2);
                    }
                    N++;
                }
                while (b - a > 2 * e);
                if (y1 <= y2) {
                    b = x2;
                    x2 = x1;
                    y2 = y1;
                } else a = x1;
                x1 = x2 - d;
                y1 = f(x1);
                x = (a + b) / 2;
                y = f(x);

                break;
            case 1:
                while (F < Fn) {
                    F = F1 + F0;
                    if (F < Fn) {
                        F0 = F1;
                        F1 = F;
                    }
                }
                x1 = a + F0 * (b - a) / F;
                x2 = a + F1 * (b - a) / F;
                y1 = f1(x1);
                y2 = f1(x2);
                N = 0;
                do {
                    if (y1 <= y2) {
                        b = x2;
                        x2 = x1;
                        y2 = y1;
                        x1 = a + b - x2;
                        y1 = f1(x1);
                    } else {
                        a = x1;
                        x1 = x2;
                        y1 = y2;
                        x2 = a + b - x1;
                        y2 = f1(x2);
                    }
                    N++;
                }
                while (b - a > 2 * e);
                if (y1 <= y2) {
                    b = x2;
                    x2 = x1;
                    y2 = y1;
                } else a = x1;
                x1 = x2 - d;
                y1 = f1(x1);
                x = (a + b) / 2;
                y = f1(x);

                break;
            case 2:
                while (F < Fn) {
                    F = F1 + F0;
                    if (F < Fn) {
                        F0 = F1;
                        F1 = F;
                    }
                }
                x1 = a + F0 * (b - a) / F;
                x2 = a + F1 * (b - a) / F;
                y1 = f2(x1);
                y2 = f2(x2);
                N = 0;
                do {
                    if (y1 <= y2) {
                        b = x2;
                        x2 = x1;
                        y2 = y1;
                        x1 = a + b - x2;
                        y1 = f2(x1);
                    } else {
                        a = x1;
                        x1 = x2;
                        y1 = y2;
                        x2 = a + b - x1;
                        y2 = f2(x2);
                    }
                    N++;
                }
                while (b - a > 2 * e);
                if (y1 <= y2) {
                    b = x2;
                    x2 = x1;
                    y2 = y1;
                } else a = x1;
                x1 = x2 - d;
                y1 = f2(x1);
                x = (a + b) / 2;
                y = f2(x);

                break;
        }

        return y;
    }
}
