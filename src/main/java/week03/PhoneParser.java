package week03;

public class PhoneParser {
    public Phone phoneParse(String phoneNum) {
        int hyphenPos = phoneNum.indexOf('-');
        return new Phone(phoneNum.substring(0,hyphenPos-1),phoneNum.substring(hyphenPos+1,phoneNum.length()));
    }

}

