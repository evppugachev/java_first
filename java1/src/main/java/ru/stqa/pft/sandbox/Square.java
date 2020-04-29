package ru.stqa.pft.sandbox;

public class Square {

    public double l; // аттрибуты класса, то есть квадрат описывается длиной его стороны

    public Square(double l) {
        this.l = l;

    }

    public double area () {
        return this.l * this.l;

    }

}
