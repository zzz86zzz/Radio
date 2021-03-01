package ru.netology.radio;

public class Radio {
    private int currentChanel;
    private int maxChanel = 9;
    private int minChanel = 0;
    private int currentSound;
    private int maxSound = 10;
    private int minSound = 0;

    public int getCurrentChanel() {
        return currentChanel;
    }


    public void setCurrentChanel(int currentChanel) {
        if (currentChanel >= minChanel) {
            this.currentChanel = currentChanel;
        }
        if (currentChanel <= maxChanel) {
            this.currentChanel = currentChanel;
        }
        if (currentChanel > maxChanel) {
            this.currentChanel = minChanel;
        }
        if (currentChanel < minChanel) {
            this.currentChanel = maxChanel;
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

    public void nextSound() {
        if (currentSound < maxSound) {
            currentSound++;
        } else {
            currentSound = maxSound;
        }
    }

    public void prevSound() {
        if (currentSound > minSound) {
            currentSound--;
        }
    }


    public void prevChanel() {
        if (currentChanel > minChanel) {
            currentChanel--;
        } else {
            currentChanel = maxChanel;
        }
    }

    public void nextChanel() {
        if (currentChanel < maxChanel) {
            currentChanel++;
        } else {
            currentChanel = minChanel;
        }
    }
}

