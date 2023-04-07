package com.company;

import java.util.Comparator;

public class ComparatorMobilPhoneName implements Comparator<MobilPhone> {
    @Override
    public int compare(MobilPhone o1, MobilPhone o2) {
        return o1.getProductName().compareTo(o2.getProductName());
    }
}
