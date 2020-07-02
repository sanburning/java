public class less02 {

    public static void main (String [] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        minMax();
        System.out.println(leftRight(new int[] { 2, 2, 2, 1, 2, 2, 10, 1 })); // [2, 2, 2, 1, 2, 2, || 10, 1])// true
        System.out.println(leftRight(new int[] { 1, 1, 1, 3, 1 })); //[1, 1, 1, || 3, 1]) //false
        arrN();
    }

    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println(arr[i]);
        }
    }

    public static void fillArray() {
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + 3;
        }
        System.out.println("Добавление в массив 0 3 6 9 12 15 18 21");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void changeArray() {
        System.out.println("Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] ");
        int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2 ;
            }
            System.out.println(w[i]);
        }
    }

    public static void fillDiagonal() {
        System.out.println("заполнить его диагональные элементы единицами");
        int[][] arr = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for(int a = 0; a < 8; a++){
            if( i == a){
                arr[i][a] = 1;
               }
            else{
                arr[i][a] = 0;
             }
            }
        }

    }

    public static void minMax() {
        System.out.println("минимум и максимум");

        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int maxmin = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxmin){
                maxmin = arr[i];
            }

        }//max
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < maxmin){
                maxmin = arr[i];
            }

        }//min

    }

    static boolean leftRight( int[] arr) {
        int leftSum, rightSum;

        for (int i = 0; i < arr.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum)
                return true;
        }
        return false;

    }

    public static void arrN() {
        System.out.println("смещение массива на N");

        int[] arr = { 1, 2, 3, 4, 5};
        int n = 3;
        int tmp;


        for (int i = n-1; i < arr.length; i++) {

            System.out.println(arr[i]);

            }
        for (int y = 0; y < n-1; y++) {

            System.out.println(arr[y]);
        }

    }

}
