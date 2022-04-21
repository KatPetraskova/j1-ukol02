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
        nakresliKolecko(zofka, 50.0, Color.ORANGE);
        zofka.setLocation(100.0, 205.0);
        zofka.turnRight(90);
        nakresliRovnostrannyTrojuhelnik(zofka, 100.0, Color.ORANGE);

        //snehulak
        nakresliKolecko(tyna, 50.0, Color.BLACK);
        tyna.setLocation(525.0, 325.0);
        nakresliKolecko(tyna, 75.0, Color.BLACK);
        tyna.setLocation(500.0, 500.0);
        nakresliKolecko(tyna, 100.0, Color.BLACK);
        tyna.setLocation(475.0, 325.0);
        nakresliKolecko(tyna, 25.0, Color.BLACK);
        tyna.setLocation(675.0, 325.0);
        nakresliKolecko(tyna, 25.0, Color.BLACK);

        //priprava na masinku
        zofka.setLocation(825.0, 300);
        zofka.turnLeft(90);

        //masinka
        nakresliPravouhlyTrojuhelnik(zofka, 50.0, Color.BLUE);
        zofka.setLocation(1000.0, 275);
        nakresliObdelnik(zofka, 125.0, 75.0, Color.BLUE);
        zofka.setLocation(915.0, 320);
        nakresliKolecko(zofka, 20, Color.BLUE);
        zofka.setLocation(960.0, 320);
        nakresliKolecko(zofka, 20, Color.BLUE);
        zofka.setLocation(1080.0, 275);
        nakresliObdelnik(zofka, 80.0, 120.0, Color.BLUE);
        zofka.setLocation(1045.0, 315);
        nakresliKolecko(zofka, 40.0, Color.BLUE);

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
