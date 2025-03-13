package by.itacademy.psekha.api;

import java.util.Arrays;

public class ReturnBody {
    public String Message;
    public String Data;
    public int DataCount;
    public boolean IsLocked;
    public String Key;
    public String ReturnUrl;
    public String Component;
    public int Status;
    public int PaymentAction;
    public int ErrorCode;
    public int TotalItemCount;
    public Object[] ValidationErrors;

    @Override
    public String toString() {
        return "ReturnBody{" +
                "Message='" + Message + '\'' +
                ", Data='" + Data + '\'' +
                ", DataCount=" + DataCount +
                ", IsLocked=" + IsLocked +
                ", Key='" + Key + '\'' +
                ", ReturnUrl='" + ReturnUrl + '\'' +
                ", Component='" + Component + '\'' +
                ", Status=" + Status +
                ", PaymentAction=" + PaymentAction +
                ", ErrorCode=" + ErrorCode +
                ", TotalItemCount=" + TotalItemCount +
                ", ValidationErrors=" + Arrays.toString(ValidationErrors) +
                '}';
    }
}