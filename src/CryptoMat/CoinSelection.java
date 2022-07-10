package CryptoMat;

import Coin.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CoinSelection {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void cryptoMenu(){
        System.out.println("    Wellcome to our CryptoMarket      ");
        System.out.println("               Coins:                 ");
        System.out.println("       1. Bitcoin     21500.5$        ");
        System.out.println("       2. Ethereum     1216.5$        ");
        System.out.println("       3. LiteCoin       53.5$        ");
        System.out.println("       4. DogeCoin       0.05$          ");
        System.out.println("Enter number from 1 to 4 to select a coin");
        System.out.println("Enter 0 if you have completed the selection");
    }
    public static void orderCoin() throws IOException {
        ArrayList<Coin> coins = new ArrayList<>();
        fillArrayList(coins);
        int a = 0;
        while (true){
            int typeOfCoin = Integer.parseInt(READER.readLine());
            switch (typeOfCoin){
                case 1 -> {coins.add(new Bitcoin());a++;}
                case 2 -> {coins.add(new Ethereum());a++;}
                case 3 -> {coins.add(new LiteCoin());a++;}
                case 4 -> {coins.add(new DogeCoin());a++;}
                case 0 ->
                {
                 CoinSelection.totalCash(coins);
                 CoinSelection.amountOfCoins(coins);
                 CoinSelection.nameOfCoins(coins);
                 CoinSelection.getCoinPrice();
                }
                default -> System.out.println("Incorrect input");
            }
        }

    }
    public static void fillArrayList(ArrayList<Coin> coins){
        for (int i = 0; i < coins.size(); i++) {
            coins.add(new Coin());
        }
    }

    private static void totalCash(ArrayList<Coin> coins){
        double cash = 0;
        for(Coin coin : coins){
            if(coin.getClass() == Bitcoin.class){
                cash+=Bitcoin.getPrice();
            } else if (coin.getClass() == Ethereum.class) {
                cash+=Ethereum.getPrice();
            } else if (coin.getClass() == LiteCoin.class) {
                cash+=LiteCoin.getPrice();
            } else if (coin.getClass() == DogeCoin.class) {
                cash+=DogeCoin.getPrice();
            }
        }
        System.out.println("You have to pay " + cash + "$");
    }

    public static void amountOfCoins (ArrayList<Coin> coins){
        for (Coin coin : coins){
            if (coins.size() == 1){
                System.out.println("You can buy 1 coin");
            }
        }
        System.out.println("You can buy: " + coins.size() + " coins");
    }

    public static void nameOfCoins(ArrayList<Coin> coins){
        HashSet<Coin> hashSetCoin = new HashSet<>(coins);
        for (Coin coin : hashSetCoin){
            System.out.println(coin.getClass());
        }
    }

    public static void getCoinPrice () throws IOException {
        Map<String,Double> coinMap = new HashMap<>();
        coinMap.put("Bitcoin", 21500.5);
        coinMap.put("Ethereum", 1216.5);
        coinMap.put("LiteCoin", 53.5);
        coinMap.put("DogeCoin", 0.05);
        System.out.println("--------------------------------------------------");
        System.out.println("Enter 1 if you want to know the price of Bitcoin: ");
        System.out.println("Enter 2 if you want to know the price of Ethereum: ");
        System.out.println("Enter 3 if you want to know the price of LiteCoin: ");
        System.out.println("Enter 4 if you want to know the price of DogeCoin: ");
        System.out.println("Enter 0 to finish");
        int b = 0;
        while (true){
            int key = Integer.parseInt(READER.readLine());
            switch (key){
                case 1 -> {System.out.println("Bitcoin price: " + coinMap.get("Bitcoin") + "$" );}
                case 2 -> {System.out.println("Ethereum price: " + coinMap.get("Ethereum") + "$" );}
                case 3 -> {System.out.println("LiteCoin price: " + coinMap.get("LiteCoin") + "$" );}
                case 4 -> {System.out.println("DogeCoin price: " + coinMap.get("DogeCoin") + "$" );}
                case 0 -> {CoinSelection.finish();}
                default -> System.out.println("Incorrect input");
            }
        }
    }

    public static void finish (){
        System.out.println("Goodbye, see you next time");
    }

}
