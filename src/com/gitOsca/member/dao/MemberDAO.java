package com.gitOsca.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.json.JSONException;
import org.json.JSONObject;

import com.gitOsca.mybatis.config.MyBatisConfig;

public class MemberDAO {
	public SqlSession sqlSession;
	
	public MemberDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// ���� ã��
	public String selectAccount(String phoneNumber) {
	 return sqlSession.selectOne("member.selectAccount", phoneNumber);	
	}
}

