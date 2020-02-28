package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StudentTest extends TestCase {


    public void testEmptyConstructor() {
        Student student = new Student();
        student.setSchoolName("Uni of Che");

        assertThat(student.getSchool(), is("UNI of Che"));
        assertThat(student.announce(), is( "I am study in university" + student.getSchool());
        }
}