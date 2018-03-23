public class InventoryPriceSimulator {

    public static void main(String[] args){

        PriceManager priceManager = new PriceManager();

        StoreInventory storeInventory1 = new StoreInventory(priceManager);
        StoreInventory storeInventory2 = new StoreInventory(priceManager);
        StoreInventory storeInventory3 = new StoreInventory(priceManager);

        priceManager.registerObserver(storeInventory1);
        priceManager.registerObserver(storeInventory2);
        priceManager.registerObserver(storeInventory3);

        priceManager.addItem("Apple", 0.65);
        priceManager.addItem("Folding Chair", 19.99);
        priceManager.addItem("Snow Shovel", 0.65);

        priceManager.notifyObservers();

        System.out.println("1");
        storeInventory1.printPrices();
        System.out.println("2");
        storeInventory2.printPrices();
        System.out.println("3");
        storeInventory3.printPrices();

        priceManager.changeItemPrice("Folding Chair", 14.49);
        priceManager.notifyObservers();

        System.out.println("\n\n1");
        storeInventory1.printPrices();
        System.out.println("2");
        storeInventory2.printPrices();
        System.out.println("3");
        storeInventory3.printPrices();


    }
}