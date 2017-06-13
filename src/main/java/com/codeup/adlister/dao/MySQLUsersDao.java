package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

/**
 * Created by user on 6/13/17.
 */
public class MySQLUsersDao implements Users {

//    public MySQLUsersDao
//
//    private Connection connection =null;
//    ---------------------
//    public User findByUsersname (String username){
//
//     String sql = "Select * from users where username= ?";
//
//      try{
//          PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1,username);
//            statement.executeQuery();
//      }catch (SQLExcetion e){e.printStackTrace();
//        }
// //---------------------
//    @Override
//    public Long insert (User user){
//      String insert = "INSERT INTO users(username,email,password) VALUES(?,?,?)";
//      try{
//          PreparedStatement statement (  RETURN GEN);
//    } catch (SQLExecption e) { e.printStackTrace();
//    }

//}
