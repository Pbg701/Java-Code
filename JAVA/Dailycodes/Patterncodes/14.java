import java.util.*;
class Demo14{
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int row =sc.nextInt();
		int num=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i +" " );
			}
			System.out.println();
		}
	}
}
