package app;

public class DataSet {
    synchronized void printData(String[] products) {
        int cnt = 1;
        for (String product : products) {
            System.out.println(cnt + ") " + product);
            cnt++;

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Exception " + e);
            }
        }
    }
}
