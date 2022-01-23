package jsonex01;

import com.google.gson.Gson;

class SMSDto {
    private String groupId;
    private int successCount;
    private int errorCount;

    public SMSDto(String groupId, int successCount, int errorCount) {
        this.groupId = groupId;
        this.successCount = successCount;
        this.errorCount = errorCount;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public int getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

}

public class GsonEx02 {
    public static void main(String[] args) {
        String smsReturn = "{\"groupId\":\"R2GdEONszq64lNB9\",\"successCount\":1,\"errorCount\":0}";

        // JavaObject -> json으로 변경 (데이터 전송 목적)
        SMSDto smsDto = new SMSDto("R2GdEONszq64lNB9", 1, 0);
        Gson gson = new Gson();
        String jsonSMSDto = gson.toJson(smsDto);
        System.out.println(jsonSMSDto);

        // Json ->JavaObject로 변경 데이터 다운로드 목적
        SMSDto javaSMSDto = gson.fromJson(jsonSMSDto, SMSDto.class);
        System.out.println(javaSMSDto.getGroupId());
        System.out.println(javaSMSDto.getSuccessCount());
        System.out.println(javaSMSDto.getErrorCount());

    }

}
