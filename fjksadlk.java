


package PJ1;

import java.util.Scanner;
import java.util.Random;

public class note1006 {
	public static void main(String[] args) {
		double total = 0;// set up value to use later
		double avg =0;
		int max =999999999,min =0;
		Scanner scan = new Scanner(System.in);//scanner start
		System.out.println("enter the min random integer");
		min = user_input_int(scan,max,min);// right side be the input with the function name and value
		System.out.println("enter the max random integer:");
		max = user_input_int(scan,max,min);
		System.out.println("you entered a min of" + min +"and a max of" + max);
		// telling the user the range he choose range 
		scan.close();// where scan function close
		int new_min = min;//new min and max so it is easier to see the different
		int new_max = max;
		
		int rand_num = gen_random_int_ranged(new_min,new_max);
		/*this function is for calculating 
		*the total and average after 20 rolls
		*/	
		System.out.println("random value:"+rand_num);
		for(int i =0; i<20;i++) {
			total += gen_random_int_ranged(new_min,new_max);
			
		}
		avg = total /20;
		System.out.println("After 20 rolls, the average integer rolled was:"+ avg);
		}
		
	
		

		
	public static int user_input_int(Scanner user_scan,int max,int min){// this function is for making sure the value get in is work
		int user_input = 0;//reset the value
		boolean isInvalid = true;//when it false it stop work and print out exception
		while(isInvalid ||(user_input <=  min || user_input >= max)){
			try {
			System.out.println("please enter the min and max random intergr:\n"+"note: max have to be bigger then mix");
			user_input = user_scan.nextInt();//if input is mismatched the exception occurs here
			isInvalid = false;
			}catch(Exception e) {
				System.out.println("that was not an interger.");
				
				user_scan.next();// i am not sure what is this for, let me ask my teacher again
			}
		}
			
			
		
		return user_input; //return this value back to the place when someone call this function's name
	}
	public static int gen_random_int_ranged(int new_min,int new_max) {
		// new function for limit the value is not bigger then the max and not smaller then the min
		Random rand = new Random();
		int rand_num = (rand.nextInt());
		rand_num = Math.abs(rand_num);
		// negitive make this function mass so better to take it away first
		rand_num = (rand_num%(new_max - new_min+1))+new_min;// from your video
		return rand_num;
		
	}
	
}
