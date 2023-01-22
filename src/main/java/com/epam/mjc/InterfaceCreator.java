package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return arg -> {
            List<Integer> divided = new ArrayList<>();
            arg.forEach(elem -> divided.add(elem / divider));
            return divided;
        };
    }
}
