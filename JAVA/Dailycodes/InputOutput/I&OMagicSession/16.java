import java.util.*;
class Demo16{
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int row = sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(" " +j +(char)(j+64) );
			}
			System.out.println();
		}
	}
}
