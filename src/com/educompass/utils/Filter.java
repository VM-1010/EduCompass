package com.educompass.utils;

import java.util.*;

import com.educompass.model.*;


public class Filter {
    public static List<Resource> byType(List<Resource> list, ResType match) {
        List<Resource> result = new ArrayList<>();
        for (Resource r : list) {
            if (r.getType() == match) {
                result.add(r);
            }
        }
        return result;
    }
}
