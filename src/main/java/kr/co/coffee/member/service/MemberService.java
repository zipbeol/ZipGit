package kr.co.coffee.member.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.coffee.member.dao.MemberDAO;
import kr.co.coffee.member.dto.MemberDTO;

@Service
public class MemberService {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired MemberDAO dao;

	public int join(Map<String, String> param) {
		
		logger.info("회원 가입 param 값");
		int row = dao.join(param);
		String perm = param.get("auth");
		if(perm != null) {
			dao.setPermission(param.get("id"),perm);
		}
		
		return row;
	}

	public int overlay(String id) {
		
		return dao.overlay(id);
	}

	public MemberDTO login(String id, String pw) {
		logger.info("아이디 혹은 비밀번호 확인해주세요");
		return dao.login(id,pw);
	}

}
