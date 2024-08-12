package com.xworkz.tv.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;

import com.xworkz.tv.constant.ConnectEnumDb;
import com.xworkz.tv.dto.TvDto;

public class TvRunner {
	public LocalDateTime dateTime;
	public static void main(String[] args) throws Exception {

		TvDto dto = new TvDto(1, "amith", 22);
		
		Connection connection = DriverManager.getConnection(ConnectEnumDb.URL.getName(),
				ConnectEnumDb.USERNAME.getName(), ConnectEnumDb.PASSWORD.getName());

		String query = "insert into tv_table values(?,?,?)";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setInt(1, dto.getId());
		preparedStatement.setString(2,dto.getName());
		preparedStatement.setInt(3, dto.getAge());
		
		int value=preparedStatement.executeUpdate();

	}

}
