package feb23lab;
class Employee{
	int IcrementSalary(){
		return 0;
	}}
class Developer extends Employee{
	int IcrementSalary(){
		return 0;
	}}
class Manager extends Employee{
	int IcrementSalary(){
		return 0;
	}}
public class Question2 {
	public static void main(String[] args) {
		Employee employee;
		employee = new Developer();
		System.out.println(employee.IcrementSalary());
		employee = new Manager();
		System.out.println(employee.IcrementSalary());	
	}}

	 