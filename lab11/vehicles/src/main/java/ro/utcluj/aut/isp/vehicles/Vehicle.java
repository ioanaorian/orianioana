package ro.utcluj.aut.isp.vehicles;

import java.util.Objects;

public class Vehicle {
    private String type;
    private int weight;

    public Vehicle(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return weight == vehicle.weight &&
                type.equals(vehicle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, weight);
    }
}
