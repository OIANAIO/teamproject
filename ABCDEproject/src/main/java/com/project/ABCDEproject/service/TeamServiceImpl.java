package com.project.ABCDEproject.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ABCDEproject.dao.TeamDAO;
import com.project.ABCDEproject.vo.Team;

@Service
public class TeamServiceImpl implements TeamService{
	
	@Autowired
	TeamDAO dao;

	@Override
	public void makeTeam(Team team) {
		dao.makeTeam(team);
	}


	@Override
	public ArrayList<Team> getTeamListFilterID(int userid) {
		return dao.getTeamListFilterID(userid);
	}

	@Override
	public ArrayList<Team> teamList(int memberid) {
		ArrayList<Team> teamList = dao.teamList(memberid);
		
		return teamList;
	}
	
} // service
