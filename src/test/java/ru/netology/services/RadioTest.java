package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void nextFromMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(radio.getMinStation());
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextFromMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(radio.getMaxStation());
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevFromMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(radio.getMinStation());
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevFromMinStation() {
        Radio radio = new Radio(9, 0, 9, 100, 0, 0);

        radio.setCurrentStation(radio.getMinStation());
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevFromMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(radio.getMaxStation());
        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationNegative() {
        Radio radio = new Radio();

//        radio.setCurrentStation(-1);
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevMinStationNegative() {
        Radio radio = new Radio();

//        radio.setCurrentStation(-1);
//        radio.prevStation();
//
//        int expected = 9;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio(9, 0, 8, 100, 0, 0);

        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationStationMax() {
        Radio radio = new Radio(9, 0, 10, 100, 0, 0);

//        radio.setCurrentStation(10);
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMoreMaxStation() {
        Radio radio = new Radio();

//        radio.setCurrentStation(10);
//        radio.nextStation();
//        int expected = 1;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMaxStation() {
        Radio radio = new Radio(9, 0, 9, 100, 0, 0);

        radio.setCurrentStation(radio.getMaxStation());
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeFromZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMinVolume());
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeToMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeOverMax() {
        Radio radio = new Radio();

//        radio.setCurrentVolume(101);
//        radio.increaseVolume();
//        int expected = 100;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeToMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeOverMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeOverMinNegative() {
        Radio radio = new Radio();

//        radio.setCurrentVolume(-1);
//        radio.decreaseVolume();
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
    }
}