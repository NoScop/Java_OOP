package HW1;


import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Main {

    public static void main(String[] args) {
        
        Human human1 = new Human("Вячеслав");
        Human human2 = new Human();
        Human human3 = new Human("Сергей", Sex.Man, "26.09.1998");
        Human human4 = new Human("Валентина", Sex.Woman, "27.08.1997");
        Human human5 = new Human("Владислав", Sex.Man, "06.10.2010");
        Human human6 = new Human("Александр", Sex.Man, "02.06.2001");
        Human human7 = new Human("Василий", Sex.Man, "26.03.2021");

        human2.setName("Виктория");

        GenealogicalTree Family = new GenealogicalTree();
        Family.addHuman(human1);
        Family.addHuman(human2);
        Family.addHuman(human3);
        Family.addHuman(human4);
        Family.addHuman(human5);
        Family.addHuman(human6);
        Family.addHuman(human7);

        Family.printGenTree();
        System.out.println("-------");
        
        human5.setMother(human2);
        System.out.printf("У матери человека, которого зовут %s, имя %s", 
            human5.getName(), human5.getMother().getName());
        System.out.println("\n-------");

        human1.setPartner(human2);
        human2.setPartner(human1);
        System.out.println(human2.getPartner());
        human1.addChild(human3);
        human1.addChild(human5);
        human1.addChild(human6);
        human1.getChildren();
        System.out.println("-------");

        human3.setPartner(human4);
        human4.setPartner(human3);
        human3.addChild(human7);        
        human3.getChildren();

        System.out.println("-------");
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите имя для поиска: ");
        String searchName = iScanner.next();
        iScanner.close();

        if (Family.searchPeople(searchName) == null) {
            System.out.println("Совпадений не найдено");
        } else {
            System.out.printf("Результат поиска: %s найден\n", Family.searchPeople(searchName).getName());
            Family.searchPeople(searchName).getChildren();
        }
    }   
}
