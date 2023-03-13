package src.education;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MarkTest {

    @Test
    void checkingMarkCreation() {
        var mark = new Mark("Программирование", new ArrayList<>());
        assertEquals("Программирование", mark.getSubject());
    }

    @Test
    void appendTaskIsCorrect() {
        var mark = new Mark("Программирование", new ArrayList<>());
        mark.appendTask(new Task.TaskBuilder().subjectName("Программирование").numberOfTask(1).markForTask(4).build());
        assertEquals(4, mark.getMarkForSubject());
    }

    @Test
    void findMarkIsCorrect() {
        var mark = new Mark("Программирование", new ArrayList<>());
        mark.appendTask(new Task.TaskBuilder().subjectName("Программирование").numberOfTask(1).markForTask(4).build());
        mark.appendTask(new Task.TaskBuilder().subjectName("Программирование").numberOfTask(2).markForTask(5).build());
        assertEquals(5, mark.getMarkForSubject());
    }
}