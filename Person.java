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
