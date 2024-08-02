package com.xworkz.tyre.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.xworkz.tyre.constant.TyreConnectionDb;

public class TyreConnectionDbRunner {

	public static void main(String[] args) throws Exception {

		Connection connection = DriverManager.getConnection(TyreConnectionDb.URL.getName(),
				TyreConnectionDb.USERNAME.getName(), TyreConnectionDb.PASSWORD.getName());

		Statement statement = connection.createStatement();

//		int value = statement.executeUpdate(
//				"insert into customer_details(id,name,p_no,email,address) values(1,'Amith',8542442257,'amith11@gmail.com','Bengaluru')");
//		int value1 = statement.executeUpdate(
//				"insert into customer_details values(99,'tejas',8542442257,'teju3872@gmail.com','chitradurga')");
//		int value2 = statement
//				.executeUpdate("insert into customer_details values(11,'ravi',7836856484,'ravi387@gmail.com','hubli')");
//		int value3 = statement.executeUpdate(
//				"insert into customer_details values(12,'revanth',9737783927,'revazza827@gmail.com','mysore')");
//		int value4 = statement.executeUpdate(
//				"insert into customer_details values(13,'rakshith',8753668893,'rakshi2736@gmail.com','davangere')");
//		int value5 = statement.executeUpdate(
//				"insert into customer_details values(14,'suhas',7778367896,'suhas7824@gmail.com','devanahalli')");
//		int value6 = statement.executeUpdate(
//				"insert into customer_details values(15,'girish',9873098866,'giric763@gmail.com','chikkballapura')");
//		int value7 = statement.executeUpdate(
//				"insert into customer_details values(16,'haji',8542442257,'shaji372@gmail.com','tumkur')");
//		int value8 = statement.executeUpdate(
//				"insert into customer_details values(17,'hareesh',8542442257,'hareeshahr673@gmail.com','hassan')");
//		int value9 = statement.executeUpdate(
//				"insert into customer_details values(18,'purshi',8542442257,'purushetty6732@gmail.com','mandya')");
//		int value10 = statement.executeUpdate(
//				"insert into customer_details values(19,'Sufiyan',8542442257,'sufi37827v@gmail.com','vijayapura')");
//		int value11 = statement.executeUpdate(
//				"insert into customer_details values(10,'yallalinga',8542442257,'ylinga7826h@gmail.com','bellary')");
//		int value12 = statement.executeUpdate(
//				"insert into customer_details values(2,'Amar',8542442257,'amar89217g@gmail.com','bagalkot')");
//		int value13 = statement.executeUpdate(
//				"insert into customer_details values(3,'raam',8542442257,'raamgh487@gmail.com','bidar')");
//		int value14 = statement.executeUpdate(
//				"insert into customer_details values(4,'akshay',8542442257,'akki766@gmail.com','gulbarga')");
//		int value15 = statement.executeUpdate(
//				"insert into customer_details values(5,'Anjan',8542442257,'anjankaran7@gmail.com','bijapur')");
//		int value16 = statement.executeUpdate(
//				"insert into customer_details values(6,'Akash',8542442257,'akash78u6v@gmail.com','varanashi')");
//		int value17 = statement.executeUpdate(
//				"insert into customer_details values(7,'Abhi',8542442257,'abhi3786@gmail.com','ayodha')");
//		int value18 = statement.executeUpdate(
//				"insert into customer_details values(8,'Akhil',8542442257,'akhilg736@gmail.com','kolar')");
//		int value19 = statement.executeUpdate(
//				"insert into customer_details values(9,'shivararm',8542442257,'shivaramg376@gmail.com','sangli')");
//		int value20 = statement.executeUpdate(
//				"insert into customer_details values(21,'Umesh',8542442257,'umesha7532f@gmail.com','pune')");
//		int value21 = statement.executeUpdate(
//				"insert into customer_details values(22,'chethan',8542442257,'chethu37h@gmail.com','mumbai')");
//		int value22 = statement.executeUpdate(
//				"insert into customer_details values(23,'Surya',8542442257,'surya8723n@gmail.com','kolkata')");
//		int value23 = statement.executeUpdate(
//				"insert into customer_details values(24,'Shanthanu',8542442257,'shanthanuj7@gmail.com','chennai')");
//		int value24 = statement.executeUpdate(
//				"insert into customer_details values(25,'Avirath',8542442257,'avisuresh873@gmail.com','punjab')");
//		int value25 = statement.executeUpdate(
//				"insert into customer_details values(26,'Raghu',8542442257,'raghumohan37@gmail.com','srinagar')");
//		int value26 = statement.executeUpdate(
//				"insert into customer_details values(27,'suresh',8542442257,'surim832@gmail.com','gujarat')");
//		int value27 = statement.executeUpdate(
//				"insert into customer_details values(28,'shararth',8542442257,'sharu832h@gmail.com','lucknow')");
//		int value28 = statement.executeUpdate(
//				"insert into customer_details values(29,'Shivu',8542442257,'shivu83g@gmail.com','gandhinagar')");
//		int value29 = statement.executeUpdate(
//				"insert into customer_details values(30,'Nandan',8542442257,'nandandhu7y@gmail.com','kochi')");
//		int value30 = statement.executeUpdate(
//				"insert into customer_details values(31,'Musaib',8542442257,'musaibyewgd6@gmail.com','solapur')");
//		int value31 = statement.executeUpdate(
//				"insert into customer_details values(32,'chandan',8542442257,'chanduhg787@gmail.com','kolhapur')");
//		int value32 = statement.executeUpdate(
//				"insert into customer_details values(33,'Manjunath',8542442257,'manja867g@gmail.com','satara')");
//		int value33 = statement.executeUpdate(
//				"insert into customer_details values(34,'Monish',8542442257,'moniged7@gmail.com','akola')");
//		int value34 = statement.executeUpdate(
//				"insert into customer_details values(35,'Boregowda',8542442257,'boregowgad64@gmail.com','amravati')");
//		int value35 = statement.executeUpdate(
//				"insert into customer_details values(36,'Sanjay',8542442257,'sanju867@gmail.com','washim')");
//		int value36 = statement.executeUpdate(
//				"insert into customer_details values(37,'preetham',8542442257,'preethug7632@gmail.com','jalna')");
//		int value37 = statement.executeUpdate(
//				"insert into customer_details values(38,'Sagar',8542442257,'sagar4973@gmail.com','beed')");
//		int value38 = statement.executeUpdate(
//				"insert into customer_details values(39,'Bharath',8542442257,'bharath327@gmail.com','latur')");
//		int value39 = statement.executeUpdate(
//				"insert into customer_details values(40,'Darshan',8542442257,'darshushetty@gmail.com','nanded')");
//		int value40 = statement.executeUpdate(
//				"insert into customer_details values(41,'Santhosh',8542442257,'santhu873@gmail.com','wardha')");
//		int value41 = statement.executeUpdate(
//				"insert into customer_details values(42,'Sacchidhananda',8542442257,'sacchig873@gmail.com','raigad')");
//		int value42 = statement.executeUpdate(
//				"insert into customer_details values(43,'Shreyas',8542442257,'shreyask873@gmail.com','thane')");
//		int value43 = statement.executeUpdate(
//				"insert into customer_details values(44,'Parikshith',8542442257,'parib356@gmail.com','dhule')");
//		int value44 = statement.executeUpdate(
//				"insert into customer_details values(45,'Prajwal',8542442257,'prajju3872@gmail.com','karur')");
//		int value45 = statement.executeUpdate(
//				"insert into customer_details values(46,'Jeevan',8542442257,'jeevanj73@gmail.com','Madurai')");
//		int value46 = statement.executeUpdate(
//				"insert into customer_details values(47,'Mohan',8542442257,'mohanghdw6@gmail.com','Bengaluru')");
//		int value47 = statement.executeUpdate(
//				"insert into customer_details values(48,'Adarsh',8542442257,'aadhu3726vg@gmail.com','Nilgiris')");
//		int value48 = statement.executeUpdate(
//				"insert into customer_details values(49,'Amogh',8542442257,'amoghg327@gmail.com','Tenkasi')");
//		int value49 = statement.executeUpdate(
//				"insert into customer_details values(50,'indraj',8753665537,'indrajkumar762@gmail.com','Thanjavur')");

		int val=statement.executeUpdate("delete from customer_details where id=11");
		int val1=statement.executeUpdate("delete from customer_details where id=12");		
		int val2=statement.executeUpdate("delete from customer_details where id=13");		
		int val3=statement.executeUpdate("delete from customer_details where id=14");		
		int val4=statement.executeUpdate("delete from customer_details where id=15");
		int val5=statement.executeUpdate("delete from customer_details where id=16");		
		int val6=statement.executeUpdate("delete from customer_details where id=17");		
		int val7=statement.executeUpdate("delete from customer_details where id=18");		
		int val8=statement.executeUpdate("delete from customer_details where id=19");		
		int val9=statement.executeUpdate("delete from customer_details where id=99");		
		int val10=statement.executeUpdate("delete from customer_details where id=10");		
		int val11=statement.executeUpdate("delete from customer_details where id=2");		
		int val12=statement.executeUpdate("delete from customer_details where id=3");		
		int val13=statement.executeUpdate("delete from customer_details where id=4");		
		int val14=statement.executeUpdate("delete from customer_details where id=5");		
		int val15=statement.executeUpdate("delete from customer_details where id=6");		
		int val16=statement.executeUpdate("delete from customer_details where id=7");		
		int val17=statement.executeUpdate("delete from customer_details where id=8");		
		int val18=statement.executeUpdate("delete from customer_details where id=9");		
		int val19=statement.executeUpdate("delete from customer_details where id=21");		
		int val20=statement.executeUpdate("delete from customer_details where id=22");		
		int val21=statement.executeUpdate("delete from customer_details where id=23");		
		int val22=statement.executeUpdate("delete from customer_details where id=24");		
		int val23=statement.executeUpdate("delete from customer_details where id=25");		
		int val24=statement.executeUpdate("delete from customer_details where id=26");
		
		int valu1=statement.executeUpdate("update customer_details set name='Amith',p_no=8542442257,email='amith11@gmail.com',address='Bengaluru' where id=26");
		int valu2=statement.executeUpdate("update customer_details set name='tejas',p_no=8542442257,email='teju3872@gmail.com',address='chitradurga' where id=27");
		int valu3=statement.executeUpdate("update customer_details set name='ravi',p_no=7836856484,email='ravi387@gmail.com',address='hubli' where id=28");
		int valu4=statement.executeUpdate("update customer_details set name='revanth',p_no=9737783927,email='revazza827@gmail.com',address='mysore' where id=29");
		int valu5=statement.executeUpdate("update customer_details set name='rakshith',p_no=8753668893,email='rakshi2736@gmail.com',address='davangere' where id=30");
		int valu6=statement.executeUpdate("update customer_details set name='suhas',p_no=7778367896,email='suhas7824@gmail.com',address='devanahalli' where id=31");
		int valu7=statement.executeUpdate("update customer_details set name='girish',p_no=9873098866,email='giric763@gmail.com',address='chikkballapura' where id=32");
		int valu8=statement.executeUpdate("update customer_details set name='haji',p_no=8542442257,email='shaji372@gmail.com',address='tumkur' where id=33");
		int valu9=statement.executeUpdate("update customer_details set name='hareesh',p_no=8542442257,email='hareeshahr673@gmail.com',address='hassan' where id=34");
		int valu10=statement.executeUpdate("update customer_details set name='purshi',p_no=8542442257,email='purushetty6732@gmail.com',address='mandya' where id=35");
		int valu11=statement.executeUpdate("update customer_details set name='Sufiyan',p_no=8542442257,email='sufi37827v@gmail.com',address='vijayapura' where id=36");
		int valu12=statement.executeUpdate("update customer_details set name='yallalinga',p_no=8542442257,email='ylinga7826h@gmail.com',address='bellary' where id=37");
		int valu13=statement.executeUpdate("update customer_details set name='Amar',p_no=8542442257,email='amar89217g@gmail.com',address='bagalkot' where id=38");
		int valu14=statement.executeUpdate("update customer_details set name='raam',p_no=8542442257,email='raamgh487@gmail.com',address='bidar' where id=39");
		int valu15=statement.executeUpdate("update customer_details set name='akshay',p_no=8542442257,email='akki766@gmail.com',address='gulbarga' where id=40");
		int valu16=statement.executeUpdate("update customer_details set name='Anjan',p_no=8542442257,email='anjankaran7@gmail.com',address='bijapur' where id=41");
		int valu17=statement.executeUpdate("update customer_details set name='Abhi',p_no=8542442257,email='akash78u6v@gmail.com',address='varanashi' where id=42");
		int valu18=statement.executeUpdate("update customer_details set name='chethan',p_no=8542442257,email='chethu37h@gmail.com',address='mumbai' where id=43");
		int valu19=statement.executeUpdate("update customer_details set name='Umesh',p_no=8542442257,email='umesha7532f@gmail.com',address='pune' where id=44");
		int valu20=statement.executeUpdate("update customer_details set name='shivararm',p_no=8542442257,email='shivaramg376@gmail.com',address='sangli' where id=45");
		int valu21=statement.executeUpdate("update customer_details set name='Akhil',p_no=8542442257,email='akhilg736@gmail.com',address='kolar' where id=46");
		int valu22=statement.executeUpdate("update customer_details set name='Raghu',p_no=8542442257,email='raghumohan37@gmail.com',address='srinagar' where id=47");
		int valu23=statement.executeUpdate("update customer_details set name='Avirath',p_no=8542442257,email='avisuresh873@gmail.com',address='punjab' where id=48");
		int valu24=statement.executeUpdate("update customer_details set name='Shanthanu',p_no=8542442257,email='shanthanuj7@gmail.com',address='chennai' where id=49");
		int valu25=statement.executeUpdate("update customer_details set name='Surya',p_no=8542442257,email='surya8723n@gmail.com',address='kolkata' where id=1");
		
		
		
		if (valu25 == 1) {
			System.out.println("connected successfully");
		} else {
			System.err.println("not connected");
		}

	}

}
