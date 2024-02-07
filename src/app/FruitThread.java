package app;

public class FruitThread extends Thread {

    DataSet dataSet;

    String[] fruits = {"Bananas", "Oranges", "Apples", "Plums"};

    FruitThread(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    public void run() {
        try {
            FruitThread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread got interrupted");
        }
        dataSet.printData(fruits);
    }
}
