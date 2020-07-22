import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Cat[] cat = new Cat[3];

        cat[0] = new Cat("Котэ 1", 15, true);
        cat[1] = new Cat("Котэ 2", 25, true);
        cat[2] = new Cat("Котэ 3", 10, true);

        Plate plate = new Plate(45);
        plate.info();

        for(int i = 0; i < cat.length; i++){
        cat[i].eat(plate);

        }
        plate.info();


    }
}