package kr.co.coffee.member.dao;

import java.util.Map;

import kr.co.coffee.member.dto.MemberDTO;

public interface MemberDAO {

	void setPermission(String string, String perm);

	int join(Map<String, String> param);

	int overlay(String id);

	MemberDTO login(String id, String pw);

}
