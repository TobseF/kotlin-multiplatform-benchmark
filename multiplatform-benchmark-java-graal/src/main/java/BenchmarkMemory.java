import java.util.ArrayList;
import java.util.Objects;

public class BenchmarkMemory {

    void benchObjectList(int iterations) {
        var list = new ArrayList<Machine>();
        for (int i = 0; i < iterations; i++) {
            list.add(new Machine("ABC-0" + i, i, (i / 3.0)));
        }
    }

    private static class Machine {
        String name;
        Integer wheels;
        Double weight;

        public Machine(String name, int wheels, double weight) {
            this.name = name;
            this.wheels = wheels;
            this.weight = weight;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Machine that = (Machine) o;
            return wheels == that.wheels && Double.compare(that.weight, weight) == 0 && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, wheels, weight);
        }

    }
}
