package challenges;

import domain.Student;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class StudentOps {
    //  1. Filter Students by Gender: Write a method to filter a list of students by their gender.

    public static List<Student> filterStudentsByGender(List<Student> students, String gender) {
        return students.stream()
                .filter(student -> student.getGender().equalsIgnoreCase(gender))
                .toList();
    }

    //2. Sort Students by Age: Sort the list of students by their age (based on date of birth).
    public static List<Student> sortStudentsByAge(List<Student> students) {
        LocalDate currentDate = LocalDate.now();
        students.forEach(student -> {
            LocalDate dob = student.getDob();
            Period period = Period.between(dob, currentDate);
            student.setAge(period.getYears());
        });
        return students.stream()
                .sorted(Comparator.comparing(Student::getAge))
                .toList();
    }

    //3. Calculate Average Age: Calculate and return the average age of students in the list.
    public static double averageAge(List<Student> students) {

        return students.stream()
                .map(Student::getDob)
                .mapToDouble(LocalDate::getYear)
                .average()
                .orElse(0.0);
    }

    //4: Print Student Names: Print the full names of all students in the list.
    public static void getNames(List<Student> students) {
                students.stream()
                .map(student -> student.getFirst_name() + " " + student.getLast_name())
                .forEach(System.out::println);
    }

    //5: Group Students by Gender: Group the students by gender.
    public static Map<String, List<Student>> groupByGender(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getGender));
    }

    //GET AGE
    public static void calculateAge(List<Student> students) {
        LocalDate currentDate = LocalDate.now();
        students.forEach(student -> {
            LocalDate dob = student.getDob();
            Period period = Period.between(dob, currentDate);
            student.setAge(period.getYears());
        });
    }


        //6:Find Maximum Age: Find the maximum age among all students.
    public static Optional<Student> maxAge (List < Student > students) {

        calculateAge(students);
        return students.stream()
                .max(Comparator.comparing(Student::getAge));
    }

    //7:Transform to Map: Convert the list of students into a map where the key is the student ID and the value is the student object.
    public static Map<Integer, Student> transformToMap(List<Student> students){
        return students.stream()
                .collect(Collectors.toMap(Student::getId, student -> student));
    }

    //8:Get Student Emails: Retrieve a list of student emails.
    public static List<String> listEmails(List<Student> students) {
     return    students.stream()

             .filter(student -> student.getEmail() != null && !student.getEmail().isEmpty())
             .map(Student::getEmail)
             .toList();
    }

    //9:Check if Any Student is Adult: Check if any student is an adult (age 18 or older)
    public static List<Student> adultList(List<Student> students) {
        calculateAge(students);
        return students.stream()
                .filter(student -> student.getAge() >= 18)
                .toList();
    }

//    10:Count Students by Gender: Count the number of students for each gender.
    public static Map<String, Long> countStudents(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getGender, counting()));
    }

//    11:Find Youngest Female Student: Find the youngest female student.
    public static Optional<Student> youngestFemale(List<Student> students) {
        calculateAge(students);

    return    students.stream()
                .filter(student -> Objects.equals(student.getGender(), "Female"))
                .min(Comparator.comparing(Student::getAge));
    }

//    12:Join Student Names: Join the first names of all students into a single string.
    public static String firstNames(List<Student> students){
        return students.stream()
                .map(Student::getFirst_name)
                .collect(Collectors.joining(""));
    }

//    13:Calculate Age Sum: Calculate the sum of ages for all students.
    public static Integer ageSum(List<Student> students) {
        calculateAge(students);

        return students.stream()
                .mapToInt(Student::getAge)
                .sum();
    }

//    14:Check if All Students are Adults: Check if all students are adults (age 18 or older).
    public static Boolean allAdult(List<Student> students){
        calculateAge(students);

        return students.stream()
                .allMatch(student -> student.getAge() >= 18);
    }

//    15:Find Oldest Student: Find the oldest student.
    public static void oldestStudent(List<Student> students) {
         students.stream()
                .max(Comparator.comparing(Student::getAge))
                .ifPresent(s -> {
            System.out.println("Oldest Student: " + System.lineSeparator() + "Name: " + s.getFirst_name() + " Age: " + s.getAge());
        });
    }
//    16:Convert to Uppercase: Convert all student first names to uppercase.
    public static List<String> firstToUpper(List<Student> students) {

        return students.stream()
                .map(s -> s.getFirst_name().toUpperCase())
                .toList();
    }


//    17:Find Student by ID: Find a student by their ID.
    public static Student findID(List<Student> students, Integer Id) {
        return students.stream()
                .filter(student -> student.getId().equals(Id))
                .findFirst()
                .orElse(null);
    }

//    18:Compute Age Distribution: Compute the distribution of ages (e.g., count of students for each age).
    public static Map<Integer, Long> computeAgeDistribution(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy((Student::getAge), counting()));
    }
//    19:Group Students by Age: Group the students by their age.
    public static Map<Integer, List<Student>> groupByAge(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getAge));
    }

//    20: Calculate Age Standard Deviation: Calculate the standard deviation of ages for all students.
    public static double stdDev(List<Student> students) {
        double mean = students.stream()
                .mapToInt(Student::getAge)
                .average()
                .orElse(0.0);

        double variance = students.stream()
                .mapToDouble(student -> Math.pow(student.getAge() - mean, 2))
                .average()
                .orElse(0.0);

        return Math.sqrt(variance);
    }










}
