package com.project.ABCDEproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ABCDEproject.dao.HomeDAO;
import com.project.ABCDEproject.vo.Member;

@Service
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	HomeDAO dao;

	
	
} // Service
