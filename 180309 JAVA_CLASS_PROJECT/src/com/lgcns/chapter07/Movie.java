package com.lgcns.chapter07;

public class Movie {
    // 클래스 파일이니까 메인 메소드는 없다

    String title;
    String director;
    String genre;

    public Movie() {
    } // 원래 자동으로 생성 되는 개념임

    public Movie( String title, String director ) {
        this.title = title;
        this.director = director;
    }

    public Movie( String title, String director, String genre ) {
        this( title, director );
        this.genre = genre;
    }
}
