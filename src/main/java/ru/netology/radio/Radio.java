package ru.netology.radio;

public class Radio {
    private int currentChanel;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentSound;
    private int maxSound = 10;
    private int minSound = 0;

    public int getCurrentChanel() {

        if (currentChanel > minChannel && currentChanel < maxChannel || currentChanel == maxChannel || currentChanel == minChannel) {
            return currentChanel;
        }
        return currentChanel;
    }


    public void setCurrentChanel(int currentChanel) {
        if (currentChanel >= minChannel) {
            this.currentChanel = currentChanel;
        }
        if (currentChanel <= maxChannel) {
            this.currentChanel = currentChanel;
        }
        if (currentChanel > maxChannel) {
            this.currentChanel = minChannel;
        }
        if (currentChanel < minChannel) {
            this.currentChanel = maxChannel;
        }
    }

    public int getCurrentSound() {
        if (currentSound < maxSound && currentSound > minSound) {
            return currentSound;
        }

        if (currentSound == maxSound) {
            return maxSound;
        }
        if (currentSound == minSound) {
            return minSound;
        }
        return currentSound;
    }


    public void setCurrentSound(int currentSound) {
        if (currentSound < maxSound) {
            this.currentSound = currentSound;
        }
        if (currentSound > minSound) {
            this.currentSound = currentSound;
        }
        if (currentSound >= maxSound) {
            this.currentSound = maxSound;
        }
        if (currentSound <= minSound) {
            this.currentSound = minSound;
        }
    }
}
