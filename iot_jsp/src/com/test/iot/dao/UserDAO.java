package com.test.iot.dao;

import java.util.ArrayList;
import java.util.HashMap;

public interface UserDAO {
	public ArrayList<HashMap<String,Object>> selectUserList();
	public HashMap<String,Object> selectUser();
	public String updateUser();
	public String deleteUser();
	public String insertUser();
}
