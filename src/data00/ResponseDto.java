package data00;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data // Getter,Setter,Tostring 까지 다 들고있음
public class ResponseDto {
    private Response response; // 변수명을 동일하게!!

    @AllArgsConstructor
    @Data
    class Response {
        private Header header;// 변수명을 동일하게!!
        private Body body;// 변수명을 동일하게!!

        @AllArgsConstructor
        @Data
        class Header {
            private String resultCode;
            private String resulMsg;
        }

        @AllArgsConstructor
        @Data
        class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;
            private int totalCount;

            @AllArgsConstructor
            @Data
            class Items {
                private List<Item> item;

                @AllArgsConstructor
                @Data
                class Item {
                    private String airlineNm;
                    private String arrAirportNm;
                    private long arrPlandTime;
                    private String depAirportNm;
                    private long depPlandTime;
                    private int economyCharge;
                    private int prestigeCharge;
                    private String vihicleId;

                }
            }
        }
    }
}
