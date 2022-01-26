package datatest;

import java.util.List;
import java.util.Scanner;

import datatest.FlightDto.Response.Body.Items.Item;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== 출발일을 입력하세요 ====");
        System.out.println("ex) 20220126");
        String deplandTime = sc.nextLine();

        System.out.println("==== 출발지를 입력하세요 ====");
        System.out.println("ex) 무안, 광주, 군산, 여수, 원주, 양양, 제주, 김해");
        System.out.println("ex) 사천, 울산, 울산, 인천, 김포, 포항, 대구, 청주");
        String depAirportNm = sc.nextLine();

        System.out.println("==== 도착지를 입력하세요 ====");
        System.out.println("ex) 무안, 광주, 군산, 여수, 원주, 양양, 제주, 김해");
        System.out.println("ex) 사천, 울산, 울산, 인천, 김포, 포항, 대구, 청주");
        String arrAirportNm = sc.nextLine();

        List<Item> fligtList = DownloadFlight.getFlightList(deplandTime, depAirportNm, arrAirportNm);
        for (int i = 0; i < fligtList.size(); i++) {
            System.out.println("===========================");
            System.out.println("출발시간 : " + fligtList.get(i).getDepPlandTime());
            System.out.println("도착시간 : " + fligtList.get(i).getArrPlandTime());
            System.out.println("요금 : " + fligtList.get(i).getEconomyCharge());
            System.out.println("항공사 : " + fligtList.get(i).getAirlineNm());

        }
    }

}
