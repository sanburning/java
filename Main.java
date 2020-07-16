public class Main {

    public static void main (String[] args) {


        Person[] persons = new Person[6];
        persons[0] = new Person("Иванов Иван", "Самый Главный", "ivanov@email.ру", 5000, 100500, 21);
        persons[1] = new Person("Василий Вася", "Помощник Самого Главного", "vasya@email.ру", 5001, 100500, 19);
        persons[2] = new Person("Сидров Сидр", "Советник Помощника Самого Главного", "sidor@email.ру", 5002, 100500, 25);
        persons[3] = new Person("Петров Петя", "Помощник Советника Помощника Самого Главного", "petrov@email.ру", 5003, 100500, 22);
        persons[4] = new Person("Случайно Уцелевший Квалифицированный Исполнитель 1", "Исполнитель", "syki@email.ру", 5004, 100, 59);
        persons[5] = new Person("Случайно Уцелевший Квалифицированный Исполнитель 2", "Исполнитель", "syki1@email.ру", 5004, 100, 69);


        for (Person p: persons)
            if (p.getAge() > 40)
                p.getFullInfo();
    }
}

public class Person {

 String name;
 String position;
 String email;
 int number;
 double salary;
 int age;

 Person( String name, String position, String email, int number, double salary,int age){

  this.name = name;
  this.position = position;
  this.email = email;
  this.number = number;
  this.salary = salary;
  this.age = age;
 }

 void getFullInfo() {
  System.out.println("name: " + name + " | position: " + position + " | email: " + email + " | number: " + number +" | salary: " + salary + " | age: " + age);
 }

 int getAge() {
  return age;
 }

}
