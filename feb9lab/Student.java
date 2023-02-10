package lab9;
	public class Student {
		Student(){
			System.out.println("This is a Student Class:");
		}
		
			int age;
			String name;
			// Parameterized cons where we have to pass the parameter / arguments
			Student (int a,String n){
				age =a;
				name =n;	
			}
			void show() {
				System.out.println(age+" "+name);
			}
			public static void main(String[] args) {
				Student student=new Student();
				Student d=new Student(50,"Karan");
				Student d1=new Student(25,"Rohit");
				Student d2=new Student(21,"Roma");
			d.show();
			d1.show();
			d2.show();
			}
	}