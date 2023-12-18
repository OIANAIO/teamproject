package com.project.ABCDEproject.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {

	int id;
	int leader_id;
	String team_icon;
	String originalicon;
	String team_description;
	String team_name;
	
}
