package app;

public class VegetablesThread extends Thread {

    DataSet dataSet;
    String[] vegetables = {"Potatoes", "Cucumbers", "Tomatoes", "Cabbage"};

    VegetablesThread(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    public void run() {
        dataSet.printData(vegetables);
    }
}
