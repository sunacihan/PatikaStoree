package com.company;

import java.util.Comparator;

public class ComparatorNoteBookName implements Comparator<NoteBook> {
    @Override
    public int compare(NoteBook o1, NoteBook o2) {
        return o1.getProductName().compareTo(o2.getProductName());
    }

}
