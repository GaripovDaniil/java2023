package src.education;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
public class Student {
    @Getter
    private final String name;

    private int scholarship;
    @Getter
    private final List<Mark> marks;

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
}
