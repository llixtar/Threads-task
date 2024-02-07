package app;

public class App {
    public static void main(String[] args) {
        DataSet dataSet = new DataSet();
        FruitThread fruitThread = new FruitThread(dataSet);
        VegetablesThread vegetablesThread = new VegetablesThread(dataSet);

        fruitThread.start();
        fruitThread.interrupt();

        vegetablesThread.start();
    }
}

