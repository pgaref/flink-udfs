package org.example;

import org.apache.flink.table.functions.ScalarFunction;

public class ConcatScalarFunction extends ScalarFunction {

    public String eval(String a, String b) {
        return a + b;
    }
}
