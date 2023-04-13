package April13LAB;
import java.util.ArrayList;
class Person { // make a class for Person name
// create two instance variable for name and age
 String name;
 int age;
// Constructor for the Person class
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }}
public class Question2 { //main class
public static void main(String[] args) { //main method
ArrayList<Person> people = new ArrayList<>(); // Create an ArrayList to store Person objects

     // Add 10 Person objects to the ArrayList
 	 people.add(new Person("Garfield", 25));
     people.add(new Person("Mickey Mouse", 30));
     people.add(new Person("Bugs Bunny", 40));
     people.add(new Person("SpongeBob SquarePants", 20));
     people.add(new Person("Pikachu", 35));
     people.add(new Person("Scooby-Doo", 28));
     people.add(new Person("Goofy", 45));
     people.add(new Person("Linda", 32));
     people.add(new Person("Road Runner", 27));
     people.add(new Person("Ava", 23));
 	 for (Person person :people) { // Loop through the ArrayList and print each Person object
     System.out.println("Name: " + person.name + ", Age: " + person.age);
     }}}
 