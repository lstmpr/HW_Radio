package ru.netology.domain;

public class Radio {

    private int countRadioBox = 10;
    private int maxRadBox = calculateMaxRadBox();
    private int minRadBox = 0;
    private int currentRadBox = calculateCurrentRadBox();
    private int maxRadVol = 100;
    private int minRadVol = 0;
    private int currentRadVolume = calculateCurrentRadVolume();

    public Radio(int countRadioBox) {
        this.countRadioBox = countRadioBox;
        this.maxRadBox = calculateMaxRadBox();
        this.currentRadBox = calculateCurrentRadBox();
    }


    public Radio() {
        calculateMaxRadBox();
    }


    public int calculateMaxRadBox() {
        return (countRadioBox - 1);
    }

    public int calculateCurrentRadBox() {
        return ((maxRadBox + minRadBox) / 2);
    }

    public int calculateCurrentRadVolume() {
        return ((maxRadVol + minRadVol) / 2);
    }

    public int getCountRadioBox() {
        return countRadioBox;
    }

    public int getCurrentRadBox() {
        return currentRadBox;
    }

    public void setCurrentRadBox(int currentRadBox) {
        if (currentRadBox > maxRadBox) {
            return;
        }
        if (currentRadBox < minRadBox) {
            return;
        }
        this.currentRadBox = currentRadBox;
    }

    public void nextRadStat() {

        if (currentRadBox == maxRadBox) {
            currentRadBox = minRadBox;
        } else {
            currentRadBox = currentRadBox + 1;
        }

    }

    public void prevRadStat() {
        if (currentRadBox == minRadBox) {
            currentRadBox = maxRadBox;
        } else {
            currentRadBox = currentRadBox - 1;
        }
    }


    public int getCurrentRadVolume() {
        return currentRadVolume;
    }

    public void setCurrentRadVolume(int currentRadVolume) {
        if (currentRadVolume > maxRadVol) {
            currentRadVolume = maxRadVol;
        }
        if (currentRadVolume < minRadVol) {
            currentRadVolume = minRadVol;
        }
        this.currentRadVolume = currentRadVolume;

    }

    public void plusVolume() {
        if (currentRadVolume >= maxRadVol) {
            currentRadVolume = maxRadVol;
        } else {
            currentRadVolume = currentRadVolume + 1;
        }
    }

    public void minusRadVolume() {
        if (currentRadVolume <= minRadVol) {
            currentRadVolume = minRadVol;
        } else {
            currentRadVolume = currentRadVolume - 1;
        }

    }


}
