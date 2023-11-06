package SDA2.ex6;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        int year = 2023;
        int month = 2;
        System.out.println(firstAndLastDayOfMonth(year,month));

    }
    public static String firstAndLastDayOfMonth(int year,int month){
        if (month < 1 || month>12 || year <= 0){
          return "Valoare lunii sau a anului nu este corecta";
        }
        LocalDate firstDayOfMonth = LocalDate.of(year,month,1);
        int nrOfDays = firstDayOfMonth.lengthOfMonth();
        LocalDate lastDayOfMonth =LocalDate.of(year,month,nrOfDays);
        String result = firstDayOfMonth + " " + lastDayOfMonth;
        return result;
    }

}
