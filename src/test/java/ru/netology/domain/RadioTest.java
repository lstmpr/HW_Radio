package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource(value = {"'CurrentRadBox equal nine ', 9, 9",
            "'CurrentRadBox more than nine', 10, 0",
            "'CurrentRadBox between zero and nine', 4, 4",
            "'CurrentRadBox equal zero', 0, 0",
            "'CurrentRadBox less than zero', -1, 0"
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
    @CsvSource(value = {"'CurrentRadVolume equal ten ', 10, 10",
            "'CurrentRadVolume more than ten', 11, 10",
            "'CurrentRadVolume between zero and ten', 4, 4",
            "'CurrentRadVolume equal zero', 0, 0",
            "'CurrentRadVolume less than zero', -1, 0"
    })
    void radVolume(String testName, int setCurrentRadBox, int expected) {
        Radio rad = new Radio();
        rad.setCurrentRadVolume(setCurrentRadBox);

        int actual = rad.getCurrentRadVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'CurrentRadVolume equal ten ', 10, 10",
            "'CurrentRadVolume more than ten', 11, 10",
            "'CurrentRadVolume between zero and ten', 7, 8",
            "'CurrentRadVolume equal zero', 0, 1"
    })
    void plusVolume(String testName, int setCurrentRadBox, int expected) {
        Radio rad = new Radio();
        rad.setCurrentRadVolume(setCurrentRadBox);
        rad.plusVolume();

        int actual = rad.getCurrentRadVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'CurrentRadVolume equal ten ', 10, 9",
            "'CurrentRadVolume between zero and ten', 5, 4",
            "'CurrentRadVolume equal zero', 0, 0",
            "'CurrentRadVolume less than zero', -1, 0"
    })
    void minusVolume(String testName, int setCurrentRadBox, int expected) {
        Radio rad = new Radio();
        rad.setCurrentRadVolume(setCurrentRadBox);
        rad.minusRadVolume();

        int actual = rad.getCurrentRadVolume();

        assertEquals(expected, actual);
    }
}