package src.education;

import lombok.Builder;
import lombok.Getter;

@Builder
public class Task {
    @Getter
    private final String subjectName;
    @Getter
    private final int numberOfTask;
    @Getter
    private int markForTask;



    /**
     * Меняет оценку за задание
     * @param newMarkForTask Новая оценка за задание
     */
    public void changeMarkForTask(int newMarkForTask){
        markForTask = newMarkForTask;
    }
}
