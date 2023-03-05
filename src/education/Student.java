package src.education;

import java.util.List;

public class Student {
    private final String name;
    private int scholarship;
    private final List<Mark> marks;

    /**
     *
     * @param name Имя студента
     * @param marks Оценки студента за предметы
     */
    public Student(String name, List<Mark> marks) {
        this.name = name;
        this.marks = marks;
    }

    /**
     *
     * @return Имя студента
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return Стипендия студента
     */
    public int getScholarship(){
        findScholarship();
        return scholarship;
    }

    /**
     * У студента все пятерки => стипендия 3000
     * Есть четверка => 2000
     * Есть тройка или двойка => 0
     */
    private void findScholarship(){
        var thereIsFour = false;
        var thereIsThree = false;
        var thereIsTwo = false;
        for (Mark mark : marks){
            if (!thereIsFour) {
                thereIsFour = mark.getMarkForSubject() == 4;
            }
            if (!thereIsThree) {
                thereIsThree = mark.getMarkForSubject() == 3;
            }
            if (!thereIsTwo){
                thereIsTwo = mark.getMarkForSubject() == 2;
            }
        }
        if (!thereIsFour){
            scholarship = 3000;
        }
        if (thereIsFour){
            scholarship = 2000;
        }
        if (thereIsThree || thereIsTwo){
            scholarship = 0;
        }
    }
}
