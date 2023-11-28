package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //stream 사용전
        String[] nameArr = {"ddd","www","aaa"};
        List<String> nameList = Arrays.asList(nameArr);

        //원본 데이터 직접 저장됨
        Arrays.sort(nameArr);

        for(String str: nameArr){
            System.out.println(str);
        }

        // Stream 사용 후
        String[] nameArr2 = {"IronMan", "Captain", "Hulk", "Thor"};
        List<String> nameList2 = Arrays.asList(nameArr2);

        // 원본의 데이터가 아닌 별도의 Stream을 생성함
        Stream<String> nameStream2 = nameList2.stream();
        Stream<String> arrayStream2 = Arrays.stream(nameArr2);

        // 복사된 데이터를 정렬하여 출력함
        nameStream2.sorted().forEach(System.out::println);
        arrayStream2.sorted().forEach(System.out::println);


        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()							// 생성하기
                .filter(s -> s.startsWith("c"))			// 가공하기
                .map(String::toUpperCase)			// 가공하기
                .sorted()							// 가공하기
                .count();							// 결과만들기


    }
}