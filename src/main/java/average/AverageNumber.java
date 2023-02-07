package average;

public class AverageNumber {

    public int average(int[] array) {

        // TODO: 07/02/23 testing file 
        int sum=0;

        for (int j : array) {
            sum += j;
        }

        return (int) Math.round(sum*1./array.length);
    }

}
