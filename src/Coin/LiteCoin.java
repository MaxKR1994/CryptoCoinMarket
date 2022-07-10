package Coin;

import java.util.Objects;

public class LiteCoin extends Coin{
    private String name = "LiteCoin";

    private static double price = 53.5;

    public static double getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public LiteCoin(){
        System.out.println("Congratulations, you have purchased LiteCoin");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LiteCoin liteCoin = (LiteCoin) o;
        return Objects.equals(name, liteCoin.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
