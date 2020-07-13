
import java.util.*;

public class less03 {
    public static void main(String[] args){
        ranDom();
        ranDom1();
    }

    public static void ranDom() {

        int r = 0;
        Random rand = new Random();
        int a = rand.nextInt(9);

        while (r < 3) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число: ");
            int x = sc.nextInt();

            if (x == a)
            {
                System.out.println("Верно вы угадали");
                r = 4;
            }
            else if ( x > a){
                System.out.println("Ваша число больше загаданного");
                r++;
            }
            else if ( x < a){
                System.out.println("Ваша число меньше загаданного");
                r++;
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»: ");
        int y = sc.nextInt();
        if (y == 1){
            ranDom();
        }
    }

    public static void ranDom1() {

        Random rand = new Random();
        int x = rand.nextInt(25);
        boolean r = true;

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String tmpWords = words[x];

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        while (r) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Какое из выше слов загаданно?");
            String y = sc.nextLine();

            if (tmpWords.equals(y)){
                System.out.println("Угадал");
                r = false;
            } else {
                System.out.println(words[x].substring(0, 2) + "***************");
            }
        }

    }

}
=======
import java.util.*;

public class less03 {
    public static void main(String[] args){
        ranDom();
        ranDom1();
    }

    public static void ranDom() {

        int r = 0;
        Random rand = new Random();
        int a = rand.nextInt( 9);

        while (r < 3) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число: ");
            int x = sc.nextInt();

            if (x == a)
            {
                System.out.println("Верно вы угадали");
                r = 4;
            }
            else if ( x > a){
                System.out.println("Ваша число больше загаданного");
                r++;
            }
            else if ( x < a){
                System.out.println("Ваша число меньше загаданного");
                r++;
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»: ");
        int y = sc.nextInt();
        if (y == 1){
            ranDom();
        }
    }

    public static void ranDom1() {

        Random rand = new Random();
        int x = rand.nextInt(25);
        boolean r = true;

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String tmpWords = words[x];

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        while (r) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Какое из выше слов загаданно?");
            String y = sc.nextLine();

            if (tmpWords.equals(y)){
                System.out.println("Угадал");
                r = false;
            } else {
                System.out.println(words[x].substring(0, 2) + "***************");
            }
        }

    }

}

