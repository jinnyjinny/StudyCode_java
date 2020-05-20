package mydate;

import java.util.Calendar;

public class MyDate {
    //1. day, month, year 변수는 private로  선언합니다.
    //2. 각 변수의 getter, setter를 public으로 구현합니다.
    //3. MyDate(int day, int month, int year) 생성자를 만듭니다.
    //4. public boolean isValid() 메서드를 만들어 날짜가 유효한지 확인합니다.
    //5. MyDateTest 클래스에서 생성한 MyDate 날짜가 유효한지 확인합니다.

    private int day;
    private int month;
    private int year;
    private boolean isValid = true; // true 값으로 초기화, 전역변수로 할당


    public MyDate(int day, int month, int year) { // getter setter를  만들었는데 왜 또 생성자를 만드는거지?
        setDay(day); //this.day = day;
        setMonth(month); //this.month = month;
        setYear(year); //this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) { // getDay에서 값을 받아와서 여기에서 실질적인 기능을 짜면, TestCode로 넘겨서 값을 리턴한다
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if(day < 0 || day > 31){
                    isValid = false;
                }
                else {
                    this.day = day;
                }
                break;
            case 2:
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    if (day < 0 || day > 29) {
                        isValid = false;
                    } else {
                        this.day = day;
                    }
                }
                else {
                    if (day < 0 || day > 28) {
                        isValid = false;
                    } else {
                        this.day = day;
                    }
                }
                break;
            default:
                isValid = false;
        }

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            isValid = false;
        }
        else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year > Calendar.getInstance().get(Calendar.YEAR)) {
            isValid = false;
        }
        else {
            this.year = year;
        }
    }

    public String isValid() {
        if(isValid) {
            return "유효한 날짜입니다.";
        }
        else {
            return "유효하지 않은 날짜입니다.";
        }
    }

}


