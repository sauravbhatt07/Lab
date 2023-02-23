package feb23lab;
class Bank{ //parent class
	float getRateOfInterst(){
		return 0;
	}}
class SBI extends Bank{ //child class 1
	float getRateOfInterst(){
		return 8;
	}}
class ICICI extends Bank{ //child class 2
	float getRateOfInterst(){
		return 7;
	}}
class AXIS extends Bank{ //child class 3
	float getRateOfInterst(){
		return 9;
	}}
class Question1{ //main class
	public static void main(String[] args) {
		Bank bank; //parent class refrence point
		bank = new SBI();
		System.out.println(	bank.getRateOfInterst());
		bank = new ICICI();
		System.out.println(	bank.getRateOfInterst());
		bank = new AXIS();
		System.out.println(	bank.getRateOfInterst());
		}}	
		
	