package media;

public class Radio {

    private double fmFrequency;
    private int amFrequency;
    private char band;

    public Radio() {
        this.amFrequency = 600;
        this.fmFrequency = 91.6;
        this.band = 'F';

    }

    public Radio(double fmFrequency, int amFrequency, char band) {
        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
        this.band = band;
    }
    

    public double getFmFreguency() {
        return fmFrequency;
    }

    public int getAmFrequency() {
        return amFrequency;
    }

    public char getBand() {
        return band;
    }

    public void setFmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;
    }

    public void setAmFrequency(int amFrequency) {
        this.amFrequency = amFrequency;
    }

    public void setBand(char band) {
        this.band = band;
    }
    public void info() {
        System.out.println("FM Frequency is: " + getAmFrequency());
        System.out.println("AM Frequency is: " + getFmFreguency());
        System.out.println("Band is: " + getBand());
        System.out.println("");
    }

}
