package com.test.iot.service.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

import com.test.iot.common.DBCon;
import com.test.iot.dao.UserDAO;
import com.test.iot.dao.impl.UserDAOImpl;
import com.test.iot.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDAO ud = new UserDAOImpl();

	@Override
	public ArrayList<HashMap<String, Object>> getUserList() {
		Connection con = DBCon.getCon();
		ArrayList<HashMap<String, Object>> userList = ud.selectUserList();
		//DBCon.closeCon();
		return userList;
	}

	@Override
	public HashMap<String, Object> getUser() {
		Connection con = DBCon.getCon();
		HashMap<String, Object> hm = ud.selectUser();
		//DBCon.closeCon();
		return hm;
	}

	@Override
	public String getUpdateResult() {
		Connection con = DBCon.getCon();
		String resultStr = ud.updateUser();
		//DBCon.closeCon();
		return resultStr;
	}

	@Override
	public String getDeleteResult() {
		Connection con = DBCon.getCon();
		String resultStr = ud.deleteUser();
		//DBCon.closeCon();
		return resultStr;
	}

	@Override
	public String getInsertResult() {

		Connection con = DBCon.getCon();
		String resultStr = ud.insertUser();
		//DBCon.closeCon();
		return resultStr;
	}

}
