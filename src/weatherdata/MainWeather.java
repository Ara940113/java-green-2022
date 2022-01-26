package weatherdata;

import java.util.Map;
import java.util.Scanner;

import weatherdata.WeatherDto.Response.Body.Items.Item;

public class MainWeather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====날짜를 입력하세요====");
        System.out.println("ex)20220126");
        String baseDate = sc.nextLine();

        // System.out.println("====격자Y 입력하세요====");
        // System.out.println("ex)75(해운대구)");
        // String ny = sc.nextLine();

        // System.out.println("====카테고리 입력하세요====");
        // System.out.println("ex)T1H(기온)");
        // String category = sc.nextLine();

        Map<String, String> weatherMap = DownloadWeather.getWeatherMap();
        System.out.println(weatherMap);
        // for (int i = 0; i < weatherMap.size(); i++) {
        // System.out.println("===========================");
        // System.out.println("날짜 : " + weatherMap.get(baseDate));

    }
}
