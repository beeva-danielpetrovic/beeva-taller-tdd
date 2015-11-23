package com.beeva.kata1;

/**
 * Created by daniel on 12/11/15.
 */
public class StringCalculator {

    private Integer sum = 0;

    public void sum(String value) throws NegativeException {

        if (value.indexOf("]") != -1 && value.substring(value.indexOf("]") + 1, value.length()).contains("-")) {
            throw new NegativeException();
        }

        if (value.isEmpty()) {
            this.sum = 0;
        } else if (value.indexOf("[") != -1) {

            String delimiter = "" + value.charAt(1);
            this.sum = iterateSum(value.substring(value.indexOf("]") + 1, value.length()).split(delimiter));

        } else if (value.indexOf(",") == -1) {
            this.sum = Integer.parseInt(value);
        } else {
            this.sum = iterateSum(value.split(","));
        }

    }

    private Integer iterateSum(String[] values) {

        Integer result = 0;
        for (int i = 0; i < values.length; i++) {
            result += Integer.parseInt(values[i]);
        }
        return result;
    }

    public Integer getSum() {
        return sum;
    }
}
