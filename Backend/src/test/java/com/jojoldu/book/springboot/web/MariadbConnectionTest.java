package com.jojoldu.book.springboot.web;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MariadbConnectionTest {

    //MySQL Connector의 클래스, DB 연결 드라이버 정의
    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    //DB경로
    private static final String URL="jdbc:mysql://uyu7j8yohcwo35j3.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/wric1u2ndzx04cg8";
    private static final String USER="s3cs4ngs9ngxcxkj";
    private static final String PASSWORD="isnusr9sirbb1der";

    @Test
    public void testConnection() throws Exception{
        //DBMS에게 DB연결 드라이버의 위치를 알려주기 위한 메소드
        Class.forName(DRIVER);
        try{
            Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println(connection);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
