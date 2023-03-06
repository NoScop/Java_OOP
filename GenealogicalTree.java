package HW1;

import java.util.ArrayList;

public class GenealogicalTree {
    private ArrayList<Human> allPeople;

    public GenealogicalTree() {
        allPeople = new ArrayList<>();
    }

    /**
     * Метод добавления человека в генеалогическое древо
     * somebody человек, которого нужно добавить.
     */
    public void addHuman(Human somebody) {
        allPeople.add(somebody);
    }

    /**
     * Метод поиска человека по имени и его детей
     * searchName принимает введенное пользователем значение 
     */
    public Human searchPeople (String searchName) {
        for (Human human : allPeople) {
            if (human.getName().equals(searchName)) {
                return human;
            } 
        }
        return null;
    }


    /**
     * Метод печати всех человек из генеалогического древа
     */
    public void printGenTree() {
        for (Human human : allPeople) {
            System.out.println(human);
        }
    }

    public ArrayList<Human> getAllPeople() {
        return allPeople;
    }
}
