import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PriceManager implements Subject {

    private ArrayList<Observer> observers;
    private Map<String, Double> prices;

    public PriceManager(){

        observers = new ArrayList<>();
        prices = new HashMap<>();
    }


    @Override
    public void registerObserver(Observer observer) {

        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {

        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {

        for(Observer observer : observers){
            observer.update(prices);
        }
    }

    public void addItem(String itemName, double price){
        updateMap(itemName, price);
    }

    public void changeItemPrice(String itemName, double price){
        updateMap(itemName, price);
    }

    private void updateMap(String itemName, double price) {
        prices.put(itemName, price);
    }

}
