package Coin;

import java.util.Objects;

public class Bitcoin extends Coin {

    private String name = "Bitcoin";

    private static double price = 21500.5;

    public static double getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public Bitcoin(){
        System.out.println("Congratulations, you have purchased Bitcoin");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bitcoin bitcoin = (Bitcoin) o;
        return Objects.equals(name, bitcoin.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
