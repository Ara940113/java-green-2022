package covid19;

import java.util.List;
import java.util.Scanner;

import covid19.ResponseDto.Response.Body.Items.list;

public class MainCovid19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== 코로나 현황 범위를 입력하세요 ====");
        System.out.println("ex) 20220126 시작일");
        String startcreateDt = sc.nextLine();
        System.out.println("ex) 20220126 종료일");
        String endcreateDt = sc.nextLine();

        List<list> covidList = DownloadCovid19.getCovidList(startcreateDt, endcreateDt);

        for (int i = 0; i < covidList.size(); i++) {
            System.out.println("===========================");
            System.out.println("누적 의심신고 검사자 수 : " + covidList.get(i).getAccExamCnt());
            System.out.println("등록일시분초 : " + covidList.get(i).getCreateDt());
            System.out.println("사망자수 : " + covidList.get(i).getDeathCnt());
            System.out.println("확진자 수 : " + covidList.get(i).getDecideCnt());
            System.out.println("게시글 번호 : " + covidList.get(i).getSeq());
            System.out.println("기준일 : " + covidList.get(i).getStateDt());
            System.out.println("기준시간 : " + covidList.get(i).getStateTime());
            System.out.println("수정일시분초 : " + covidList.get(i).getUpdateDt());

        }
    }

}
