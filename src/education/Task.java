package src.education;

public class Task {
    private final String subjectName;
    private final int numberOfTask;
    private int markForTask;

    /**
     *
     * @param subjectName Название предмета
     * @param numberOfTask Номер задания
     * @param markForTask Оценка за задание
     */
    public Task(String subjectName, int numberOfTask, int markForTask){
        this.subjectName = subjectName;
        this.numberOfTask = numberOfTask;
        this.markForTask = markForTask;
    }

    /**
     *
     * @return Название предмета
     */
    public String getSubjectName(){
        return subjectName;
    }

    /**
     *
     * @return Номер задания
     */
    public int getNumberOfTask(){
        return numberOfTask;
    }

    /**
     *
     * @return Оценка за задание
     */
    public int getMarkForTask(){
        return markForTask;
    }

    /**
     * Меняет оценку за задание
     * @param newMarkForTask Новая оценка за задание
     */
    public void changeMarkForTask(int newMarkForTask){
        markForTask = newMarkForTask;
    }
}
