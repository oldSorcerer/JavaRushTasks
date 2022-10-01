package com.javarush.task.pro.task13.task1334;

/* 
Антипирамида
*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    static Map<Voter, Map<String, String>> corporatePyramid = new HashMap<>();

    public static void main(String[] args) {
        setRewards();
        printMap(corporatePyramid);
    }

    public static void setRewards() {
        List<Voter> voters = Voter.generateVoters();
        for (int i = 0; i < voters.size(); i++) {
            Voter voter = voters.get(i);
            String personalQuality = voter.getPersonalQuality();
            if (personalQuality.equals("Good")){
                corporatePyramid.put(voter, new Rewards().getGoodRewardsMap());
            } else if (personalQuality.equals("Holy")) {
                corporatePyramid.put(voter, new Rewards().getHolyRewardsMap());
            }
        }
    }

    public static void printMap(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}