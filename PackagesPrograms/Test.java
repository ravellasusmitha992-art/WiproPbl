package Interfaces.live;

import Interfaces.music.Playable;
import Interfaces.music.string.Veena;
import Interfaces.music.wind.Sexophone;

public class Test {

    public static void main(String[] args) {

        Veena v = new Veena();
        v.play();

        Sexophone s = new Sexophone();
        s.play();

        Playable p;

        p = new Veena();
        p.play();

        p = new Sexophone();
        p.play();
    }
}