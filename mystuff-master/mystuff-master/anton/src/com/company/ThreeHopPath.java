package com.company;

import java.util.*;

public class ThreeHopPath {

    public void solve(String[] input) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        HashMap<List<String>, Integer> urlMap = new HashMap<>();

        for (String str : input) {
            String[] tokens = str.split(" ");
            if(!map.containsKey(tokens[0])){
                ArrayList<String> list = new ArrayList<String>();
                list.add(tokens[1]);
                map.put(tokens[0],list);
            }
            else {
                ArrayList<String> list = map.get(tokens[0]);
                list.add(tokens[1]);
                if(list.size()==3) {
                    Integer count = urlMap.get(list);
                    if (count == null) {
                        count = 0;
                    }
                    urlMap.put(list, count + 1);
                }
                ArrayList<String> subsequence = new ArrayList(list.subList(list.size()-2, list.size()));
                map.put(tokens[0],subsequence);
            }
        }

        Map.Entry<List<String>, Integer> maxEntry = null;
        String maxKey = null;

        for (Map.Entry<List<String>, Integer> entry : urlMap.entrySet()) {

            if (maxEntry == null
                    || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
                maxKey = entry.getKey().toString();
            }
        }

        System.out.println(maxEntry.toString());
        System.out.println(maxKey);
    }

    public static void main(String[] args) {
        // Given sample data. However it does not have a popular three page sequence.
        String[] input = {"a-3b7622e /home",
                "b-128a9d7 /home",
                "a-3b7622e /deals/spa",
                "b-128a9d7 /deals/car_wash",
                "c-7f8e61a /deals/seattle",
                "b-128a9d7 /home",
                "d-d682a11 /deals/car_wash",
                "a-3b7622e /buy",
                "b-128a9d7 /deals/spa",
                "c-7f8e61a /deals/coffee",
                "b-128a9d7 /buy",
                "c-7f8e61a /buy"};

        ThreeHopPath s = new ThreeHopPath();
        s.solve(input);
    }
}


