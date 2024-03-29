package com.example.muhammadafiffauzi.abma.Model;

import com.example.muhammadafiffauzi.abma.SelectLesson.SelectLesson1Activity;

import java.util.ArrayList;
import java.util.Map;

public class Question1Model {
    private String idQuest1;
    private String quest1Score;
    private String date;
    private String scoreAlfabet;

    public Question1Model() {

    }

    public Question1Model(String idQuest1, String quest1Score, String date, String scoreAlfabet) {
        this.idQuest1 = idQuest1;
        this.quest1Score = quest1Score;
        this.date = date;
        this.scoreAlfabet = scoreAlfabet;
    }

    public String getIdQuest1() {
        return idQuest1;
    }

    public void setIdQuest1(String idQuest1) {
        this.idQuest1 = idQuest1;
    }

    public String getQuest1Score() {
        return quest1Score;
    }

    public void setQuest1Score(String quest1Score) {
        this.quest1Score = quest1Score;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getScoreAlfabet() {
        return scoreAlfabet;
    }

    public void setScoreAlfabet(String scoreAlfabet) {
        this.scoreAlfabet = scoreAlfabet;
    }
}


