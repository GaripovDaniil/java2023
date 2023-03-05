package src.education;

import java.util.ArrayList;

public class Mark {
    private final String subject;
    private int markForSubject;
    private final ArrayList<Task> tasks;

    /**
     *
     * @param subject Название предмета
     * @param tasks Список заданий по предмету
     */
    public Mark(String subject, ArrayList<Task> tasks){
        this.subject = subject;
        this.tasks = tasks;
    }

    /**
     *
     * @return Название предмета
     */
    public String getSubject(){
        return subject;
    }

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
        markForSubject = Math.round(mark / count);
    }
}
