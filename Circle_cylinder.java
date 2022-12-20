package com.mycompany.circle_cylinder;

import java.util.Scanner;

public class Circle_cylinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x;
        double y, h;
        circle c1 = new circle();

        cylinder cy = new cylinder();

        System.out.println("         welcome");

        while (true) {

            System.out.println("enter siutable");
            System.out.println("1-get the area of circule");
            System.out.println("2-get the area of cylinder");
            System.out.println("3-exit");
            x = input.nextInt();
            switch (x) {
                case 1:
                    System.out.println(" enter radious of circle");
                    y = input.nextDouble();
                    c1.setRadius(y);
                    System.out.println("the area of the circule is" + c1.getarea());
                    break;
                case 2:
                    System.out.println(" enter the radious of cylinder");
                    y = input.nextDouble();

                    c1.setRadius(y);
                    System.out.println(" enter the hight of cylinder");
                    h = input.nextDouble();
                    cy.setHeight(h);

                    System.out.println("the area of the cylinder is" + cy.getvolum());
                    break;
                case 3:
                    return;

            }

        }

    }

    public static class circle {

        public double Radius;
        public String color;

        public circle() {
            Radius = 1.0;
            color = "red";

        }

        public circle(double r) {

            Radius = r;

        }

        public circle(double r, String c) {

            Radius = r;
            color = c;

        }

        public void setRadius(double Radius) {
            this.Radius = Radius;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public double getRadius() {
            return Radius;
        }

        public double getarea() {

            return 3.14 * Radius * Radius;

        }

        @Override
        public String toString() {
            return "circle{" + "Radius=" + Radius + ", color=" + color + '}';
        }

    }

    public static class cylinder extends circle {

        private double height;

        public cylinder() {
        }

        public cylinder(double h) {
            height = h;

        }

        public cylinder(double h, double r) {
            super(r);
            height = h;
        }

        public cylinder(double h, double r, String c) {
            super(r, c);
            height = h;

        }

        @Override
        public String toString() {
            return "cylinder{" + "height=" + height + '}';
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public double getvolum() {

            return 3.14 * Radius * Radius * height;

        }

    }

}
