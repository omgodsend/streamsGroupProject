package data;

import challenges.StudentOps;
import domain.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class StudentOpsTest {


        private static List<Student> students;

        @BeforeAll
        static void setUp() throws IOException {
            // Fetch data before all tests
            students = FetchData.getStudentList();
        }



        @Test
        void shouldReturnEmptyListWhenNoStudentsMatchGender() {
            List<Student> filteredStudents = StudentOps.filterStudentsByGender(students, "Other");
            assertThat(filteredStudents).isEmpty();
        }

        @Test
        void shouldReturnListStudentsMatchingGender() {
            List<Student> filteredStudents = StudentOps.filterStudentsByGender(students, "Female");
            assertEquals("Female",filteredStudents.get(5).getGender());
        }

        @Test
        void shouldReturnYoungestFemale(){
            Optional<Student> filteredStudents = StudentOps.youngestFemale(students);
            assertEquals(17,filteredStudents.get().getAge());

        }


    }

