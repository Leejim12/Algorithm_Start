package 깃.PNU_Algorithm;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i =1;i<a.length;i++)
			if(a[i]>max)
				max = a[i];
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("The maximum value in height");
		System.out.print("The amount of people : ");
		int num = stdIn.nextInt();
		
		int[] height = new int[num];
		
		System.out.println("Key value : " );
		for(int i = 0; i<num;i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "]: " + height[i]);
		}
		
		System.out.println("The maximum value :" + maxOf(height));
		
	}

}
