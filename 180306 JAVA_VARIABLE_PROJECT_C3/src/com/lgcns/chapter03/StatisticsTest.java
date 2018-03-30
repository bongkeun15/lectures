package com.lgcns.chapter03;

public class StatisticsTest {
    public static void main(String[] args) {
        
        int fromSunToEarthDistance = 150000000;
        // 지구와 태양 사이의 거리
        
        long population = 6973738433l;
        // 인구 수 ?!
        
        double lottProbability = 0.0000001235;
        // 로또 당첨 확률

        boolean isRight = true;
        
        System.out.println("태양에서 지구까지의 거리 : " + fromSunToEarthDistance);
        System.out.println("로또에 당첨될 확룔 : " + lottProbability );
        System.out.println("전 세계의 인구 수 : " + population );
        System.out.println("위의 값들이 정확한가요? : " + isRight);
    }
}
