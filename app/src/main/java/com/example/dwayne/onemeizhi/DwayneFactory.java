package com.example.dwayne.onemeizhi;

/**
 * Created by Dwayne on 2017/11/25.
 */

public class DwayneFactory {
    protected static  final Object monitor = new Object();
    static GankApi sGankIOSingleton;

    public static GankApi getsGankIOSingleton() {
        synchronized (monitor) {
            if(sGankIOSingleton == null) {
                sGankIOSingleton = new DwayneRetrofit().getGankService();
            }
            return sGankIOSingleton;
        }
    }
}
