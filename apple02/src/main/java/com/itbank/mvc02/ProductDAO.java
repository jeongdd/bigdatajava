package com.itbank.mvc02;

public class ProductDAO {
	
	public void confirm(ProductDTO productDTO) {
		System.out.println("상품등록 완료");
		System.out.println("상품 등록 ID : " + productDTO.getpId());
		System.out.println("상  품  명  : " + productDTO.getpName());
		System.out.println("상 품 가 격  : " + productDTO.getPrice());
		System.out.println("마 일 리 지     : " + productDTO.getPoint());
	}
	public void confirm2(ProductDTO productDTO) {
		System.out.println("상품 등록 ID : " + productDTO.getpId());
		System.out.println("상  품  명  : " + productDTO.getpName());
		System.out.println("상 품 가 격  : " + productDTO.getPrice());
		System.out.println("마 일 리 지     : " + productDTO.getPoint());
		
		productDTO.setPoint(0);
		
		System.out.println("마일리치 초기화 ok");
		System.out.println("상품 등록 ID : " + productDTO.getpId());
		System.out.println("상  품  명  : " + productDTO.getpName());
		System.out.println("상 품 가 격  : " + productDTO.getPrice());
		System.out.println("마 일 리 지     : " + productDTO.getPoint());
		
	}
	public void delete(ProductDTO productDTO) {
		System.out.println("상품이 삭제되었습니다.");
	}
	public void search(ProductDTO productDTO) {
		System.out.println("상품 검색 결과입니다.");
		System.out.println("검색한 상품 ID : " + productDTO.getpId());
	}
}
