//Martin 2021W

package cs141_wow;


import java.util.Scanner;
import misc.Misc;
import java.util.Random;


public class final_work {
	static int computer_heal = 10;
	static int player_heal =10;
	
	public static void main(String[] args) {
		
		
		int player_position = misc.Misc.gen_random_int_ranged(0,200);//position around 0 to 200
		int computer_position = misc.Misc.gen_random_int_ranged(200,400);//computer will be the position around 200 tp 400
		
		while(player_heal>0 || computer_heal>0) {
		System.out.println("this is player position"+player_position);
		System.out.println("this is computer position"+computer_position);
		player_position = Position(player_position,"player");//use the position method

		
		System.out.println("what is the degree you want");
		Scanner degree = new Scanner(System.in);
		double degree1 =degree.nextDouble();
		System.out.println("what is the speed you want");//ask for speed
		Scanner speed = new Scanner(System.in);
		double speed1 =speed.nextDouble();
		double point = TNT(degree1,speed1,"player")+player_position;//speed and degree and who playing going to TNT method
		
		if(check_hit(point,computer_position)==true) {//check see did it hit
			System.out.println("your TNT explod around the computer player");
			computer_heal --;//if it does hit the computer position take one bloods away
			System.out.println(computer_heal);//tell the player how much bloods left
		}else {
			System.out.println("sorry you didn't hit the computer,try again next around");//if it is not true then tell the player 
		}
		computer_position=Position(computer_position,"computer");//this step make the computer run in randomly 
		System.out.println("computer player just moved to position"+computer_position);
		int total_distance = computer_position - player_position;
		double shot_distance = computer_tnt(total_distance);//check where computer's TNT is 
		if(Math.abs(total_distance - shot_distance) < 20 == true) {
			System.out.println("computer just hit your position");
			player_heal--;
			System.out.println(player_heal);//if the tnt does hit the player take one blood away and tell the player 
			//he get hit
			
		}else {
			System.out.println("computer just miss his shot");//or if computer miss
		}
		}if(player_heal>computer_heal) {//this help the game stop
			System.out.println("you won,nice job");
		}else if(player_heal<computer_heal) {
			System.out.println("my computer player is way to strong");
		}else if(player_heal==computer_heal) {
			System.out.println("you two are gone at the same time");
		}
}
	public static int Position(int place, String user) {
		if(user.equals("player")) {//see what is the String coming 
		System.out.println("do you wanna move");
		Scanner answer = new Scanner(System.in);
		String answer1 = answer.next();
		if(answer1.equals("y") || answer1.equals("Y")) {// this one asking see if player wanna move
			System.out.println("how mach you wanna move and right and left");
			System.out.println("don't move too much since there is only 200 space for you");
			Scanner distance  = new Scanner(System.in);
			
		int distance1 = distance.nextInt();
			place = place + distance1;
		}else {//no mater what he type will be no move except Y and y
			place = place;
		
		}
		
		
		}else if(user.equals("computer")) {//this help computer move
		int place1 = misc.Misc.gen_random_int_ranged(-20,20);
		place = place1 + place;
		System.out.println("here is computer position"+ place);
		}
		return place;
	}
	public static double TNT(double degree , double speed,String player) {//this help the player calculate 
		double d =0;
		if(player.equals("player")) {
		double radians = Math.toRadians(degree);
		System.out.println(radians);
		d = (speed*speed*Math.sin(2*radians)/9.8);
		System.out.println(d);
		
		}else if(player.equals("computer")) {
			double radians = Math.toRadians(degree);
			
			d = (speed*speed*Math.sin(2*radians)/9.8);
			
			
		}
		return d;
		
		
	}
	public static double computer_tnt(int distance) {//this one help the computer shut the TNT
		double degree_computer =misc.Misc.gen_random_int_ranged(0, 90);
		System.out.println(degree_computer);
		
		double theta = Math.toRadians(degree_computer);//so first we let the computer get the number we need to hit the player
		//and then change it a little bit so no matter what it will always be so close without worry about where the humman player is
		System.out.println(theta);
		double speed = Math.sqrt(distance*9.8/Math.sin(2*theta));
		int max = (int)speed + 5;
		int min = (int)speed - 5;
		speed = misc.Misc.gen_random_int_ranged(min,max);
		System.out.println(speed);
		double shot_distance = speed*speed * Math.sin(2*theta)/9.8;//return the data we need to shout the player 
		
		return shot_distance;
		
	}
	public static boolean check_hit(double hit_point,int player_position) {//if the tnt explode somewhere close to the player or computer will count
		double mix_scop = hit_point-20;
		double max_scop = hit_point +20;
		if(player_position>mix_scop && player_position< max_scop) {
			
			return true;
		}else {
		return false;
		}
		
	}
	
	
	
}
