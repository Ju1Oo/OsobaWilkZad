public class DataUrodzenia {
    private int day;
    private int month;
    private int year;

    public DataUrodzenia(int d,int m , int y)
    {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
