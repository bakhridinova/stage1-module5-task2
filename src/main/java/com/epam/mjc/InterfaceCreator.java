package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return arg -> arg.stream().map(elem -> elem / divider).collect(Collectors.toList());
    }
}
