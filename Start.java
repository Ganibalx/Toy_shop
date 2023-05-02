import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Start {
    public static void main(String[] args) throws IOException {
        List<Toy> toys = new ArrayList<>(); //Лист всех игрушек
        toys.add(new Toy("Робот", 10, 5));
        toys.add(new Toy("Кукла", 20, 6));
        toys.add(new Toy("Шашки", 35, 10));

        View view = new View();  //Взаимодействие с пользователем
        view.info();

        Rafl rafl = new Rafl();

        boolean f = true;
        while (f){
            switch (view.command("Введите команду: ")) {
                case "add" -> {
                    toys = rafl.listAdd(toys, view);
                }
                case "list" -> {
                    rafl.prize(toys);
                }
                case "print" -> {
                    view.printprize(rafl.getPrizeList().toString());
                }
                case "rafl" -> {
                    rafl.writeToFile();
                }
                case "edit" -> {
                    view.printToy(toys);
                }
                case "exit" -> {
                    f = false;
                }
            }
        }
        view.close();
    }
}
