package com.xworkz.tyre.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.xworkz.tyre.constant.TyreConnectionDb;

public class EmployeeConnectionDbRunner {

	public static void main(String[] args) throws Exception {

		Connection connection = DriverManager.getConnection(TyreConnectionDb.URL.getName(),
				TyreConnectionDb.USERNAME.getName(), TyreConnectionDb.PASSWORD.getName());

		Statement statement = connection.createStatement();

		int value = statement.executeUpdate(
				"INSERT INTO employee_details (id, name, age, email, address) VALUES(1, 'Aarav Kumar', 30, 'aarav.kumar@example.com', 'Mumbai')");
		int value1 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(2, 'Vivaan Patel', 25, 'vivaan.patel@example.com', 'Delhi')");
		int value2 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(3, 'Aditya Sharma', 32, 'aditya.sharma@example.com', 'Bangalore')");
		int value3 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(4, 'Vihaan Singh', 45, 'vihaan.singh@example.com', 'Chennai')");
		int value4 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(5, 'Aanya Gupta', 29, 'aanya.gupta@example.com', 'Hyderabad')");
		int value5 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(6, 'Ishaan Verma', 50, 'ishaan.verma@example.com', 'Kolkata')");
		int value6 = statement
				.executeUpdate("INSERT INTO employee_details  VALUES(7, 'Mia Rao', 28, 'mia.rao@example.com', 'Pune')");
		int value7 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(8, 'Reyansh Joshi', 35, 'reyansh.joshi@example.com', 'Ahmedabad')");
		int value8 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(9, 'Saanvi Mehta', 42, 'saanvi.mehta@example.com', 'Jaipur')");
		int value9 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(10, 'Aryan Reddy', 31, 'aryan.reddy@example.com', 'Surat')");
		int value10 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(11, 'Nisha Agarwal', 26, 'nisha.agarwal@example.com', 'Kanpur')");
		int value11 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(12, 'Kabir Sharma', 39, 'kabir.sharma@example.com', 'Nagpur')");
		int value12 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(13, 'Ananya Choudhury', 27, 'ananya.choudhury@example.com', 'Lucknow')");
		int value13 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(14, 'Arjun Patel', 34, 'arjun.patel@example.com', 'Varanasi')");
		int value14 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(15, 'Kriti Singh', 38, 'kriti.singh@example.com', 'Indore')");
		int value15 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(16, 'Tarun Bhatia', 30, 'tarun.bhatia@example.com', 'Amritsar')");
		int value16 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(17, 'Shivani Kapoor', 40, 'shivani.kapoor@example.com', 'Agra')");
		int value17 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(18, 'Rohan Sharma', 33, 'rohan.sharma@example.com', 'Ludhiana')");
		int value18 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(19, 'Sneha Kumar', 29, 'sneha.kumar@example.com', 'Patna')");
		int value19 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(20, 'Vikram Agarwal', 41, 'vikram.agarwal@example.com', 'Nashik')");
		int value20 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(21, 'Ritika Singh', 36, 'ritika.singh@example.com', 'Udaipur')");
		int value21 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(22, 'Manish Reddy', 28, 'manish.reddy@example.com', 'Bhopal')");
		int value22 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(23, 'Meera Joshi', 32, 'meera.joshi@example.com', 'Bhubaneswar')");
		int value23 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(24, 'Nikhil Sharma', 44, 'nikhil.sharma@example.com', 'Mysore')");
		int value24 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(25, 'Pooja Agarwal', 27, 'pooja.agarwal@example.com', 'Trichy')");
		int value25 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(26, 'Raj Patel', 37, 'raj.patel@example.com', 'Coimbatore')");
		int value26 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(27, 'Tanya Mehta', 30, 'tanya.mehta@example.com', 'Raipur')");
		int value27 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(28, 'Ravi Singh', 45, 'ravi.singh@example.com', 'Rourkela')");
		int value28 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(29, 'Sanya Gupta', 38, 'sanya.gupta@example.com', 'Mangalore')");
		int value29 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(30, 'Aditya Rao', 28, 'aditya.rao@example.com', 'Jabalpur')");
		int value30 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(31, 'Shruti Bhatia', 31, 'shruti.bhatia@example.com', 'Dehradun')");
		int value31 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(32, 'Nikhil Patel', 29, 'nikhil.patel@example.com', 'Jammu')");
		int value32 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(33, 'Deepika Choudhury', 40, 'deepika.choudhury@example.com', 'Shimla')");
		int value33 = statement.executeUpdate(
				"INSERT INTO employee_details VALUES(34, 'Siddharth Agarwal', 35, 'siddharth.agarwal@example.com', 'Vellore')");
		int value34 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(35, 'Kavya Joshi', 27, 'kavya.joshi@example.com', 'Udaipur')");
		int value35 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(36, 'Raman Sharma', 33, 'raman.sharma@example.com', 'Siliguri')");
		int value36 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(37, 'Nikita Rao', 42, 'nikita.rao@example.com', 'Tirupati')");
		int value37 = statement.executeUpdate(
				"INSERT INTO employee_details VALUES(38, 'Vishal Singh', 26, 'vishal.singh@example.com', 'Vijayawada')");
		int value38 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(39, 'Simran Mehta', 31, 'simran.mehta@example.com', 'Jalandhar')");
		int value39 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(40, 'Rajeev Patel', 29, 'rajeeve.patel@example.com', 'Bilaspur')");
		int value40 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(41, 'Aditi Gupta', 34, 'aditi.gupta@example.com', 'Warangal')");
		int value41 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(42, 'Ishaan Sharma', 37, 'ishaan.sharma@example.com', 'Rishikesh')");
		int value42 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(43, 'Aishwarya Singh', 30, 'aishwarya.singh@example.com', 'Aligarh')");
		int value43 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(44, 'Gaurav Patel', 45, 'gaurav.patel@example.com', 'Saharanpur')");
		int value44 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(45, 'Pallavi Joshi', 33, 'pallavi.joshi@example.com', 'Gorakhpur')");
		int value45 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(46, 'Nitin Agarwal', 29, 'nitin.agarwal@example.com', 'Kakinada')");
		int value46 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(47, 'Anjali Rao', 31, 'anjali.rao@example.com', 'Raigarh')");
		int value47 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(48, 'Pranav Sharma', 28, 'pranav.sharma@example.com', 'Jamshedpur')");
		int value48 = statement.executeUpdate(
				"INSERT INTO employee_details  VALUES(49, 'Sonal Mehta', 40, 'sonal.mehta@example.com', 'Bareilly')");
		int value49 = statement.executeUpdate(
				"INSERT INTO employee_details VALUES(50, 'Rajat Gupta', 32, 'rajat.gupta@example.com', 'Guntur')");

		if (value40 == 1) {
			System.out.println("connected successfully");
		} else {
			System.out.println("not connected");
		}

	}

}
