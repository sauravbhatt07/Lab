package feb23lab;
class Sports{ //parent class
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }}
class Soccer extends Sports{ //child class
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }}
public class Question3 { //main class
	public static void main(String[] args) {
		Sports game=new Sports(); 
		System.out.println(game.getName());
		game.getNumberOfTeamMembers();
		Soccer game2=new Soccer();
		System.out.println(game2.getName());
		game2.getNumberOfTeamMembers();	
	}}
