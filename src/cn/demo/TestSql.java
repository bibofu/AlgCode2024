package cn.demo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestSql {
    @Test
    public void test1(){
        String url = "jdbc:mysql://47.119.17.174:3306/mysql";
        String user_name = "root";
        String pass_word = "123456";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user_name,pass_word);
            if (conn == null){
                System.out.println("error happen");
            }else {
                System.out.println("okokok");
                System.out.println(conn);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
