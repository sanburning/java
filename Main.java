package com.san;

public class Main {

    public static void main(String[] args) {

        String[][] array = {{"5", "6", "7", "@"}, {"4", "3", "2", "1"}};

        MyArraySizeException(array);

        MyArrayDataException(array);
    }

    private static void MyArrayDataException(String[][] array) {
        try {
            for (int i = 0; i < 2; i++) {
                for (int x = 0; x < 4; x++) {
                    System.out.println(Integer.parseInt(array[i][x]));
                }
            }
        }
        catch(NumberFormatException e){
            System.out.println("Ошибка" + e.getMessage()) ;
        }
        finally{
            System.out.println("Работа завершена успешно");
        }
    }

    public static void MyArraySizeException(String[][] a){
        try {
            for (int i = 0; i < 2; i++) {
                for (int x = 0; x < 4; x++) {
                    System.out.println(a[i][x]);
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Выход индекса за границу массива");
            }
        finally{
                System.out.println("Работа завершена успешно");
            }
    }
}
