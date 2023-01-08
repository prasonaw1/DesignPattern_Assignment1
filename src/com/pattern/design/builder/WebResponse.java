package com.pattern.design.builder;

public class WebResponse implements Response{
	
	private String topPage;
	private String middlePage;
	private String bottomPage;	
	private String addOnBottom;

	public WebResponse() {
		
	}
	
	public WebResponse(WebResponseBuilder webResponseBuilder) {
		this.topPage = webResponseBuilder.getTopPage();
		this.middlePage = webResponseBuilder.getMiddlePage();
		this.bottomPage = webResponseBuilder.getBottomPage();
		this.addOnBottom = webResponseBuilder.getAddOnBottom();
	}

	@Override
	public String toString() {
		return "WebResponse [topPage=" + topPage + ", middlePage=" + middlePage + ", bottomPage=" + bottomPage
				+ ", addOnBottom=" + addOnBottom + "]";
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



}
