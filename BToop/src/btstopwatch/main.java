package btstopwatch;

public class main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int arr[] = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000 + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length  ; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapseTime());

    }
}
