package src.education;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void checkingTaskCreationName() {
        var task = new Task.TaskBuilder("Программирование", 1, 5).build();
        assertEquals("Программирование", task.getSubjectName());
    }

    @Test
    void checkingTaskCreationNumber() {
        var task = new Task.TaskBuilder("Программирование", 1, 5).build();
        assertEquals(1, task.getNumberOfTask());
    }

    @Test
    void checkingTaskCreationMark() {
        var task = new Task.TaskBuilder("Программирование", 1, 5).build();
        assertEquals(5, task.getMarkForTask());
    }

    @Test
    void changeMarkIsCorrect() {
        var task = new Task.TaskBuilder("Программирование", 1, 3).build();
        task.changeMarkForTask(4);
        assertEquals(4, task.getMarkForTask());
    }
}