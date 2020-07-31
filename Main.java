package com.san;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Human[] human = new Human[2];
        human[0] = new Human("Человек1", 1, 100);
        human[1] = new Human("Человек2", 2, 300);

        Cat[] cats = new Cat[2];
        cats[0] = new Cat("Кот1", 3, 500);
        cats[1] = new Cat("Кот2", 4, 150);

        Robot[] robots = new Robot[2];
        robots[0] = new Robot("Робот1", 0, 1500);
        robots[1] = new Robot("Робот2", 0, 5000);

        Treadmill[] treadmill = new Treadmill[2];
        treadmill[0] = new Treadmill("Беговая дорожка 1", 250);
        treadmill[1] = new Treadmill("Беговая дорожка 2", 550);

        Wall[] wall = new Wall[2];
        wall[0] = new Wall("Стена 1", 1);
        wall[1] = new Wall("Стена 2", 5);

        System.out.println("Характеристики участников:");

        for(Human h: human)
            h.info();

        for(Cat c: cats)
            c.info();

        for(Robot r: robots)
            r.info();

        System.out.println("Характеристики препятствий:");

        for(Treadmill t: treadmill)
            t.info();
        for(Wall w: wall)
            w.info();

        System.out.println("Старт:");

        for(int i = 0; i < human.length; i++){
            for (int a = 0; a < treadmill.length; a++){
                if (human[i].getRun() < treadmill[a].getDistance()) {

                }
                else{
                    System.out.println(human[i].getName()+" пробежал дистанцию "+ treadmill[a].getDistance());
                }

            }
            for (int z = 0; z < wall.length; z++){
                if (human[i].getRun() < wall[z].getHeight()) {
                }
                else{
                    System.out.println(human[i].getName()+" перепрыгнул стену "+ wall[z].getHeight());
                }
            }
        }
        for(int i = 0; i < cats.length; i++){
            for (int a = 0; a < treadmill.length; a++){
                if (cats[i].getRun() < treadmill[a].getDistance()) {

                }
                else{
                    System.out.println(cats[i].getName()+"пробежал дистанцию"+ treadmill[a].getDistance());
                }
            }
            for (int z = 0; z < wall.length; z++){
                if (cats[i].getRun() < wall[z].getHeight()) {
                }
                else{
                    System.out.println(cats[i].getName()+" перепрыгнул стену "+ wall[z].getHeight());
                }
            }
        }
        for(int i = 0; i < robots.length; i++){
            for (int a = 0; a < treadmill.length; a++){
                if (robots[i].getRun() < treadmill[a].getDistance()) {

                }
                else{
                    System.out.println(robots[i].getName()+"пробежал дистанцию"+ treadmill[a].getDistance());
                }
            }
            for (int z = 0; z < wall.length; z++){
                if (robots[i].getRun() < wall[z].getHeight()) {
                }
                else{
                    System.out.println(robots[i].getName()+" перепрыгнул стену "+ wall[z].getHeight());
                }
            }
        }

    }
}
