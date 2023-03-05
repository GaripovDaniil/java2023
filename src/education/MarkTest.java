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
        mark.appendTask(new Task("Программирование", 1, 4));
        assertEquals(4, mark.getMarkForSubject());
    }

    @Test
    void findMarkIsCorrect() {
        var mark = new Mark("Программирование", new ArrayList<>());
        mark.appendTask(new Task("Программирование", 1, 4));
        mark.appendTask(new Task("Программирование", 2, 5));
        assertEquals(5, mark.getMarkForSubject());
    }
}