import java.util.*;
class Demo1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
			
		int arr[] = new int [size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int sum=0; 
		for(int i=0;i<arr.length;i++){
			sum =sum+arr[i];
		}
		
		System.out.println("Average : " + sum/size);
	}
}
