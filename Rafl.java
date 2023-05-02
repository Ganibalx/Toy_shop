import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Rafl {
    private List<String> prizeList;

    public Rafl() {
        this.prizeList = new ArrayList<>();
    }

    public List<Toy> listAdd(List<Toy> toys, View view) {
        toys.add(new Toy(view.command("Введите название игрушки"), view.inputInt("Введите % выпадения (int): "), view.inputInt("Введите кол-во игрушек")));
        return toys;
    }

    public void prize(List<Toy> toys){
        Random random = new Random();
        boolean f = true;
        int a = 0;
        for (Toy i: toys){
            a += i.getQuantity();
        }
        int b = random.nextInt(1,100);
        while(f){
            if (a>0){
                for (Toy i: toys){
                    if (i.getFrequency() >= b && i.getQuantity() > 0){
                        this.prizeList.add(i.getName());
                        i.setQuantity(i.getQuantity()-1);
                        a -= 1;
                        break;
                    }
                }
            }
            else{
                f = false;
            }
            b = random.nextInt(1,100);
        }
    }

    public List<String> getPrizeList() {
        return prizeList;
    }

    public void writeToFile() throws IOException {
        if (this.prizeList.size() > 0) {
            FileWriter fw = new FileWriter("Priz.txt", true);
            fw.append(this.prizeList.remove(0)+ "; ");
            fw.flush();
            fw.close();
        }
    }
}
