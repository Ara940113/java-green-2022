package covid19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import covid19.ResponseDto.Response.Body.Items;
import covid19.ResponseDto.Response.Body.Items.list;

public class DownloadCovid19 {

    public static List<list> getCovidList(
            String startcreateDt,
            String endcreateDt) {

        try {
            URL url = new URL(
                    "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows=10&startCreateDt="
                            + startcreateDt + "&endCreateDt=" + endcreateDt + "&_type=json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            List<list> result = dto.getResponse().getBody().getItems().getItem();
            return result;

        } catch (Exception e) {
            System.out.println("코로나 목록 조회중 오류가 발생하였습니다.");
        }
        return null;
    }
}
