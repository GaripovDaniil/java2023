package src.education;

import java.util.List;

public class Student {
    private final String name;
    private int scholarship;
    private final List<Mark> marks;

    /**
     *
     * @param studentBuilder Конструктор для создания студента
     */
    private Student(StudentBuilder studentBuilder) {
        name = studentBuilder.name;
        marks = studentBuilder.marks;
        scholarship = findScholarship();
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
     * @return 3000, если у студента все пятерки; 2000, если есть четверка; 0, если есть тройка или двойка
     */
    public int getScholarship(){
        scholarship = findScholarship();
        return scholarship;
    }

    /**
     * У студента все пятерки => стипендия 3000
     * Есть четверка => 2000
     * Есть тройка или двойка => 0
     */
    private int findScholarship(){
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
        if (thereIsFour){
            return 2000;
        }
        if (thereIsThree || thereIsTwo){
            return 0;
        }
        return 3000;
    }

    public static class StudentBuilder {
        private final String name;
        private final List<Mark> marks;

        /**
         *
         * @param name Имя студента
         * @param marks Оценки студента за предметы
         */
        public StudentBuilder(String name, List<Mark> marks) {
            this.name = name;
            this.marks = marks;
        }

        /**
         *
         * @return Объект класса Студент
         */
        public Student build() {
            return new Student(this);
        }
    }
}
