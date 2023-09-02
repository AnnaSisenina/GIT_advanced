import controller.Controller;
import data.WinList;
import model.Toy;
import model.ToyShop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Toy> shopList = new ArrayList<>();

        shopList.add(new Toy(1, "Car", 1));
        shopList.add(new Toy(2, "Dall", 5));
        shopList.add(new Toy(3, "Robot", 3));
        shopList.add(new Toy(4, "Bear", 3));

        ToyShop toyShop = new ToyShop(shopList);
        toyShop.addToy("Ball", 2);
        StringBuilder list = new StringBuilder();
        WinList winList = new WinList(list);
        Controller controller = new Controller();
        controller.toDraw(toyShop, winList);
    }


}
