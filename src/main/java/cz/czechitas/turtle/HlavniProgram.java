package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

import static java.lang.Math.sqrt;

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
        nakresliZmrzlinu(zofka);

        //snehulak
        nakresliSnehulaka(tyna);

        //priprava na masinku
        zofka.setLocation(825.0, 300);
        zofka.turnLeft(90);

        //masinka
        nakresliMasinku(zofka);

    }

    private void nakresliMasinku(Turtle turtle) {
        nakresliPravouhlyTrojuhelnik(turtle, 50.0, Color.BLUE);
        turtle.setLocation(1000.0, 275);
        nakresliObdelnik(turtle, 125.0, 75.0, Color.BLUE);
        turtle.setLocation(915.0, 320);
        nakresliKolecko(turtle, 20, Color.BLUE);
        turtle.setLocation(960.0, 320);
        nakresliKolecko(turtle, 20, Color.BLUE);
        turtle.setLocation(1080.0, 275);
        nakresliObdelnik(turtle, 80.0, 120.0, Color.BLUE);
        turtle.setLocation(1045.0, 315);
        nakresliKolecko(turtle, 40.0, Color.BLUE);
    }

    private void nakresliSnehulaka(Turtle turtle) {
        nakresliKolecko(turtle, 50.0, Color.BLACK);
        turtle.setLocation(525.0, 325.0);
        nakresliKolecko(turtle, 75.0, Color.BLACK);
        turtle.setLocation(500.0, 500.0);
        nakresliKolecko(turtle, 100.0, Color.BLACK);
        turtle.setLocation(475.0, 325.0);
        nakresliKolecko(turtle, 25.0, Color.BLACK);
        turtle.setLocation(675.0, 325.0);
        nakresliKolecko(turtle, 25.0, Color.BLACK);
    }

    private void nakresliZmrzlinu(Turtle turtle) {
        nakresliKolecko(turtle, 50.0, Color.ORANGE);
        turtle.setLocation(100.0, 205.0);
        turtle.turnRight(90);
        nakresliRovnostrannyTrojuhelnik(turtle, 100.0, Color.ORANGE);
    }

    private void nakresliPravouhlyTrojuhelnik(Turtle turtle, double delkaStrany, Color barva) {
        turtle.setPenColor(barva);
        turtle.turnRight(45);
        turtle.move(sqrt((delkaStrany*delkaStrany)+(delkaStrany*delkaStrany)));
        turtle.turnRight(135);
        turtle.move(delkaStrany);
        turtle.turnRight(90);
        turtle.move(delkaStrany);
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
