package exceptionDemo;

import java.sql.SQLException;

public class ExceptionsHandeling {

	public static void main(String[] args)  {
		Account acc = new Account();
		try {
			System.out.println("1st Line");
			acc.withdraw(100);
			System.out.println("After trying the witdraw method");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//System.out.println(e.getMessage());
			System.out.println("Server is Down Please Try Again Later");
		}
		finally {
			System.out.println("Always Run");
		}

	}

}
