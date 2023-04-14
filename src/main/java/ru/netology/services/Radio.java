package ru.netology.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Radio {

    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;



    //
//    public Radio() {
//        this.maxStation = 9;
//    }
//
//    public Radio(int maxStation) {
//        this.maxStation = maxStation;
//    }
//
    public void nextStation() {
        if (currentStation >= maxStation) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation <= 0) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }
//
//    public int getCurrentStation() {
//        return currentStation;
//    }
//
//    public void setCurrentStation(int currentStation) {
//        if (currentStation < 0) {
//            return;
//        }
//        if (currentStation > maxStation) {
//            return;
//        }
//        this.currentStation = currentStation;
//    }
//
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
//
//    public int getCurrentVolume() {
//        return currentVolume;
//    }
//
//    public void setCurrentVolume(int currentVolume) {
//        if (currentVolume < 0) {
//            currentVolume = 0;
//        }
//        if (currentVolume > 100) {
//            currentVolume = 100;
//        }
//        this.currentVolume = currentVolume;
//    }
}