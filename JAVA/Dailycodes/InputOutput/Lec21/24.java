import java.io.*;
class Demo24{
	public static void main(String [] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter company name : ");
		String compName =  br.readLine();
		System.out.println("Ente employee Name : ");
		String empName =  br.readLine();
		System.out.println("Enter employee id : ");
		int empId =  br.readLine();
		System.out.println("Company Name : "+ compName);
		System.out.println("Employee Name : "+ empName);
		
	}
}
