package com.mfilipelino.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class LambdaComparator {
    public static void main(String[] args) {
        Comparator<String> stringComparator = (first, second) -> first.length() - second.length();

    }
}
