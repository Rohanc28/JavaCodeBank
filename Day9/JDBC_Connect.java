package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.IOException;

public class JDBC_Connect {

	public static void main(String[] args) {
		try {
			//init
			String SqlUsername = "system";
			String SqlPassword = "enter_your password";
			String SqlUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			
			Connection connection = null;
			Statement statement = null;
			ResultSet resultSet = null;
			
			//connecting
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			connection = DriverManager.getConnection( SqlUrl , SqlUsername, SqlPassword);
			
			
			
			//exec query and save it in resultset
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM emp");
			
			//writing to file
			String fileDir="C:\\Users\\rchaturvedi\\eclipse-workspace\\JDBC\\src\\JDBC\\emp_data.csv";
			FileWriter fileWrite = new FileWriter(fileDir);
			
			fileWrite.write("id,name,age,salary\n");
			System.out.println(resultSet);
			
			while(resultSet.next()) {
				System.out.println("YES");
				int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                float salary = resultSet.getFloat("salary");
                
                fileWrite.write(id + ", " + name + ", " + salary + " \n");
                System.out.println(id + ", " + name + ", " + salary + " \n");
            }
			
			fileWrite.close();
            
            System.out.println("Data written to employee_data.csv");
			} catch (Exception ep) {
				System.out.println(":(");
			}
        	
        }

}
