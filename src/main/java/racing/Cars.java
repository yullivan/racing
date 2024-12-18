package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {

    private List<Car> cars = new ArrayList<>();

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars.stream().toList();
    }

    public void driveAll() {
        for (Car car : cars) {
            car.drive(Game.getRandomNumber());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cars);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "cars=" + cars +
                '}';
    }
}
