package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void currentChanelInTheRange(){
        radio.setCurrentChanel(4);
        assertEquals(4,radio.getCurrentChanel());

    }
    @Test
    public void currentChanelMoreRange(){
        radio.setCurrentChanel(11);
        assertEquals(0,radio.getCurrentChanel());

    }
    @Test
    public void currentChanelLessRange(){
        radio.setCurrentChanel(-1);
        assertEquals(9,radio.getCurrentChanel());

    }
    @Test
    public void currentChanelEqualMax(){
        radio.setCurrentChanel(9);
        assertEquals(9,radio.getCurrentChanel());

    }

    @Test
    public void currentChanelEqualMin(){
        radio.setCurrentChanel(0);
        assertEquals(0,radio.getCurrentChanel());

    }
    @Test
    public void currentSoundlInTheRange(){
        radio.setCurrentSound(5);
        assertEquals(5,radio.getCurrentSound());

    }
    @Test
    public void currentSoundMoreRange(){
        radio.setCurrentSound(12);
        assertEquals(10,radio.getCurrentSound());

    }
    @Test
    public void currentSoundLessRange(){
        radio.setCurrentSound(-1);
        assertEquals(0,radio.getCurrentSound());

    }
    @Test
    public void currentSoundlEqualMax(){
        radio.setCurrentSound(10);
        assertEquals(10,radio.getCurrentSound());

    }

    @Test
    public void currentSoundEqualMin(){
        radio.setCurrentSound(0);
        assertEquals(0,radio.getCurrentSound());

    }


}