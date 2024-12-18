package racing;

import java.util.Objects;

public class CarName {

    private String name;

    public CarName(String name) {
        if (name.length() > 10) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 10자 이내");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName = (CarName) o;
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "CarName{" +
                "name='" + name + '\'' +
                '}';
    }
}
