package model;

import java.util.Random;

public class Draw {

    public int drawPrize(ToyShop toyShop) throws RuntimeException{
        if (toyShop.toyDraw.size()==0) throw new RuntimeException("Cписок подарков пуст =(");
        int checkNull = 0;
        int quantity = 0;
        for (Toy toy : toyShop.toyDraw) {
            quantity+=toy.quantity;
            if (toy.quantity == 0) checkNull ++;
        }
        if (checkNull == toyShop.toyDraw.size()) throw new RuntimeException("Подарки закончились =(");
        int [] array = new int[quantity];
        int i = 0;
        while (i < quantity){
            for (Toy toy : toyShop.getToyDraw()) {
                int j = 0;
                while ( j < toy.getQuantity()){
                    array[i] = toy.getId();
                    i++;
                    j++;
                }
            }
        }
        Random rd = new Random();
        int check = (int)(Math.random()*(quantity-1));
        return array[check];
    }
}
