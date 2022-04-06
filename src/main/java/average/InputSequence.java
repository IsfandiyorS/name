package average;

import java.util.Arrays;

public class InputSequence {
    private int[] array;
    private String sequence;

    public InputSequence(String sequence) {
        this.sequence = this.checkSequence(sequence);
        this.array = createArray(this.sequence);
    }

    private String checkSequence(String sequence) {
        if (sequence != null && !sequence.isBlank() && sequence.length() <= 100 && sequence.endsWith(" 0")) {
            return sequence;
        } else throw new RuntimeException("The sequence is not correct!");
    }

    private int[] createArray(String sequence) {
        String[] string = sequence.split(" ");
        return Arrays.stream(string).mapToInt(Integer::parseInt).toArray();
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
