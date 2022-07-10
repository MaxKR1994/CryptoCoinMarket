package Coin;

import java.util.Objects;

public class DogeCoin extends Coin{

    private String name = "DogeCoin";

    private static double price = 0.05;

    public String getName() {
        return name;
    }

    public static double getPrice() {
        return price;
    }

    public DogeCoin(){
        System.out.println("Congratulations, you have purchased DogeCoin");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DogeCoin dogeCoin = (DogeCoin) o;
        return Objects.equals(name, dogeCoin.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
