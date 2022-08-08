package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();

        nakresliZmrlinu(zofka);
        zofka.turnLeft(100);
        zofka.penUp();
        zofka.move(300);
        zofka.turnRight(125);
        zofka.move(300);
        zofka.turnRight(93);

        nakresliSnehulaka(zofka);

        zofka.penUp();
        zofka.move(500);
        zofka.turnRight(85);

        nakresliMasinku(zofka);


    }

    private void nakresliMasinku(Turtle zofka) {
        zofka.setPenColor(Color.GREEN);
        nakresliNaraznik(zofka);
        nakresliCtverec(zofka);

        zofka.penUp();
        zofka.turnRight(180);

        for (int i = 0; i < 5; i++) {
            nakresliKruhDoPrava(zofka, 20, 5);
            zofka.move(40);
        }
    }

    private void nakresliSnehulaka(Turtle zofka) {
        nakresliKruhDoLeva(zofka, 20, 8);
        nakresliKruhDoPrava(zofka, 20, 12);
        zofka.turnRight(85);
        zofka.penUp();
        zofka.move(75);
        zofka.turnLeft(82);
        nakresliKruhDoPrava(zofka, 20, 18);
    }

    private void nakresliZmrlinu(Turtle zofka) {
        nakresliKruhDoPrava(zofka, 30, 10);
        zofka.setSpeed(150);
        nakresliTrojuhelnik(zofka);
    }

    private void nakresliTrojuhelnik(Turtle zofka) {
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(95);
        zofka.turnRight(105);
        zofka.move(140);
        zofka.turnRight(140);
        zofka.move(140);
    }

    private void nakresliNaraznik(Turtle zofka) {
        zofka.setSpeed(120);
        zofka.penDown();
        zofka.move(95);
        zofka.turnRight(90);
        zofka.move(95);
        zofka.turnRight(135);
        zofka.move(140);
    }
    private void nakresliCtverec(Turtle zofka) {
        zofka.setSpeed(20);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(95);
        zofka.turnRight(90);
        zofka.move(200);
    }

    private void nakresliKruhDoPrava(Turtle turtle, int pocetStran, int delkaStrany) {
        for (int i = 0; i < pocetStran; i++) {
        turtle.penDown();
        turtle.move(delkaStrany);
        double uhel = 360 / pocetStran;
        turtle.turnRight(uhel);
        }
    }
    private void nakresliKruhDoLeva(Turtle turtle, int pocetStran, int delkaStrany) {
        for (int i = 0; i < pocetStran; i++) {
            turtle.penDown();
            turtle.move(delkaStrany);
            double uhel = 360 / pocetStran;
            turtle.turnLeft(uhel);
        }
    }
}
