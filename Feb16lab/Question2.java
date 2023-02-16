package feb16lab;
class A {
    void A() {
       System.out.println("This is class A.");
   }}
class B extends A {
    void B() {
       System.out.println("This is class B.");
   }}
class C extends B {
    void c() {
       System.out.println("This is class C.");
   }}  
public class Question2 {
	public static void main(String[] args) {
       C obj = new C();
       obj.A();  // Output: This is class A.
       obj.B();  // Output: This is class B.
       obj.c();;  // Output: This is class C. 

}}