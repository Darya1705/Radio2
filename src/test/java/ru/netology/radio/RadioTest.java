package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void number1() {
        Radio service = new Radio();
        service.setRadioStationСurrentNumber(50);
        int expected = 0;
        int actual = service.getRadioStationСurrentNumber();
        assertEquals(expected, actual);
    }


    @Test
    public void number() {
        Radio service = new Radio();
        service.setRadioStationСurrentNumber(50);
        int expected = 0;
        int actual = service.getRadioStationСurrentNumber();
        assertEquals(expected, actual);

    }


    @Test
    public void nextNumber() {
        Radio service = new Radio();
        service.setRadioStationСurrentNumber(7);
        service.increaseNumber();
        assertEquals(8, service.getRadioStationСurrentNumber());
    }

    @Test
    public void prevNumber() {
        Radio service = new Radio();
        service.setRadioStationСurrentNumber(0);
        service.minusNumber();
        assertEquals(9, service.getRadioStationСurrentNumber());
    }

    @Test
    public void volumeLevel() {
        Radio service = new Radio();
        service.setVolume(50);
        int expected = 0;
        int actual = service.getVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void maximumVolume() {
        Radio service = new Radio();
        service.setVolume(10);
        service.maximumSoundVolume();
        assertEquals(10, service.getVolume());
    }

    @Test
    public void minimumVolume() {
        Radio service = new Radio();
        service.setVolume(0);
        service.minimumSoundVolume();
        assertEquals(0, service.getVolume());
    }

}

