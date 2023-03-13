package com.nilesh;

public class Cricket implements Coach {
	
	private FortuneService fortuneService;
	
	private String email;
	
	private int teamNo;

	public void setEmail(String emails) {
		this.email = emails;
	}


	public void setTeamNo(int teamNos) {
		this.teamNo = teamNos;
	}

	public void setFortuneService(FortuneService fortuneServices) {
		this.fortuneService = fortuneServices;
	}

	@Override
	public String getCoach() {
		// TODO Auto-generated method stub
		return "Do batting practice all of you " + teamNo;
	}

	@Override
	public String getYourFortune() {
		return fortuneService.getFortune() + " " + email;
	}

}
