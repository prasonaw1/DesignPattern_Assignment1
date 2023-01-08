package com.pattern.design.builder;

public class WebResponseBuilder implements ResponseBuilder {
	
	private String topPage;
	private String middlePage;
	private String bottomPage;
	private String addOnBottom;

	@Override
	public ResponseBuilder buildTopPage(String topPage) {
		this.topPage = topPage;
		return this;
	}

	@Override
	public ResponseBuilder buildMiddlePage(String middlePage) {
		this.middlePage = middlePage;
		return this;
	}

	@Override
	public ResponseBuilder buildBottomPage(String bottomPage) {
		this.bottomPage = bottomPage;
		return this;
	}
	
	

	public String getTopPage() {
		return topPage;
	}

	public void setTopPage(String topPage) {
		this.topPage = topPage;
	}

	public String getMiddlePage() {
		return middlePage;
	}

	public void setMiddlePage(String middlePage) {
		this.middlePage = middlePage;
	}

	public String getBottomPage() {
		return bottomPage;
	}

	public void setBottomPage(String bottomPage) {
		this.bottomPage = bottomPage;
	}
	
	
	

	public String getAddOnBottom() {
		return addOnBottom;
	}

	public void setAddOnBottom(String addOnBottom) {
		this.addOnBottom = addOnBottom;
	}

	@Override
	public Response build() {
		return new WebResponse(this);
	}

	@Override
	public ResponseBuilder buildBottomPageAddon(String addOnBottom) {
		this.addOnBottom = addOnBottom;
		return this;
	}



}
