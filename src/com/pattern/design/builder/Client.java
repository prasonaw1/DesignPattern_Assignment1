package com.pattern.design.builder;

import netscape.javascript.JSObject;

public class Client {

	
	public static void main(String[] args) {
		Product mockResponse = createMockProductResponse();
		ResponseBuilder builder = new MobileResponseBuilder();
		Response response = buildResponse(builder, mockResponse);
		System.out.println(response);
		
	}
	
	public static Response buildResponse(ResponseBuilder builders, Product product) {
		return builders.buildTopPage(product.getpName()).buildMiddlePage(product.getpDescription()).buildBottomPage(product.getpReviews()).buildBottomPageAddon(product.getpQuestionAnswer()).build();
	}
	
	public static Product createMockProductResponse() {
		Product product = new Product();
		product.setpId(1);
		product.setpName("Pressure Cooker (MIA)");
		product.setpDescription("Pressure Cooker Made In India");
		product.setpQuantity(200);
		product.setpQuestionAnswer("{\"Isthisgoodproduct\":\"Yes,ItisgoodProduct\",\"Whatisaveragecookingtimeforrice\":\"20minutes\",\"CanIgetthisproductOutsideofIndia\":\"No\"}");
		product.setpRating(4);
		product.setpReviews("{\"reviews\":[{\"comment\":\"ValueforMoney\",\"upvote\":10,\"downvote\":2},{\"comment\":\"BestProductEverIpurchases\",\"upvote\":20,\"downvote\":1},{\"comment\":\"ValueforMoney\",\"upvote\":10,\"downvote\":2},{\"comment\":\"WorstProduct,CheapQuality\",\"upvote\":0,\"downvote\":2}]}");
		return product;
	}
}
