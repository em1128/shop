package com.team.shop.service;

import java.util.List;

import com.team.shop.model.CardVO;


public interface CardService {
		// 카드 정보 추가
		public void add(CardVO cardVO) throws Exception;
		
		// 카드 정보 전체 조회
		public List<CardVO> view(String memberId) throws Exception;
		
		// 카드 1개 조회
		public CardVO read(int cardNumber) throws Exception;
		
		// 수정
		public void update(CardVO cardVO) throws Exception;
		
		// 결제 내역 삭제
		public void delete(int cardNumber) throws Exception;
		
}
