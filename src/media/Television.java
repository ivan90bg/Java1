package media;

public class Television {

    private int volume;
    private int currentProgram;
    private boolean turnOn;

    public Television() {
        this.volume = 0;
        this.currentProgram = 1;
        this.turnOn = true;
    }

    public int getVolume() {
        return volume;
    }

    public int getCurrentProgram() {
        return currentProgram;
    }

    public boolean getTurnOn() {
        return turnOn;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

}
