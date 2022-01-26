package com.database;
import java.sql.*;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
        public static void main(String[] args) throws ClassNotFoundException {
            //JDBC

            Scanner sc = new Scanner(in);

        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","root");
            Statement statement =connection.createStatement();

            statement.addBatch("INSERT INTO author(name,surname,birthday,sex) VALUES ('Ruslan','Hetman','2001-11-28','Men')");
            statement.executeBatch();
            statement.clearBatch();

            statement.execute("INSERT INTO book(name,price,genre,dateOfpublications,numbers,idauthor) VALUES ('Java for beginners',300,'It literature','2015-02-01',200,1)");

            int res =statement.executeUpdate("UPDATE book SET price=300 WHERE idbook=1");
            System.out.println(res);

            ResultSet myRs = statement.executeQuery("select * from author");
            while (myRs.next()){
                System.out.println(myRs.getString("name") + "," + myRs.getString("surname"));
            }

            boolean status = statement.isClosed();
            System.out.println(status);
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
