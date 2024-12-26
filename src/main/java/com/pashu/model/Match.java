package com.pashu.model;

public class Match {

	private String matchId;
	private String teamOneName;
	private String teamTwoName;
	private String date;
	private String venu;
	private String result;

	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Match(String matchId, String teamOneName, String teamTwoName, String date, String venu, String result) {
		super();
		this.matchId = matchId;
		this.teamOneName = teamOneName;
		this.teamTwoName = teamTwoName;
		this.date = date;
		this.venu = venu;
		this.result = result;
	}

	public String getMatchId() {
		return matchId;
	}

	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}

	public String getTeamOneName() {
		return teamOneName;
	}

	public void setTeamOneName(String teamOneName) {
		this.teamOneName = teamOneName;
	}

	public String getTeamTwoName() {
		return teamTwoName;
	}

	public void setTeamTwoName(String teamTwoName) {
		this.teamTwoName = teamTwoName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVenu() {
		return venu;
	}

	public void setVenu(String venu) {
		this.venu = venu;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", teamOneName=" + teamOneName + ", teamTwoName=" + teamTwoName + ", date="
				+ date + ", venu=" + venu + ", result=" + result + "]";
	}

}
