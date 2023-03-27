//martin 12345
package  ABC;

import java.util.Random;

public class Array_Main {

	public static void main(String[] args) {

		String[] nouns = new String[7];
		String[] verbs = new String[5];
		String[] adjectives = new String[5];
		fill_nouns(nouns);
		fill_verbs(verbs);
		fill_adjectives(adjectives);
		display_sentences(nouns,verbs,adjectives);
		

	}
	public static void fill_nouns(String[] arry) {
		arry[0]="Ship0";
		arry[1]="ship1";
		arry[2]="ship2";
		arry[3]="ship3";
		arry[4]="ship4";
		arry[5]="ship5";
		arry[6]="ship6";
	}
	
	public static void fill_verbs(String[] arry) {
		arry[0]="asdf";
		arry[1]="asdf";
		arry[2]="asdf";
		arry[3]="asdf";
		
		arry[4]="asdf";
		
		
	}
	public static void fill_adjectives(String[] arry) {
		arry[0]="asdf";
		arry[1]="asdf";
		arry[2]="asdf";
		arry[3]="asdf";
		arry[4]="asdf";
	}
	public static int generate_random_int(int min,int max) {
		Random rand = new Random();
		int value = rand.nextInt();
		value =Math.abs(value);
		value =(value%(max+1)-min)+min;
		return value;
		
	}
	public static void display_sentences(String[] nouns,String[] verbs,String[] adjectives) {
		int nindex1;
		
		int nindex2;
		int vindex;
		int aindex;
		for(int i =0; i<10;i++) {
			nindex1 = generate_random_int(0,nouns.length-1);
			nindex2 = generate_random_int(0,nouns.length-1);
			vindex = generate_random_int(0,verbs.length-1);
			aindex = generate_random_int(0,adjectives.length-1);
			System.out.println("the "+nouns[nindex1]+" "+ verbs[vindex]+" the "+adjectives[aindex]+" "+nouns[nindex2]);
		}
	}

}
