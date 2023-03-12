package src.education;

import java.util.List;

public class Mark {
    /**
     * Имя предмета
     */
    private final String subject;
    private int markForSubject;
    private final List<Task> tasks;

    /**
     *
     * @param subject Название предмета
     * @param tasks Список заданий по предмету
     */
    public Mark(String subject, List<Task> tasks){
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
        markForSubject = count != 0? Math.round(mark / count) : 0;
    }
}
