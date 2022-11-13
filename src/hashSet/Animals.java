package hashSet;

import java.util.Objects;

public class Animals {
    String name;
    int weight;

    public Animals(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals animals)) return false;
        return weight == animals.weight && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}
