package io.prochyra;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseSessionTest {

    @Test
    void create() {
        CourseSession session = new CourseSession("ENGL", "101");
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertThat(session.getNumberOfStudents()).isZero();
    }

    @Test
    void enrolStudents() {
        CourseSession session = new CourseSession("ENGL", "101");

        Student student1 = new Student("Cain DiVoe");
        session.enroll(student1);
        assertThat(session.getNumberOfStudents()).isOne();

        Student student2 = new Student("Coralee DeVaughn");
        session.enroll(student2);
        assertThat(session.getNumberOfStudents()).isEqualTo(2);
    }
}
