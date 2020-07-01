public class less01 {
    public static void main (String [] args){
        System.out.println(calculate(2, 2, 2, 2));
        System.out.println(task10and20(11,5));
        isPositiveOrNegative(-11);
        System.out.println(isNegative(-19));
        greetings("Год ");
    }

    public static boolean task10and20(int x1, int x2) {
        if(x1 > 10) {
            if (x1 < 20) {
                System.out.println("X1 вдиапозоне 10 - 20");
            }
        }
        if(x2 > 10){
            if(x2 < 20)
            {
                System.out.println("X2 вдиапозоне 10 - 20");
            }
        }
        else System.out.println("X2 = " + x2);

        return false;
    }

    public static int calculate(int a, int b, int c, int d) {

        return  a * (b + (c / d));
    }
    public static void isPositiveOrNegative(int x) {
        if(x >= 0) {
            System.out.println(x + " Положительное целое");
        } else {
            System.out.println(x + " Отрицательное целое");
        }
    }
    public static boolean isNegative(int x) {
        if(x < 0) {
            return true;
        }
        return false;
    }

    public static void greetings(String name) {

        for (int i=4; i<=2020; i++)
        {
            if ((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0)))
                System.out.println(i);
        }
    }
}
