package com.learning.DataBase;

import com.learning.utility.ReadConfig;

import java.sql.*;

import static com.learning.utility.LogUtility.info;

public class DBConnection {
    static Connection  con;
    static ReadConfig readConfig = new ReadConfig();

    /*
    first initilize connection to database using Connection class
    create a statement using connection property
    create the query to run
    execute the query using resultset by providing the sql in
    store the value in resultset and print as string , int,


     */


    public static void main(String args[]) throws SQLException {
        String host="jdbc:mysql://localhost:3306/login";
        String username="root";
        String password="admin";
        Statement st=null;
//        Connection  con = DriverManager.getConnection("jdbc:mysql://"+readConfig.gethost()+":"+readConfig.getMysqlPort()+"/"
//                +readConfig.getMysqlDB()+","+readConfig.getMysqlUser()+","+readConfig.getMysqlPass());
        try{
            con=DriverManager.getConnection(host,username,password);
            st=con.createStatement();
            String sql ="select username,password from admin where SPIN=4545";

            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                System.out.println(rs.getString("username"));
                System.out.println(rs.getString("password"));
            }else{
                System.out.println("Something went wrong");
            }
        }catch (Exception e){
            System.out.println(e);
        }


//        ("jdbc:mysql://localhost:3306/login","root","pass@123");
    }

}
