package feb16lab;
class Teacher {
	String designation = "Soft Skill Teacher";
     String collegeName = "NIET";
void does(){
	System.out.println("Math Teacher");
	}
}
public class IT_Teacher extends Teacher{
	String mainSubject = "IT Teacher";
	public static void main(String args[]){
		IT_Teacher obj = new IT_Teacher();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
System.out.println(obj.mainSubject);
obj.does();
}
	}