package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();

        // priprava zofky na kresleni
        zofka.setLocation(100, 200);
        zofka.setPenWidth(5);

        //ctverec
        //nakresliCtverec(zofka, 50.0, Color.orange);

        // nova zelva tyna
        Turtle tyna;
        tyna = new Turtle();
        tyna.setLocation(550, 200);
        tyna.setPenWidth(5);

        //obdelnik
        //nakresliObdelnik(tyna, 50.0, 75.0, Color.pink);

        //zofka jde kreslit trojuhelnik
        //zofka.setLocation(100, 300);

        //rovnostranny trojuhelnik
        //nakresliRovnostrannyTrojuhelnik(zofka, 80.0, Color.gray);

        //priprava tyny na kresleni kolecka
        //tyna.setLocation(450, 200);

        //kolecko
        //nakresliKolecko(tyna, 20.0, Color.MAGENTA);

        //zmrzlina



    }

    private void nakresliKolecko(Turtle turtle, double polomer, Color barva) {
        turtle.setPenColor(barva);
        for (int l = 0; l < 36; l++) {
            turtle.move((2*3.14159*polomer)/36);
            turtle.turnRight(10);
        }
    }

    private void nakresliRovnostrannyTrojuhelnik(Turtle turtle, double delkaStrany, Color barva) {
        turtle.setPenColor(barva);
        for (int k = 0; k < 3; k++) {
            turtle.move(delkaStrany);
            turtle.turnRight(120);
        }
    }

    private void nakresliObdelnik(Turtle turtle, double prvniStrana, double druhaStrana, Color barva) {
        turtle.setPenColor(barva);
        for (int j = 0; j < 2; j++) {
            turtle.move(prvniStrana);
            turtle.turnRight(90);
            turtle.move(druhaStrana);
            turtle.turnRight(90);
        }
    }

    private void nakresliCtverec(Turtle turtle, double delkaStrany, Color barva) {
        turtle.setPenColor(barva);
        for (int i = 0; i < 4; i++) {
            turtle.move(delkaStrany);
            turtle.turnRight(90);
        }
    }

}
