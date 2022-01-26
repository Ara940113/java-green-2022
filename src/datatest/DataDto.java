package datatest;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class DataDto {
    class AirportItem {
        @AllArgsConstructor
        @Data
        class Response {
            private Header header;
            private Body body;

            @AllArgsConstructor
            @Data
            class Header {
                private String resultCode;
                private String resultMsg;
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
                        private String airportId;
                        private String airportNm;
                    }
                }
            }
        }

    }

    class FlightItem {
        @AllArgsConstructor
        @Data
        class Response {
            private Header header;
            private Body body;

            @AllArgsConstructor
            @Data
            class Header {
                private String resultCode;
                private String resultMsg;
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
                        private String arrPlandTime;
                        private String depAirportNm;
                        private String depPlandTime;
                        private int economyCharge;
                        private int prestigeCharge;
                        private String vihicleId;

                    }

                }
            }
        }
    }

    class ResponseBox<T> {
        T data;

        public ResponseBox(T data) {
            this.data = data;
        }
    }

}
