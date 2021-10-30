package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldUseConstructor() {
        Radio radio = new Radio(15);
        int actual = radio.getCountRadioBox();
        int expected = 15;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldUseConstructorForChangeRadBoxFrom20To15() {
        Radio radio = new Radio(20);
        radio.setCurrentRadBox(15);
        int actual = radio.getCurrentRadBox();
        int expected = 15;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"'CurrentRadBox equal nine ', 9, 9",
            "'CurrentRadBox more than nine', 10, 4",
            "'CurrentRadBox between zero and nine', 4, 4",
            "'CurrentRadBox equal zero', 0, 0",
            "'CurrentRadBox less than zero', -1, 4"
    })
    void currentRadio(String testName, int setCurrentRadBox, int expected) {
        Radio rad = new Radio();
        rad.setCurrentRadBox(setCurrentRadBox);

        int actual = rad.getCurrentRadBox();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'CurrentRadBox equal nine', 9, 0",
            "'CurrentRadBox between zero and nine', 3, 4",
            "'CurrentRadBox  equal zero', 0, 1"
    })
    void nextRadStat(String testName, int setCurrentRadBox, int expected) {
        Radio rad = new Radio();
        rad.setCurrentRadBox(setCurrentRadBox);
        rad.nextRadStat();

        int actual = rad.getCurrentRadBox();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'CurrentRadBox equal nine', 9, 8",
            "'CurrentRadBox between zero and nine', 6, 5",
            "'CurrentRadBox  equal zero', 0, 9"
    })
    void prevRadStat(String testName, int setCurrentRadBox, int expected) {
        Radio rad = new Radio();
        rad.setCurrentRadBox(setCurrentRadBox);
        rad.prevRadStat();

        int actual = rad.getCurrentRadBox();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'CurrentRadVolume equal hundred ', 100, 100",
            "'CurrentRadVolume more than hundred', 101, 100",
            "'CurrentRadVolume between zero and hundred', 60, 60",
            "'CurrentRadVolume equal zero', 0, 0",
            "'CurrentRadVolume less than zero', -1, 0"
    })
    void radVolume(String testName, int setCurrentRadVolume, int expected) {
        Radio rad = new Radio();
        rad.setCurrentRadVolume(setCurrentRadVolume);

        int actual = rad.getCurrentRadVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'CurrentRadVolume equal hundred ', 100, 100",
            "'CurrentRadVolume more than hundred', 101, 100",
            "'CurrentRadVolume between zero and hundred', 55, 56",
            "'CurrentRadVolume equal zero', 0, 1"
    })
    void plusVolume(String testName, int currentRadVolume, int expected) {
        Radio rad = new Radio();
        rad.setCurrentRadVolume(currentRadVolume);
        rad.plusVolume();

        int actual = rad.getCurrentRadVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'CurrentRadVolume equal hundred ', 100, 99",
            "'CurrentRadVolume between zero and hundred', 50, 49",
            "'CurrentRadVolume equal zero', 0, 0",
            "'CurrentRadVolume less than zero', -1, 0"
    })
    void minusVolume(String testName, int setCurrentRadVolume, int expected) {
        Radio rad = new Radio();
        rad.setCurrentRadVolume(setCurrentRadVolume);
        rad.minusRadVolume();

        int actual = rad.getCurrentRadVolume();

        assertEquals(expected, actual);
    }


}