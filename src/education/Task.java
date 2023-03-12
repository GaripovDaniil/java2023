package src.education;

public class Task {
    private final String subjectName;
    private final int numberOfTask;
    private int markForTask;

    /**
     *
     * @param taskBuilder Конструктор задания
     */
    private Task(TaskBuilder taskBuilder){
        subjectName = taskBuilder.subjectName;
        numberOfTask = taskBuilder.numberOfTask;
        markForTask = taskBuilder.markForTask;
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

    public static class TaskBuilder {
        private final String subjectName;
        private final int numberOfTask;
        private final int markForTask;

        /**
         *
         * @param subjectName Название предмета
         * @param numberOfTask Номер задания
         * @param markForTask Оценка за задание
         */
        public TaskBuilder(String subjectName, int numberOfTask, int markForTask) {
            this.subjectName = subjectName;
            this.numberOfTask =numberOfTask;
            this.markForTask = markForTask;
        }

        /**
         *
         * @return Объект класса Задание
         */
        public Task build() {
            return new Task(this);
        }
    }
}
