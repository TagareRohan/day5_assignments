package com.training;

import java.io.File;

public class ClientApplication {

	public static void main(String[] args) {
		CreditCard myCard = new CreditCard(10000, 11111111, "James", 100000);
		CreditCard myCard2 = new CreditCard(20000, 22222222, "John", 200000);
		
		CreditCard[] cardList = new CreditCard[2];
		cardList[0]=myCard;
		cardList[1]=myCard2;
		
		BusinessService service = new BusinessService();
		service.storeDetails(cardList,true);
		
		CreditCard cc[]=service.getDetails();
		
		for(int i=0;i<2;i++) {
			System.out.println(cc[i]);
		}
//		service.deleteDetails(11111111);
//		CreditCard cc2[]=service.getDetails();
//		System.out.println("after delete");
//		for(int i=0;i<1;i++) {
//			System.out.println(cc2[i]);
//		}
		System.out.println("Done");
	}
	
}