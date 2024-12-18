package racing;

import java.util.Objects;

public class DriveCount {

    private int count;

    public DriveCount(int count) {
        if (count < 1) {
            throw new IllegalArgumentException("[ERROR] 진행 횟수는 1 이상");
        }
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriveCount that = (DriveCount) o;
        return count == that.count;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(count);
    }

    @Override
    public String toString() {
        return "DriveCount{" +
                "count=" + count +
                '}';
    }
}
