package media;

public class Television {

    private int volume;
    private int currentProgram;
    private boolean turnOn;

    public Television() {
        this.volume = 0;
        this.currentProgram = 1;
        this.turnOn = false;
    }

    public Television(int volume, int currentProgram, boolean turnOn) {
        this.volume = volume;
        this.currentProgram = currentProgram;
        this.turnOn = turnOn;
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

    public void info() {
        System.out.println("Trenutni volume je: " + getVolume());
        System.out.println("Trenutni kanal je: " + getCurrentProgram());
        System.out.println("Televizor je upaljen: " + getTurnOn());
        System.out.println("");
    }
}
