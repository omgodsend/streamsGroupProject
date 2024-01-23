package data;

import challenges.CarOps;
import challenges.StudentOps;
import domain.Car;
import domain.Student;

import javax.naming.Name;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static challenges.CarOps.*;
import static challenges.StudentOps.*;
import static data.FetchData.getCarList;
import static data.FetchData.getStudentList;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Car> cars = getCarList();
        List<Student> students = getStudentList();

//        System.out.println("Question1: +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        getCarList().stream()
//                .limit(5)
//                .forEach(System.out::println);
//        System.out.println("++++++++++++++++");
//        getStudentList().stream()
//                .limit(5)
//                .forEach(System.out::println);
//
//        System.out.println("Question2 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        List<Student> sortedStudents = StudentOps.sortStudentsByAge(getStudentList());
//
//        if (sortedStudents != null) {
//            sortedStudents.forEach(student -> {
//                System.out.println(student.getFirst_name() + ": " + student.getAge());
//            });
//        }
//        System.out.println("Question3 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //not filled out yet

//        System.out.println("Question4 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        StudentOps.getNames(getStudentList());

//        System.out.println("Question5 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        Map<String, List<Student>> groupedByGender = groupByGender(getStudentList());
//
//        groupedByGender.forEach((gender, studentList) -> {
//            System.out.println("Gender: " + gender);
//            studentList.forEach(System.out::println);
//        });
//
//
//        System.out.println("Question6 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        maxAge(students).ifPresent(student -> {
//            System.out.println("Name: " + student.getFirst_name());
//            System.out.println("Age: " + student.getAge());
//        });


//        System.out.println("Question7 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        transformToMap(students).forEach((x,y) -> {
//            System.out.println(x);
//            System.out.println(y);
//        });

//        System.out.println("Question8 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        listEmails(students).forEach(System.out::println);

//        System.out.println("Question9 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        adultList(students)
//                .forEach(student -> {
//                    System.out.println("Name: " + student.getFirst_name() );
//                    System.out.println("Age: " + student.getAge());
//                });

//        System.out.println("Question9 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        System.out.println("Question10 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        countStudents(students).forEach((x,y) -> {
//            System.out.println(x);
//            System.out.println(y);
//        });

//        System.out.println("Question11 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        youngestFemale(students).ifPresent(youngestFemale ->
//                System.out.println("Youngest Female Student: " +
//                        "Name: " + youngestFemale.getFirst_name() +
//                        ", Age: " + youngestFemale.getAge()));



//        System.out.println("Question12 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println(firstNames(students));

//        System.out.println("Question13 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println(ageSum(students));

//        System.out.println("Question14 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        if (allAdult(students)) {
//            System.out.println("This list contains All Adults");
//        } else {
//            System.out.println("Not All Adults");
//        }


//        System.out.println("Question15 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        oldestStudent(students);


//        System.out.println("Question16 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println(firstToUpper(students));

//        System.out.println("Question17 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println(findID(students,1));

//        System.out.println("Question18 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        computeAgeDistribution(students).forEach((x,y) -> {
//                    System.out.println("Age: " + x + " Count: " + y);
//                });

//        System.out.println("Question19 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        groupByAge(students).forEach((age, studentsInAgeGroup) -> {
//            System.out.println("Ages: " + age);
//            studentsInAgeGroup.forEach(System.out::println);
//        });

//        System.out.println("Question20 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println(stdDev(students));

//        System.out.println("Question21 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        List<Car> SpecificMake = carWithSpecificMake(cars);
//        System.out.println(SpecificMake);
//
//
//        System.out.println("Question31 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        Map<String, Long> carCountsByMake = CarOps.countCarsByMake(cars);
//
//        carCountsByMake.forEach((make, count) -> {
//            System.out.println(make + ": " + count);
//        });
//
//        System.out.println("Question32 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        double avgPrice = averagePriceOfCars(cars);
//        System.out.println("The average of car price is " + avgPrice);
//
//
//        System.out.println("Question33 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        double sumOfPrice = sumOfPriceOfCars(cars);
//        System.out.println("The sum of price of cars is " + sumOfPrice);
//
//        System.out.println("Question34 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        boolean isBlueCar = carsWithBlueColor(cars);
//        System.out.println("is there a blue car ? " + isBlueCar);
//
//        System.out.println("Question35 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        boolean isExpensive = isAllCarExpensive(cars);
//        System.out.println("is there very expensive car ? "+ isExpensive);
//
//        System.out.println("Question36 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        boolean isItMatch = isThisConditionMatch(cars);
//        System.out.println("is Sonata a match ? " + isItMatch);
//
//        System.out.println("Question37 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        List<Car> skippedCar = skippingTheFirst5Cars(cars, 5);
//        System.out.println(skippedCar);
//
//        System.out.println("Question38 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        List<Car> limitCar = limitingTheFirstNCars(cars, 10);
//        System.out.println(limitCar);
//
//        System.out.println("Question39 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        List<String> distinct = listOfDistinctCarColor(cars);
//        System.out.println("The distinct car colors are " + distinct);
//
//        System.out.println("Question40 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        List<String> concatenate = concatenatingMakeAndModel(cars);
//        System.out.println(concatenate);
//
//        System.out.println("Question41 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        Optional<Car> findFirst = findTheFirstCar(cars);
//        System.out.println(findFirst);
//
//        System.out.println("Question42 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        Optional<Car> findAny = findAnyCar(cars);
//        System.out.println(findAny);
//
//        System.out.println("Question43 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        List<Car> removeDuplicates = removeDuplicateCars(cars);
//        System.out.println(removeDuplicates);
//        System.out.println(removeDuplicates.size());
//
//
//        System.out.println("Question44 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        Map<Boolean, List<Car>> price = highPriceAndLowPrice(cars, 50000);
//        System.out.println(price);
//        System.out.println(price.size());
//
//        System.out.println("Question45 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        Map<String, Double> calculatePrice = calculateTotalPriceByMake(cars);
//        System.out.println(calculatePrice);
//
//        System.out.println("Question46 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        String joinCarName = joinCarsByNames(cars);
//        System.out.println(joinCarName);
//
//        System.out.println("Question47 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        printCarDetails(cars);
//
//        System.out.println("Question48 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        Map<String, Double> averagePrice = averagePriceOfCarsByMake(cars);
//        System.out.println(averagePrice);
//
//        System.out.println("Question49 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        String concat = concatenateAllCarDetails(cars);
//        System.out.println(concat);
//
//        List<Car> theNewestCar = newestCarFromTheList(cars);
//        System.out.println("The newest car are: " + theNewestCar);
//
//        System.out.println(StudentOps.averageAge(getStudentList()));
//
    }
}