package Coin;

import java.util.Objects;

public class Ethereum extends Coin{
    private String name = "Ethereum";

    private static double price = 1216.5;

    public static double getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public Ethereum(){
        System.out.println("Congratulations, you have purchased Ethereum");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ethereum ethereum = (Ethereum) o;
        return Objects.equals(name, ethereum.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
