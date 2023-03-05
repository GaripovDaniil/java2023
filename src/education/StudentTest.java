package src.education;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void checkingStudentCreationName(){
        var student = new Student("Петя", new ArrayList<>());
        assertEquals("Петя", student.getName());
    }

    @Test
    void scholarshipIsCorrectFive(){
        var marks = new ArrayList<Mark>();
        marks.add(new Mark("Программирование", new ArrayList<>()));
        marks.add(new Mark("ОБЖ", new ArrayList<>()));
        marks.get(0).appendTask(new Task("Программирование", 1, 5));
        marks.get(1).appendTask(new Task("ОБЖ", 1, 5));
        var student = new Student("Петя", marks);
        assertEquals(3000, student.getScholarship());
    }

    @Test
    void scholarshipIsCorrectFour(){
        var marks = new ArrayList<Mark>();
        marks.add(new Mark("Программирование", new ArrayList<>()));
        marks.add(new Mark("ОБЖ", new ArrayList<>()));
        marks.get(0).appendTask(new Task("Программирование", 1, 4));
        marks.get(1).appendTask(new Task("ОБЖ", 1, 5));
        var student = new Student("Петя", marks);
        assertEquals(2000, student.getScholarship());
    }

    @Test
    void scholarshipIsCorrectThree(){
        var marks = new ArrayList<Mark>();
        marks.add(new Mark("Программирование", new ArrayList<>()));
        marks.add(new Mark("ОБЖ", new ArrayList<>()));
        marks.get(0).appendTask(new Task("Программирование", 1, 3));
        marks.get(1).appendTask(new Task("ОБЖ", 1, 5));
        var student = new Student("Петя", marks);
        assertEquals(0, student.getScholarship());
    }

    @Test
    void scholarshipIsCorrectTwo(){
        var marks = new ArrayList<Mark>();
        marks.add(new Mark("Программирование", new ArrayList<>()));
        marks.add(new Mark("ОБЖ", new ArrayList<>()));
        marks.get(0).appendTask(new Task("Программирование", 1, 2));
        marks.get(1).appendTask(new Task("ОБЖ", 1, 5));
        var student = new Student("Петя", marks);
        assertEquals(0, student.getScholarship());
    }
}