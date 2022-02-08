package sortpackage;

import java.util.Scanner;

public class NewSort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  
		Scanner sc=new Scanner(System.in);  
		int[] arr = new int[3];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<3; i++)  
		{   
		arr[i]=sc.nextInt();  
		}  
		
		
		int temp = 0;  
        for(int i=0; i < 3; i++)
        {  
                for(int j=1; j < (3-i); j++)
                {  
                         if(arr[j-1] > arr[j])
                         {  
                                //swap elements  
                                temp = arr[j-1];  
                                arr[j-1] = arr[j];  
                                arr[j] = temp;  
                        }  
                         
                }  
        } 
          
        for(int i=0; i < 3; i++)
        {  
                System.out.print(arr[i] + " ");  
        }  

	}

}
