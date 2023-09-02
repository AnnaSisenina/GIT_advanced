package model;

import java.util.List;

public class ToyShop {

    List<Toy> toyDraw;

    public ToyShop(List<Toy> toyDraw) {
        this.toyDraw = toyDraw;
    }
    public String getPrizeName(int prizeID) {
        String name = null;
        for (Toy toy : toyDraw) {
            if (toy.getId() == prizeID) {
                name = toy.getName();
            }
        }
        return name;
    }

    public void deleteToy(int prizeID) {
        for (Toy toy : toyDraw) {
            if (toy.getId() == prizeID) {
                int newQuantity = toy.getQuantity() - 1;
                toy.setQuantity(newQuantity);
            }
        }
    }

    public void addToy(String name, int quantity) {
        int id = 0;
        for (Toy toy : toyDraw) {
           if (toy.id > id) id = toy.id;
        }
        toyDraw.add(new Toy(id+1, name, quantity));
    }
    public List<Toy> getToyDraw() {
        return toyDraw;
    }

    public void setToyDraw(List<Toy> toyDraw) {
        this.toyDraw = toyDraw;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("ToyShop:\n");
        for (Toy toy : toyDraw) {
            result.append("(id)").append(toy.id).append(" ");
            result.append("(name)").append(toy.name).append(" ");
            result.append("(quantity)").append(toy.quantity).append(" \n");
        }

        return result.toString();
    }
}
