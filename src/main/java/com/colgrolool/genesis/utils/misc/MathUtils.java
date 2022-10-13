package com.colgrolool.genesis.utils.misc;

public class MathUtils {
    public static long now() {return System.currentTimeMillis();}

    public static long msPassed(Long start) {return System.currentTimeMillis() - start;}

    public static String msPassedRound(Long start) {return String.valueOf(Math.round(msPassed(start) * 100.0) / 100.0);}
}
