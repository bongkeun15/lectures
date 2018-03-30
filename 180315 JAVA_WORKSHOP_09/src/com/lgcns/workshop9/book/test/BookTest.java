package com.lgcns.workshop9.book.test;


public class BookTest {

	public static void main(String[] args) {
	    
	    Book book = new Book();
	    SecondBook sBook = new SecondBook();
	    Customer customer = new Customer();
	    
	    
	    
		Customer[] custs = {
		            new Customer("나공부"),
		            new Customer("김신입")
		        };
		
		Book[] books = {
		            new Book("정의란 무엇인가", "마이클 샌델", 15000, 15),
		            new Book("총, 균, 쇠", "제레드 다이아몬드", 28000, 3),
		            new Book("어두운 상점들의 거리", "파트릭 모디아노", 11000, 12),
		            new Book("꾸뻬 씨의 행복 여행", "프랑수와 를로르", 13500, 1)
				};
		
		SecondBook[] sbooks = {
		                    new SecondBook("당당하게 나를 표현하는 기술", "웨인 다이어", 13000, "아이유", 45),
							new SecondBook("톨스토이 단편전", "레프 니콜라예비치 톨스토이", 16000, "김수현", 40)
						};
		
		/*******************
		 * TODO: 수강생작성     *
		 *******************/
		book.book( books );
		sBook.sBook(sbooks);
		
		System.out.println( "-------------------- 도서 정보 -------------------" );
		book.printAllList();
		sBook.printAllList();
		System.out.println( "-----------------------------------------------" );
		
		custs[0].buyBook( books [2], 3 );   //나공부님이 어두운 상점들의 거리를(을) 구매하였습니다. 총 금액 :33,000원
		custs[1].buyBook( books [2], 7 );   //김신입님이 어두운 상점들의 거리를(을) 구매하였습니다. 총 금액 :77,000원
		custs[1].buyBook( books [1], 0 );   //[에러] 0권 이하로 구매하실 수 없습니다.
		custs[0].buyBook( sbooks[0]    );   //나공부님이 당당하게 나를 표현하는 기술를(을) 구매하였습니다. 총 금액 :40,150원150원
		custs[0].buyBook( books [0], 1 );   //나공부님이 정의란 무엇인가를(을) 구매하였습니다. 총 금액 :55,150원
		custs[1].buyBook( books [0], -5);   //[에러] 0권 이하로 구매하실 수 없습니다.
		custs[1].buyBook( sbooks[1]    );   //김신입님이 톨스토이 단편전를(을) 구매하였습니다. 총 금액 :86,600원
		custs[0].buyBook( sbooks[1]    );   //[에러] 재고가 부족합니다. 현재 재고량 : 0권
		custs[1].buyBook( books [3], 4 );   //[에러] 재고가 부족합니다. 현재 재고량 : 1권
		custs[1].buyBook( books [3], 1 );   //김신입님이 꾸뻬 씨의 행복 여행를(을) 구매하였습니다. 총 금액 :100,100원
		custs[0].buyBook( books [1], 3 );   //나공부님이 총, 균, 쇠를(을) 구매하였습니다. 총 금액 :139,150원
		
        System.out.println( "-------------------- 도서 정보 -------------------" );
        book.printAllList();
        sBook.printAllList();
        System.out.println( "-----------------------------------------------" );
	}
}
