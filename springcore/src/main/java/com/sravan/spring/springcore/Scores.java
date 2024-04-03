package com.sravan.spring.springcore;

public class Scores {
	private int mathScore;
	private int scienceScore;
	private int socialScore;

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getScienceScore() {
		return scienceScore;
	}

	public void setScienceScore(int scienceScore) {
		this.scienceScore = scienceScore;
	}

	public int getSocialScore() {
		return socialScore;
	}

	public void setSocialScore(int socialScore) {
		this.socialScore = socialScore;
	}

	@Override
	public String toString() {
		return "Scores [mathScore=" + mathScore + ", scienceScore=" + scienceScore + ", socialScore=" + socialScore
				+ "]";
	}

}
