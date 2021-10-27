package ru.netology.domain;

public class Radio {

    private int currentRadBox;
    private int currentRadVolume;

    public int getCurrentRadBox() {
        return currentRadBox;
    }

    public void setCurrentRadBox(int currentRadBox) {
        if (currentRadBox > 9) {
            return;
        }
        if (currentRadBox < 0) {
            return;
        }
        this.currentRadBox = currentRadBox;
    }

    public void nextRadStat() {

        if (currentRadBox == 9) {
            currentRadBox = 0;
        } else {
            currentRadBox = currentRadBox + 1;
        }

    }

    public void prevRadStat() {
        if (currentRadBox == 0) {
            currentRadBox = 9;
        } else {
            currentRadBox = currentRadBox - 1;
        }
    }


    public int getCurrentRadVolume() {
        return currentRadVolume;
    }

    public void setCurrentRadVolume(int currentRadVolume) {
        if (currentRadVolume > 10) {
            currentRadVolume = 10;
        }
        if (currentRadVolume < 0) {
            currentRadVolume = 0;
        }
        this.currentRadVolume = currentRadVolume;

    }

    public void plusVolume() {
        if (currentRadVolume >= 10) {
            currentRadVolume = 10;
        } else {
            currentRadVolume = currentRadVolume + 1;
        }
    }

    public void minusRadVolume() {
        if (currentRadVolume <= 0) {
            currentRadVolume = 0;
        } else {
            currentRadVolume = currentRadVolume - 1;
        }

    }

}
