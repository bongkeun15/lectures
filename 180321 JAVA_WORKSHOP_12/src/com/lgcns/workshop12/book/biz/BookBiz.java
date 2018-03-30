package com.lgcns.workshop12.book.biz;

import java.util.HashMap;

import com.lgcns.workshop12.book.Magazine;
import com.lgcns.workshop12.book.Novel;
import com.lgcns.workshop12.util.WorkshopUtil;

public class BookBiz implements IBookBiz {

    private HashMap<Magazine, Integer> magazines = new HashMap<Magazine, Integer>();
    private HashMap<Novel, Integer> novels = new HashMap<Novel, Integer>();

    public BookBiz() {
        magazines.put( new Magazine( "Cooking Light", 15000, "living, cooking", "America Cooking" ), 165 );
        magazines.put( new Magazine( "Auto Bild", 16000, "science, car", "Germany Car" ), 130 );
        magazines.put( new Magazine( "New Type", 8000, "animation" ), 180 );
        novels.put( new Novel( "The Confession", 10500, "Grisham, John" ), 300 );
        novels.put( new Novel( "Les Miserables", 17500, "Hugo, Victor" ), 350 );
        novels.put( new Novel( "Breakthrough", 47200, "Ifill, Gwen" ), 280 );
        novels.put( new Novel( "The Racketeer", 38000, "Grisham, John" ), 320 );
    }

    private void calculateNovelStockTotalPrice() {
        int total = 0;
        for ( Novel novel : novels.keySet() ) {
            Integer stock = novels.get( novel );
            total += novel.getPrice() * stock;
        }
        System.out.println( "소설 재고 총 가격 :" + WorkshopUtil.moneyFormat( total ) );

    }

    @Override
    public void printAllBooks() {
        for ( Magazine magazine : magazines.keySet() ) {
            System.out.println( magazine );
        }
        for ( Novel novel : novels.keySet() ) {
            System.out.println( novel );
        }

    }

    private void calculateMagazineStockTotalPrice() {
        int total = 0;
        for ( Magazine magazine : magazines.keySet() ) {
            Integer stock = magazines.get( magazine );
            total += magazine.getPrice() * stock;
        }
        System.out.println( "잡지 재고 총 가격 :" + WorkshopUtil.moneyFormat( total ) );
    }

    @Override
    public void printNovelStockStatus() {
        for ( Novel novel : novels.keySet() ) {
            Integer stock = novels.get( novel );
            System.out.println(
                    novel.getTitle() + "(" + WorkshopUtil.moneyFormat( novel.getPrice() ) + ") : " + stock + "권" );
        }
        calculateNovelStockTotalPrice();
    }

    @Override
    public void printMagazineStockStatus() {
        int total = 0;
        for ( Magazine magazine : magazines.keySet() ) {
            Integer stock = magazines.get( magazine );
            System.out.println( magazine.getTitle() + "(" + WorkshopUtil.moneyFormat( magazine.getPrice() ) + ") : "
                    + stock + "권" );
        }
        calculateMagazineStockTotalPrice();
    }

    @Override
    public void sellMagazines( String title, String numberOfMagazine ) throws Exception {
        int c = 0;
        try {
            int a = Integer.parseInt( numberOfMagazine );
        } catch ( Exception e ) {
            throw new Exception( "[에러] 수량 정보는 숫자로 입력해야 합니다." );
        }

        if ( Integer.parseInt( numberOfMagazine )<0) {
            throw new Exception( "[에러] 수량 정보는 음수로 입력할 수 없습니다." );
        }
        for ( Magazine magazine : magazines.keySet() ) {
            if ( magazine.getTitle().equals( title ) ) {
                if ( magazines.get( magazine ) < ( Integer.parseInt( numberOfMagazine ) ) ) {
                    throw new Exception( "[에러] 재고 수량 보다 주문수량이 많습니다." );
                }
            }
            int stock = magazines.get( magazine ) - ( Integer.parseInt( numberOfMagazine ) );
            if ( stock == 0 ) {
                magazines.remove( magazine );
               //  throw new Exception( "[@]" + magazine.getTitle() + " 재고수량이 0입니다. 목록에서 삭제합니다." );
                magazines.put( magazine, stock );
                c++;
                break;
            }

            if ( c == 0 ) {
                throw new Exception( "[에러] 입력한 제목에 맞는 잡지를 찾지 못했습니다." );
            }
            calculateMagazineStockTotalPrice();
        }
    }
}
