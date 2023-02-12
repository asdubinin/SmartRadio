package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/stationNext")
    public void shouldRadioNextStation(int i, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(i);

        radio.nextStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/stationPrev")
    public void shouldRadioPrevStation(int i, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(i);

        radio.prevStation();


        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/volumeIncrease")

    public void shouldRadioIncreaseVolume(int i, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(i);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/volumeDecrease")

    public void shouldRadioDecreaseVolume(int i, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(i);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
