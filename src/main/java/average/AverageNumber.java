package average;

public class AverageNumber {

    public int average(int[] array) {

        int sum=0;

        for (int j : array) {
            sum += j;
        }

        return (int) Math.round(sum*1./array.length);
    }

}
