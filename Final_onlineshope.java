package com.mycompany.final_onlineshope;

import java.util.Scanner;

public class Final_onlineshope {

    public static void main(String[] args) {

        String y;

        childrenbook c1 = new childrenbook();
        book b1 = new book();
        Scanner x = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        System.out.println("            welcom to my online shope             ");
        System.out.println("choose your wanted product pleas");
        System.out.println("if you wanted abook pleas enter 1");
        System.out.println("if you wanted another product pleas enter 2");
        int num = x.nextInt();
        switch (num) {
            case 1:

                System.out.println("pleas enter the kind of the book");
                y = m.nextLine();
                b1.setTy(y);
                switch (b1.getTy()) {
                    case "childerbook":

                        c1.setprice(250);
                        System.out.println("the price of chidren book is " + c1.getPrice());
                        break;

                    case "exiting book":

                        c1.setprice(300);
                        System.out.println("the price of the exiting book is " + c1.getPrice());
                        break;

                    case "advanture book":

                        c1.setprice(350);
                        System.out.println("the price of the advanture book is " + c1.getPrice());
                        break;

                }

            case 2:
                System.out.println("sorry invalide product");
                break;

        }

    }

    public static abstract class product {

        double price;

        public product() {

        }

        public product(double P) {

            price = P;

        }

        public abstract void setprice(double P);

        public abstract double getprice();

    }

    public static class book extends product {

        private String ty;
        private double p;

        @Override
        public void setprice(double P) {

            price = p;

        }

        @Override

        public double getprice() {

            return price;

        }

        public void setTy(String ty) {
            this.ty = ty;
        }

        public String getTy() {
            return ty;
        }

    }

    public static class childrenbook extends book {

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

    }

}
