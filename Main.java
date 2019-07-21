package Lesson_1.Marathon;

import Lesson_1.Marathon.Course.Cross;
import Lesson_1.Marathon.Course.Wall;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"), new  Human("Ваня"), new Cat("Снежок")};
        Obstacle[] course = {new Cross(80), new Wall(20), new Wall(1), new Cross(120)};
        for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }
    }
}