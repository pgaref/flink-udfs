package org.example;

import org.apache.flink.table.functions.ScalarFunction;

public class SumScalarFunction extends ScalarFunction {

    public int eval(int a, int b) {
        return a + b;
    }
}
