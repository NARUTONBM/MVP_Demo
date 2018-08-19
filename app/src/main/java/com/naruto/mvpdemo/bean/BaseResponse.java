package com.naruto.mvpdemo.bean;

/**
 * @author narut.
 * @Date 2018-08-19.
 * @Time 14:20.
 */
public class BaseResponse {

    private int error_code;
    private String reason;
    private ResponseData result;

    public int getErrorCode() {
        return error_code;
    }

    public void setErrorCode(int errorCode) {
        this.error_code = errorCode;
    }

    public String getReason() {
        return reason == null ? "" : reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResponseData getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "error_code=" + error_code +
                ", reason='" + reason + '\'' +
                ", result=" + result +
                '}';
    }

    public void setResult(ResponseData result) {
        this.result = result;
    }
}
