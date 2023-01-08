package com.pattern.design.builder;

public class MobileResponse implements Response{
	
	private String topPage;
	private String middlePage;
	private String bottomPage;	

	public MobileResponse(MobileResponseBuilder mobResponseBuilder) {
		this.topPage = mobResponseBuilder.getTopPage();
		this.middlePage = mobResponseBuilder.getMiddlePage();
		this.bottomPage = mobResponseBuilder.getBottomPage();
	}

	@Override
	public String topPage() {
		return topPage;
	}

	@Override
	public String middlePage() {
		return middlePage;
	}

	@Override
	public String bottomPage() {
		return bottomPage;
	}

	@Override
	public String toString() {
		return "MobileResponse [topPage=" + topPage + ", middlePage=" + middlePage + ", bottomPage=" + bottomPage + "]";
	}

	
	
}
