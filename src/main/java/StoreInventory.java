import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StoreInventory implements Observer {

    private Subject priceManager;
    private HashMap<String, Double> prices;


    public StoreInventory(Subject priceManager){

        this.priceManager = priceManager;
        this.prices = new HashMap<>();
    }

    @Override
    public void update(Map<String, Double> prices) {
        this.prices.putAll(prices);
    }

    public void printPrices(){

        Set<Map.Entry<String, Double>> priceEntries = this.prices.entrySet();
        for(Map.Entry<String, Double> priceEntry : priceEntries){
            System.out.println(priceEntry.getKey()  + ": " + priceEntry.getValue());
        }
    }
}
