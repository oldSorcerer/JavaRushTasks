package com.javarush.task.pro.task13.task1334;

import java.util.Map;
import java.util.TreeMap;

public class Rewards {
    private final Map<String, String> goodRewardsMap = new TreeMap<>();
    private final Map<String, String> holyRewardsMap = new TreeMap<>();

    public Rewards() {
        initMaps();
    }

    private void initMaps() {
        goodRewardsMap.put("Good reward 1", "Library card");
        goodRewardsMap.put("Good reward 2", "Free bus pass");
        goodRewardsMap.put("Good reward 3", "Fast lane during voting");
        holyRewardsMap.put("Holy reward 1", "Milk and cookies for life");
        holyRewardsMap.put("Holy reward 2", "Metro pass for life");
        holyRewardsMap.put("Holy reward 3", "Tea with The Pope");
    }

    public Map<String, String> getGoodRewardsMap() {
        return goodRewardsMap;
    }

    public Map<String, String> getHolyRewardsMap() {
        return holyRewardsMap;
    }
}
