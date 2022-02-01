package ru.netology.radio;

public class Radio {

    public int radioStationNumber;
    public int setRadio;

    private int radioStationСurrentNumber;
    private int minRadioStationСurrentNumber = 0;
    private int maxRadioStationСurrentNumber = 9;
    private int soundVolume;
    private int minVolume = 0;
    private int maxVolume = 10;


    public int getRadioStationСurrentNumber() {
        return radioStationСurrentNumber;
    }


    public void setRadioStationСurrentNumber(int radioStationСurrentNumber) {
        if (radioStationСurrentNumber < minRadioStationСurrentNumber) {
            return;
        }
        if (radioStationСurrentNumber > maxRadioStationСurrentNumber) {
            return;
        }
        this.radioStationСurrentNumber = radioStationСurrentNumber;

    }

    public void increaseNumber() {
        if (radioStationСurrentNumber == maxRadioStationСurrentNumber) {
            this.radioStationСurrentNumber = minRadioStationСurrentNumber;
            return;
        }
        radioStationСurrentNumber++;
    }

    public void minusNumber() {
        if (radioStationСurrentNumber == minRadioStationСurrentNumber) {
            this.radioStationСurrentNumber = maxRadioStationСurrentNumber;
            return;
        }
        radioStationСurrentNumber--;
    }

    public int getVolume() {
        return soundVolume;
    }


    public void setVolume(int soundVolume) {
        if (soundVolume < minVolume) {
            return;
        }
        if (soundVolume > maxVolume) {
            return;
        }
        this.soundVolume = soundVolume;

    }

    public void maximumSoundVolume() {
        if (soundVolume == maxVolume) {
            this.soundVolume = maxVolume;
            return;
        }
        soundVolume++;
    }

    public void minimumSoundVolume() {
        if (soundVolume == minVolume) {
            this.soundVolume = minVolume;
            return;
        }
        soundVolume--;
    }
}
