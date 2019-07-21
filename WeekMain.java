package Lesson_2;

public class Main{

    public static void main(String[] args) {

        howMuchWorkHours(Week.Friday);

    }
    public static void howMuchWorkHours(Week week){

        if (week == Week.Saturday || week == Week.Sunday ) {
            System.out.println("выходной");
        }   else {
            System.out.println("Если сегодня "+ week.getDay() +  ", то рабочих часов осталось" + week.getWorkHour() );
        }
    }
}


