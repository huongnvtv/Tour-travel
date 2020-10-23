/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import util.ConnectionUtil;

/**
 *
 * @author ADMIN
 */
public class UserLogin extends ConnectionUtil{
    public boolean check(String userName,String passWord) throws Exception{
        boolean check=false;
        String strSQL="select * from user where user_name=? and password=? and status=?";
        try{
            open();
            mStmt=mConnection.prepareStatement(strSQL);
            mStmt.setString(1,userName);
            mStmt.setString(2,passWord);
            mRs=mStmt.executeQuery();
            while(mRs.next()){
                check=true;
            }
        }finally{
            close();
        }
        return check;
    }
}
