package com.huaxincem.capweixinmall.util;

import java.util.ArrayList;
import java.util.List;

public class RemoveUntil {
    public static List<String> removeDuplicates(String input) {
        StringBuilder result = new StringBuilder(input);
        List<String> output = new ArrayList<>();
        output.add(input);

        boolean found = true;
        while (found) {
            found = false;
            int length = result.length();
            int i = 0;
            while (i < length - 2) {
                char current = result.charAt(i);
                int count = 1;
                int j = i + 1;
                while (j < length && result.charAt(j) == current) {
                    count++;
                    j++;
                }
                if (count >= 3) {
                    result.delete(i, j);
                    found = true;
                    output.add(result.toString());
                    length = result.length();
                } else {
                    i = j;
                }
            }
        }
        return output;
    }

    public static List<String> replaceDuplicates(String input) {
        List<String> output = new ArrayList<>();
        output.add(input);

        boolean found = true;
        while (found) {
            found = false;
            StringBuilder result = new StringBuilder(output.get(output.size() - 1));
            int length = result.length();
            int i = 0;
            while (i < length - 2) {
                char current = result.charAt(i);
                int count = 1;
                int j = i + 1;
                while (j < length && result.charAt(j) == current) {
                    count++;
                    j++;
                }
                if (count >= 3) {
                    char replacement = (char) (current - 1);
                    result.setCharAt(i, replacement);
                    result.delete(i + 1, j);
                    found = true;
                    output.add(result.toString().replace("`",""));
                    length = result.length();
                } else {
                    i = j;
                }
            }
        }
        return output;
    }
}
