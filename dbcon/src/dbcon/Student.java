package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;

public class Student {
    public static void main(String[] args) throws Exception {
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;


        String dbUrl = "jdbc:mysql://localhost:3306/poc";
        String user = "root";
        String pass = "Kowse@17998";
        try {
            myConn = DriverManager.getConnection(dbUrl, user, pass);
            myStmt = myConn.createStatement();
//
// String sql = "CREATE TABLE Student " + "(studentid INTEGER not NULL, "
// + " firstname VARCHAR(255)," + " lastname VARCHAR(255)," + " departmentid INTEGER," +" joiningDate Date,"+" studentDob Date,"+"mobilenumber BIGINT,"+"email varchar(45),"+ " PRIMARY KEY ( studentid,joiningdate ))";
// myStmt.executeUpdate(sql);




            System.out.println("Created table in given database...");


            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO Stud VALUES (1,'Kowsalya','Balachander',1,'2020-05-02','1998-01-19',9074561234,'k.balachander@perficient.com')";
            myStmt.executeUpdate(sql);
            sql = "INSERT INTO Stud VALUES (2,'Keerthana','Kumar',1,'2019-03-02','1998-01-21',9834509678,'keerthana.kumar@gmail.com')";
            myStmt.executeUpdate(sql);
            sql = "INSERT INTO Stud VALUES (3,'Divya','Krishnan',1,'2021-06-02','1998-01-22',9876234567,'divyakrishnan@gmail.com')";
            myStmt.executeUpdate(sql);

            System.out.println("Inserted records into the table...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

            if (myStmt != null) {
                myStmt.close();
            }



            if (myConn != null) {
                myConn.close();
            }
        }



    }



}