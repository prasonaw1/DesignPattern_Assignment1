package com.pattern.design.builder;

public interface ResponseBuilder {

	
	ResponseBuilder buildTopPage(String topPage);
	ResponseBuilder buildMiddlePage(String middlePage);
	ResponseBuilder buildBottomPage(String bottomPage);
	ResponseBuilder buildBottomPageAddon(String bottomPage);
    Response build();

}
