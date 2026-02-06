package Generic_Classes;

public class NumericBox <T extends Number & Comparable<T>> {
    private T numericValue;

    public NumericBox (T numericValue) {
        this.numericValue = numericValue;
    }

    public int isGreaterThanOther (T other) {
        return this.numericValue.compareTo(other);
    }

    public double getNumericValue() {
        return this.numericValue.doubleValue();
    }

    public void setNumericValue(T numericValue) {
        this.numericValue = numericValue;
    }

    @Override
    public String toString() {
        return "Value: " + numericValue.toString();
    }


    public static void main(String[] args) {
        NumericBox<Double> doubleNumericBox = new NumericBox<>(55.123d);
        NumericBox<Integer> integerNumericBox = new NumericBox<>(44);

        doubleNumericBox.setNumericValue(33.214d);
        integerNumericBox.setNumericValue(44);

        System.out.println("Value: " + doubleNumericBox.getNumericValue());
        System.out.println("Value: " + integerNumericBox.getNumericValue());

        int result = integerNumericBox.isGreaterThanOther(50);
        System.out.println("Comparison result: " + result);

    }
}
