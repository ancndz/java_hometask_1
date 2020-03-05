package ru.ancndz.task;

public class ByteFormat {

    enum Value {
        B,
        KB,
        MB,
        GB,
        TB,
        PB,
        EB,
        ZB,
        YB
    }

    //метод для приведения байт к нормальному виду. на вход принимается long - байты, на выход дается готовая строка
    public String formatting(long bytes) {

        long b = bytes;
        String ans = "";

        for (Value val: Value.values()) {
            if (b >= 1024) {
                b /= 1024;
            } else {
                double ans_b = b;
                ans = String.format("%.1f", ans_b);
                ans += val.toString();
                break;
            }
        }

        return ans;
    }

}
