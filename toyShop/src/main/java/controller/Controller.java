package controller;

import java.util.Random;
import java.util.Scanner;

import data.WinList;
import model.Draw;
import model.ToyShop;
import model.Toy;


public class Controller {

    public void toDraw(ToyShop toyShop, WinList winList) {
        System.out.println("Розыгрываем призы?" +
                "1. Да " +
                "2. Нет ");
        Scanner sc = new Scanner (System.in);
        Draw draw = new Draw();
        int answer = sc.nextInt();
        switch (answer) {
            case 1 -> {
                int prizeID = draw.drawPrize(toyShop);
                toyShop.deleteToy(prizeID);
                String prize = toyShop.getPrizeName(prizeID);
                System.out.println("Ваш приз " + prize);
                winList.winList.append(prize).append("; ");
                try {
                    toDraw(toyShop, winList);
                }
                catch (RuntimeException E){
                    System.out.println(E.toString());
                    System.out.println(toyShop.toString());
                    System.out.println(winList.toString());
                    winList.WriteData();
                }
            }
            case 2 -> {
                System.out.println(toyShop.toString());
                System.out.println(winList.toString());
                winList.WriteData();
            }
            default -> throw new IllegalStateException("Unexpected value: " + answer);
        }
    }

}
