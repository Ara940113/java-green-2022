package weatherdata;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import weatherdata.WeatherDto.Response.Body.Items.Item;

public class DownloadWeather {

    public static Map<String, String> getWeatherMap() {
        Map<String, String> weatherMap = new HashMap<>();
        try {
            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=3KDHujZYIZYJulXLMVgF75p%2BlVIQTiukVXygBRHkQFE9ufFnpyNZLYj8OUNNsM2Q%2FNnhZV5F3FDe5r7nF%2FsKUA%3D%3D&pageNo=1&numOfRows=1000&dataType=JSON&base_date=20220126&base_time=0600&nx=55&ny=127");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            System.out.println(responseJson);
            // Gson gson = new Gson();
            // WeatherDto dto = gson.fromJson(responseJson, WeatherDto.class);
            // List<Item> result = dto.getResponse().getBody().getItems().getItem();
            // // System.out.println(result);

            // for (int i = 0; i<result.size; i++){
            // weatherMap.put(result.get(i).getCategory(),result.get(i).getObsrValue());
            // }

        } catch (Exception e) {
            System.out.println("오류");

        }
        return weatherMap;
    }
}
