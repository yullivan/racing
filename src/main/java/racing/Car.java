package racing;

import java.util.Objects;

public class Car {

    private CarName name;
    private int distance;

    public Car(String name, int distance) {
        this.name = new CarName(name);
        this.distance = distance;
    }

    public Car(CarName name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public CarName getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public boolean drive(int randomNumber) {
        if (randomNumber >= 3) {
            distance += 1;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return distance == car.distance && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distance);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}
