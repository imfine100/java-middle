package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 문제1 - 배열을 맵으로 전환
 * 상품의 이름과 가격이 2차원 배열로 제공된다.
 * 다음 예제를 참고해서 2차원 배열의 데이터를 Map<String, Integer> 로 변경해라.
 */
public class ArrayToMap {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},
                {"JPA","30000"}};

        Map<String,String> prdMap= new HashMap<>();

        // 주어진 배열로부터 Map 생성 - 코드 작성
       for(String[] prdAry : productArr) {
           prdMap.put(prdAry[0], prdAry[1]);
           //System.out.println("prd = " + prdMap);
       }

        // Map의 모든 데이터 출력  - 코드 작성
        for(String key : prdMap.keySet()){
            System.out.println("제품 = " +key + ", 가격 = " + prdMap.get(key));
        }
    }
}
