import java.util.Calendar;
public class TernaryExam{
    public static void main(String[] args) {
        // hour에는 현재 시간이 24시간 단위로 들어있습니다. 
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        String ampm;
        // 삼항 연산자를 이용해 ampm에 오전 또는 오후의 값을 가지도록 만들어보세요.
        ampm = (hour < 12) ? "am" : "pm";
        System.out.println("The time is "+hour+", "+ampm+".");
    }
}