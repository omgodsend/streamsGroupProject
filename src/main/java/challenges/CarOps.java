package challenges;

import domain.Car;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarOps {

    //21. Filter by Make: Filter the list of cars to only include cars with a specific make.
    public static List<Car> carWithSpecificMake(List<Car> cars){
        return cars.stream()
                .filter(car -> car.getMake().equalsIgnoreCase("Ford"))
                .collect(Collectors.toList());
    }

//   22: Filter by Year: Filter the list of cars to only include cars from a specific year.
    public static List<Car> carWithSpecificYear(List<Car> cars){
        return cars.stream()
                .filter(car -> car.getYear() == 2010)
                .collect(Collectors.toList());
    }

    //23: Filter by Price: Filter the list of cars to only include cars within a price range.
    public static List<Car> carWithSpecificPriceRange(List<Car> cars){
        return cars.stream()
                .filter(car -> car.getPrice() > 10000 && car.getPrice() < 20000)
                .collect(Collectors.toList());
    }

    //24:Map to Model Names: Create a list of car model names from the list of cars.
    public static List<String> carModelNames(List<Car> cars){
        return cars.stream()
                .map(Car::getModel)
                .collect(Collectors.toList());
    }

    //25:Map to Upper Case Makes: Create a list of car makes in uppercase from the list of cars.
    public static List<String> carMakeInUpperCase(List<Car> cars){
        return cars.stream()
                .map(Car::getMake)
                .map(String::toUpperCase)
                .toList();
    }

    //26:Sort by Year: Sort the list of cars based on the year in ascending order.
    public static List<Car> sortCarByYear(List<Car> cars){
        return cars.stream()
                .sorted(Comparator.comparingInt(Car::getYear))
                .collect(Collectors.toList());
    }

    //27:Sort by Price (descending): Sort the list of cars based on the price in descending order.
    public static List<Car> sortCarByPriceDescending(List<Car> cars){
        return cars.stream()
                .sorted(Comparator.comparingDouble(Car::getPrice).reversed())
                .collect(Collectors.toList());
    }

    //28:Get the Highest Priced Car: Find the car with the highest price.
    public static Optional<Car> getTheHighestPricedCar(List<Car> cars){
        return cars.stream()
                .max(Comparator.comparingDouble(Car::getPrice));
    }

    //29:Get the Lowest Priced Car: Find the car with the lowest price.
    public static Optional<Car> getTheLowestPricedCar(List<Car> cars){
        return cars.stream()
                .min(Comparator.comparingDouble(Car::getPrice));
    }

    //30: Group by Make: Group the cars by their make.
    public static Map<String, List<Car>> groupCarByMake(List<Car> cars){
        return cars.stream()
                .collect(Collectors.groupingBy(Car::getMake));
    }

    //31. Count Cars by Make: Count the number of cars for each make.
    public static Map<String, Long> countCarsByMake (List<Car> cars){
        return cars.stream()
                .collect(Collectors.groupingBy(Car::getMake, Collectors.counting()));
    }


    //32. Average Price: Calculate the average price of all cars.
    public static double averagePriceOfCars (List<Car> cars){
                OptionalDouble avg = cars.stream()
                .mapToDouble(Car::getPrice)
                .average();
        return avg.orElse(0.0);
    }

    //33. Sum of Prices: Calculate the sum of all car prices.
    public static double sumOfPriceOfCars(List<Car> cars){
         return cars.stream()
                 .mapToDouble(car -> (double) car.getPrice())
                 .reduce(0, Double::sum);

    }
    //34. Any Car with Blue Color: Check if there's any car with a blue color.
    public static boolean carsWithBlueColor(List<Car> cars){
       return cars.stream()
                .anyMatch(car -> car.getColor().equalsIgnoreCase("blue"));
    }

    //35. All Cars are Expensive: Check if all cars are expensive (e.g., price > 50000).
    public static boolean isAllCarExpensive(List<Car> cars) {
        return cars.stream()
                .anyMatch(car -> car.getPrice() > 50000);
    }

    //36. None Match the Condition: Check if none of the cars match a specific condition.
    public static boolean isThisConditionMatch(List<Car> cars) {
        return  cars.stream()
                .noneMatch(car -> car.getModel().equalsIgnoreCase("Sonata"));
    }

    //37. Skip First N Cars: Skip the first N cars from the list.
    public static List<Car> skippingTheFirst5Cars(List<Car> cars, int n){
         return cars.stream()
                 .skip(n)
                 .collect(Collectors.toList());
    }

    //38. Limit to N Cars: Limit the list to the first N cars.
    public static List<Car> limitingTheFirstNCars(List<Car> cars, int n){
        return cars.stream()
                .limit(n)
                .collect(Collectors.toList());
    }

    //39. Distinct Colors: Get a list of distinct car colors.
    public static List<String> listOfDistinctCarColor(List<Car> cars){
        return cars.stream()
                .map(Car::getColor)
                .distinct()
                .collect(Collectors.toList());
    }

    //40. Concatenate Make and Model: Concatenate the make and model of each car.
    public static List<String> concatenatingMakeAndModel(List<Car> cars){
        return cars.stream()
                .map(car -> car.getModel() + " " + car.getModel())
                .collect(Collectors.toList());
    }

    //41. Find First Car: Find the first car in the list.
    public static Optional<Car> findTheFirstCar(List<Car> cars){
        return cars.stream()
                .findFirst();
    }

    //42. Find Any Car: Find any car in the list.
    public static Optional<Car> findAnyCar(List<Car> cars){
        return cars.stream()
                .findAny();
    }

    //43. Remove Duplicates: Remove duplicate cars from the list based on make and model.

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
    public static List<Car> removeDuplicateCars(List<Car> cars) {
        return cars.stream()
                .filter(distinctByKey(car -> car.getMake() + car.getModel()))
                .collect(Collectors.toList());

    }

    //44. Partition Cars by Price: Partition the cars into two groups based on whether their price is above a certain value.
    public static Map<Boolean, List<Car>> highPriceAndLowPrice(List<Car> cars, double idealPrice){
        return cars.stream()
                .collect(Collectors.partitioningBy(car -> car.getPrice() > idealPrice));
    }

    //45. Calculate Total Price by Make: Calculate the total price of cars for each make.
    public static Map<String, Double> calculateTotalPriceByMake(List<Car> cars) {
        return cars.stream()
                .collect(Collectors.groupingBy(
                        Car::getMake,
                        Collectors.summingDouble(Car::getPrice)
                ));
    }

    //46. Join Car Names into a String: Join the names of all cars into a single comma-separated string.
    public static String joinCarsByNames(List<Car> cars) {
        return cars.stream()
                .map(car -> car.getMake() + " " + car.getModel())
                .collect(Collectors.joining(", "));
    }

    //47. Peek and Print: Use peek to print the details of each car in the stream.
    public static void printCarDetails(List<Car> cars) {
        cars.stream()
                .peek(car -> System.out.println("Id: " + car.getId() + ", Make: " + car.getMake() + ", Model: "
                        + car.getModel() + ", Year " + car.getYear() + ", Price: " + car.getPrice() + ", Color: " + car.getColor()))
                .forEach(car -> {});
    }

    //48. Average Price by Make: Calculate the average price of cars for each make.
    public static Map<String, Double> averagePriceOfCarsByMake(List<Car> cars){
        return cars.stream()
                .collect(Collectors.groupingBy(Car::getMake, Collectors.averagingDouble(Car::getPrice)));
    }

    //49. Concatenate All Car Details: Concatenate all car details into a single string.
    public static String concatenateAllCarDetails(List<Car> cars) {
        return cars.stream()
                .map(car -> car.getId() + car.getMake() + car.getModel() + car.getYear()
                        + car.getPrice() + car.getColor())
                .collect(Collectors.joining());
    }

    //50. Find the Newest Car: Find the newest (latest year) car in the list.
    public static List<Car> newestCarFromTheList (List<Car> cars){
        Optional<Integer> newCar = cars.stream()
                .map(Car::getYear)
                .max(Integer::compareTo);
                //.max(Comparator.comparingDouble(Car::getYear));
        if(newCar.isPresent()) {
            int newestCar = newCar.get();
            return cars.stream()
                    .filter(car -> car.getYear() == newestCar)
                    .collect(Collectors.toList());
        }
        return List.of();
    }

}
