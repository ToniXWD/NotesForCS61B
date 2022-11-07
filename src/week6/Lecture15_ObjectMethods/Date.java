package week6.Lecture15_ObjectMethods;

public class Date {
    private final int year;
    private final int month;
    private final int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Date cdate = (Date)o;
        return this.year == cdate.year && this.month == cdate.month && this.day == cdate.day;
    }

    public static void main(String[] args) {
        Date d1 = new Date(2022,8,15);
        Date d2 = new Date(2022,8,15);
        System.out.println(d1.equals(d2));
    }
}
