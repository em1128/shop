package com.team.shop.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DeliveryInfoVO {
	private int dno;
	private int pno; // 배송조회할 상품 결제 내역
	private Date deliveryDate;
	private String deliveryPosition;// 배송 요청사항 
    private String deliveryState;//상품 수령 방법
	@Override
	public String toString() {
		return "DeliveryInfoVO [dno=" + dno + ", pno=" + pno + ", deliveryDate=" + deliveryDate + ", deliveryPosition="
				+ deliveryPosition + ", deliveryState=" + deliveryState + "]";
	}

        
}
