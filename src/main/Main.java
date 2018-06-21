package main;

import media.Radio;
import media.Television;

public class Main {

    public static void main(String[] args) {

        Television televizija = new Television();
        televizija.setCurrentProgram(5);
        televizija.setVolume(19);
        televizija.setTurnOn(true);
        televizija.info();

        televizija.setCurrentProgram(8);
        televizija.setVolume(30);
        televizija.setTurnOn(true);
        televizija.info();

        Radio myRadio = new Radio(100.3, 700, 'A');
        myRadio.setFmFrequency(91.8);
        myRadio.setAmFrequency(55);
        myRadio.setBand('F');
        myRadio.info();
        
    }
}
