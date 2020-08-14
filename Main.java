package com.san;

public class Main {

    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
	// write your code here
        float[] arr = new float[size];

        for (float f: arr)
        {
            arr[(int) f] = 1;
            //System.out.println(arr[(int) f]);
        }

         oneThread(arr);
          twoThread(arr);

    }
    private static void changeArrayValues(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[(int) i] = (float)(arr[(int) i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    private static void oneThread(float[] arr) {
        long a = System.currentTimeMillis();
        changeArrayValues(arr);
        System.out.println(System.currentTimeMillis() - a);
    }

    private static void twoThread(float[] arr) {
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        MeasurementThread t1 = new MeasurementThread(arr1, 0);
        MeasurementThread t2 = new MeasurementThread(arr2, h);
        t1.run();
        t2.run();
        System.arraycopy(t1.arr, 0, arr, 0, h);
        System.arraycopy(t2.arr, 0, arr, h, h);


        System.out.println(System.currentTimeMillis() - a);
    }
}
