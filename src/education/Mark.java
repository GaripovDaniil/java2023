package src.education;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class Mark {
    /**
     * Имя предмета
     */
    @Getter
    private final String subject;
    private int markForSubject;
    private final List<Task> tasks;

    /**
     *
     * @return Оценка за предмет
     */
    public int getMarkForSubject(){
        findMarkForSubject();
        return markForSubject;
    }

    /**
     *
     * @param task Добавить задание
     */
    public void appendTask(Task task){
        tasks.add(task);
    }

    /**
     * Высчитывает среднуюю арифметическую оценок за задания и округляет до целого числа
     */
    private void findMarkForSubject(){
        int count = 0;
        float mark = 0;
        for (Task task : tasks){
            mark += task.getMarkForTask();
            count++;
        }
        markForSubject = count != 0? Math.round(mark / count) : 0;
    }
}
