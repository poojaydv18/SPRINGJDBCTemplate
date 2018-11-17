package com.mypack;

import org.springframework.jdbc.core.JdbcTemplate;

public class TestDAO// implements DaoInter
{
	JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveData(Employee e)
	{
		System.out.println("in save data..");
		String query="insert into Data values('"+e.getFname()+"','"+e.getLname()+"')";
		return jdbcTemplate.update(query);
	}
}