package com.javarush.task.pro.task13.task1334;

import java.util.*;

public class Voter {
    private static final String[] PERSONAL_QUALITIES = {"Good", "Bad", "Evil", "Holy"};
    private static final List<Voter> VOTER_LIST = new ArrayList<>();
    private final String personalQuality;
    private final int voterID;

    public Voter(int voterID, String personalQuality) {
        this.voterID = voterID;
        this.personalQuality = personalQuality;
    }

    public static List<Voter> generateVoters() {
        for (int i = 1; i <= 100; i++) {
            int num = (int) (Math.random() * 4);
            VOTER_LIST.add(new Voter(i, PERSONAL_QUALITIES[num]));
        }
        return VOTER_LIST;
    }

    public String getPersonalQuality() {
        return personalQuality;
    }

    @Override
    public String toString() {
        return "VoterID=" + voterID + ", personalQuality=\"" + personalQuality + "\"";
    }
}