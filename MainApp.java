package PRODUCT;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		
		ProductOperation p1=new ProductOperation();
		
		System.out.println("1:Login 2:signup");
		int choice=sc.nextInt();
		if(choice==1)
		{
			
			System.out.println("Enter the user name");
			String user=sc.next();
			System.out.println("Enter the password");
			String pass=sc.next();
			
			boolean b=p1.login(user, pass);
			
			if(b)
			{
				System.out.println("1:Add product");
				System.out.println("2:Update PRoduct");
				System.out.println("3:Delete product");
				System.out.println("4:Display product");
				
				
				
				}
			else {
				System.out.println("Inavalid information");
			}
			
		}

	}

}
