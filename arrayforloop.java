package arrayforloop;

import java.util.Scanner;

public class arrayforloop {

	  public static void main(String[] args) {
	
			    Scanner scan=new Scanner(System.in);
			//create a scanner instance for receives input
			// from the user - input from keyboard
			System.out.print("Enter the Array length: ");
			int len=scan.nextInt();
			int arr[]=new int[len]; //declaration and creation i dim array
			System.out.println("Enter the array elements");
			for(int i=0; i<len; i++){
			arr[i]=scan.nextInt();    
			}
			System.out.println("\narray elements are:");
			for(int i=0; i<len; i++){
			System.out.println(arr[i]);    
			}//display every array element
			}
			

	}


