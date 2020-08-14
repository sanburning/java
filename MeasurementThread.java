package com.san;

public class MeasurementThread extends Thread {
    public float[] arr;
    public int deviation;

    public MeasurementThread(float[] arr, int deviation) {
        this.arr = arr;
        this.deviation = deviation;
        start();
    }

    @Override
    public void run() {
        changeArrayValues(arr);
    }

    private static void changeArrayValues(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[(int) i] = (float)(arr[(int) i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
