
public class TimeConversion {
    public String timeConversion(String s) {
        int length = s.length() - 2;
        int newString = Integer.parseInt(s.substring(0, 2));
        if (s.substring(length).equals("AM"))
            return newString < 12 ? s.substring(0, length) : "00" + s.substring(2, length);
        else
            return newString < 12 ? newString + 12 + s.substring(2, length) : "12" + s.substring(2, length);
    }
}
