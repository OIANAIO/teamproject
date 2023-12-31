package com.project.ABCDEproject.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.ABCDEproject.dao.MemberDAO;
import com.project.ABCDEproject.vo.Member;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	MemberDAO dao;

	@Override
	public void joinMember(Member member) {
		String encodedPassword = passwordEncoder.encode(member.getMemberpw());
		member.setMemberpw(encodedPassword);
		
		dao.joinMember(member);
	}

	@Override
	public Member selectMember(String username) {
		Member member = dao.selectMember(username);
		return member;
	}

	@Override
	public int updateMember(Member member) {
		int result = dao.updateMember(member);
		
		return result;
	}

	@Override
	public void deleteMember(String username) {
		dao.deleteMember(username);
	}

	@Override
	public void lastLogin(String username) {
		dao.lastLogin(username);
	}

	@Override
	public String selectId(HashMap<String, String> map) {
		String selectId = dao.selectId(map);
		return selectId;
	}

	@Override
	public int getId(String username) {
		int result = dao.getId(username);
		return result;
	}
	
} // service
