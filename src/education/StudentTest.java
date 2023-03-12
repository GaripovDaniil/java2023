package src.education;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void checkingStudentCreationName(){
        var student = new Student.StudentBuilder("Петя", new ArrayList<>()).build();
        assertEquals("Петя", student.getName());
    }

    @Test
    void scholarshipIsCorrectFive(){
        var marks = new ArrayList<Mark>();
        marks.add(new Mark("Программирование", new ArrayList<>()));
        marks.add(new Mark("ОБЖ", new ArrayList<>()));
        marks.get(0).appendTask(new Task.TaskBuilder("Программирование", 1, 5).build());
        marks.get(1).appendTask(new Task.TaskBuilder("ОБЖ", 1, 5).build());
        var student = new Student.StudentBuilder("Петя", marks).build();
        assertEquals(3000, student.getScholarship());
    }

    @Test
    void scholarshipIsCorrectFour(){
        var marks = new ArrayList<Mark>();
        marks.add(new Mark("Программирование", new ArrayList<>()));
        marks.add(new Mark("ОБЖ", new ArrayList<>()));
        marks.get(0).appendTask(new Task.TaskBuilder("Программирование", 1, 4).build());
        marks.get(1).appendTask(new Task.TaskBuilder("ОБЖ", 1, 5).build());
        var student = new Student.StudentBuilder("Петя", marks).build();
        assertEquals(2000, student.getScholarship());
    }

    @Test
    void scholarshipIsCorrectThree(){
        var marks = new ArrayList<Mark>();
        marks.add(new Mark("Программирование", new ArrayList<>()));
        marks.add(new Mark("ОБЖ", new ArrayList<>()));
        marks.get(0).appendTask(new Task.TaskBuilder("Программирование", 1, 3).build());
        marks.get(1).appendTask(new Task.TaskBuilder("ОБЖ", 1, 5).build());
        var student = new Student.StudentBuilder("Петя", marks).build();
        assertEquals(0, student.getScholarship());
    }

    @Test
    void scholarshipIsCorrectTwo(){
        var marks = new ArrayList<Mark>();
        marks.add(new Mark("Программирование", new ArrayList<>()));
        marks.add(new Mark("ОБЖ", new ArrayList<>()));
        marks.get(0).appendTask(new Task.TaskBuilder("Программирование", 1, 2).build());
        marks.get(1).appendTask(new Task.TaskBuilder("ОБЖ", 1, 5).build());
        var student = new Student.StudentBuilder("Петя", marks).build();
        assertEquals(0, student.getScholarship());
    }
}