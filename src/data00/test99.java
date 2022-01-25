package data00;

public class test99 {
    private Response response; // 변수명을 동일하게!!

}

class Response {
    private Header header;// 변수명을 동일하게!!
    private Body body;// 변수명을 동일하게!!

    class Header {
        private String resultCode;
        private String resulMsg;
    }

    class Body {
        private Items items;
        private int numOfRows;
        private int pageNo;
        private int totalCount;

        class Items {
            private Item item;

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
