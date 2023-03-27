package cs141_wow;



import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class try_1 {
	
	 
	
	    public static void main(String[] args) 
	    {
	    	
	    	int min = 0;
	    	
	    	int max = 0;
	    	
	    	int total_random=0;
	        
	    	// ask the user some common input min max and sorted or unsorted
	    	
	    	System.out.println("what is the min you want");
	        
	    	Scanner input = new Scanner(System.in);
	       
	    	min = user_input(input,min);
	        
	    	System.out.println("what is the max you want");
	        
	    	Scanner given_max = new Scanner(System.in);
	        
	    	max = user_input(input,max);
	        
	    	System.out.println("how many random number you want ");
	        
	    	Scanner given_total = new Scanner(System.in);
	        
	    	total_random = user_input(input,total_random);
	    	
	    	//define it first
	        
	    	int[] array = new int[total_random];
	        
	        // and then make a value
	        
	    	int index = 0;
	        
	    	// since we not gonna know how many input so using while will be easier
	        
	    	
	        
	        while (true) {
	        
	        	// make a random int
	        	
	        	Random name = new Random();
	        	
	        	
	        	int number_ran =(name.nextInt());
	        	
	        	number_ran =Math.abs(number_ran);
	        	
	        	number_ran =(number_ran%(max-min+1))+min;
	        	
	        	int number =  number_ran;
	            
	            // make a sign so we can use it later 
	            
	        	boolean flag = true;
	            
	        	for (int i = 0; i < array.length; i++) {
	            
	        		// change it to falue so this function will stop when there is same int in this list, true will keep running
	            	
	        		//until all the number 
	                
	        		if (number == array[i]) {
	                
	        			flag = true;
	                }
	        		
	            }
	        	
	            // add the number into the index
	            
	        	if (flag) {
	            
	        		array[index] = number;
	                
	                index = index + 1;
	            }
	     
	            if (index == array.length) {
	      
	            	break;
	            }
	            
	        }
	        
	        //ask the suer see if he wants sorted or unsorted 
	        
	        System.out.println(" do you wanna see the sorted or unsorted lists, please typing y or Y for sorted or n or N for  unsorted to get the one you want");
	        
	        System.out.println("or you can type b for both,what happen if you type something else is this program won't work");
	        
	        String answer = input.next();
	        
	        int[] array2 = array;
	        
	        //replace 
	        	        
	      
	        if (answer.equals("n") || answer.equals("N")) {
	        
	        	System.out.println( Arrays.toString(array2));
	        }
	        
	        else if(answer.equals("b") || answer.equals("B")) { 
	        
	        System.out.println(Arrays.toString(array)+"is the unsorted");
	        
	        int[] array3 = mergeSort(array);
	        
	        System.out.println("this is the sorted one"+Arrays.toString(array3));

	        }
	        
	        else if (answer.equals("y") || answer.equals("Y")){
	        
	        	int[] array3 = mergeSort(array);
	        	
	        	System.out.println("this is the sorted one"+Arrays.toString(array3));
	        	
	        }
	        
	        else {
	        
	        	System.out.println("wrong input,we will get out the game,thanks for using");
	        }
	        
	    }
	        
	    //i add some code so the user have to put in a int for mix ,max and total_random
	    
	    public static int user_input(Scanner user_scan,int limit) {// here is a method that making sure the user is typing number as we want
	    
	    	int user_input =0;
	    	
	    	//copy from note 10/06
	    	
	    	boolean isInvalid = true;
	    	
	    	//make it ture so it will keep running until the time we want it false so we can break it
	    	
	    	while(isInvalid||user_input<0){
	    	
	    		try {
	    		
	    			System.out.println("please type a integer that is bigger then 0 ");
	    			
	    			//making sure that the input is bigger then 0 since negative number is kinda mess the whole program wrong
	    			
	    			user_input = user_scan.nextInt();
	    			
	    			//ask for int if not go catch 
	    			
	    			isInvalid = false;
	    			
	    			// if it work will then break it and get the number we want 
	    		
	    		}catch(Exception e) {
	    		
	    			System.out.println("that is not a integer");
	    			
	    			//if it is not a int remind and ask again, in here have to sue next so i won't get error and then stop working
	    			
	    			user_scan.next();
	    			
	    			//
	    		}
	    		
	    	}
	   
	    	return user_input;//return to where is always a good question,let me ask my teacher later
	    } 
	    
	    
	    public static int[] mergeSort(int[] list) {
	        
	    	// If list is empty; no need to do anything
	        
	    	if (list.length <= 1) {
	        
	    		return list;
	        }
	    	
	 
	        // Create 2 lists to hold 1st half and 2nd half of original list.
	        
	    	int[] first = new int[list.length / 2];
	        
	    	int[] second = new int[list.length - first.length];
	        
	    	// Split the array in half and populate above lists.
	        
	    	System.arraycopy(list, 0, first, 0, first.length);
	        
	    	System.arraycopy(list, first.length, second, 0, second.length);
	 
	        
	    	// in here imaging you get in a circle and get back on the same way kinda like magic
	        
	    	mergeSort(first);
	        
	    	mergeSort(second);
	 
	        // get two list to merge method 
	        
	    	merge(first, second, list);
			
	    	return list;
	        
	    }
	 
	  
	    private static void merge(int[] first, int[] second, int[] result) {
	        
	    	// this is use for the position 
	        
	    	int iFirst = 0;
	 
	        // same as iFirst 
	        
	    	int iSecond = 0;
	 
	        // a index to replace
	        
	    	int iMerged = 0;
	 
	        // Compare elements at iFirst and iSecond,
	       
	    	// and move smaller element at iMerged
	       
	    	while (iFirst < first.length && iSecond < second.length) {
	            
	    		if (first[iFirst] < second[iSecond]) {
	                
	    			result[iMerged] = first[iFirst];
	                
	    			iFirst++;
	            
	    		} else {
	                
	    			result[iMerged] = second[iSecond];
	                
	    			iSecond++;
	            
	    		}
	            
	    		iMerged++;
	        
	    	}
	        
	    	// copy remaining elements from both halves - each half will have already sorted
	       
	    	// elements
	        
	    	System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
	        
	    	System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
	    }
	    
	}


