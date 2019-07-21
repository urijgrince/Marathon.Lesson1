package Lesson_2;

enum Week { Monday("понедельник", 40), Tuesday("вторник", 32), Wednesday("среда", 24) ,
    Thursday("четверг",16), Friday("пятница", 8), Saturday("суббота", 0), Sunday("воскресенье", 0);

    private  int workHour;
    private String day;


    Week(String day, int workHour){
        this.day = day;
        this.workHour = workHour;

    }
    public String getDay(){
        return day;
    }

    public int getWorkHour(){
        return workHour;
    }
}
