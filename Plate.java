import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(String name, int n, boolean f) {

        Scanner in = new Scanner(System.in);
        System.out.print("Желаете ли вы добавить корма? : ");
        int kr = in.nextInt();

        food += kr;

        if (food >= n) {
            food -= n;
            System.out.println(name+" "+ n +" "+ f +"");
        }
        else {
            f = false;
            System.out.println(name+" "+ n +" "+ f +"");
        }
    }

    public void info() {
        System.out.println("Корма осталось в тарелке: " + food);
    }

}