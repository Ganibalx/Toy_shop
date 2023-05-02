import java.util.List;
import java.util.Scanner;

public class View {
    private Scanner s;

    public View(){
        this.s = new Scanner(System.in);
    }
    public void info(){
        System.out.println("Возмодные команды: \nadd - добавить игрушку в список\nlist - сформировать список игрушек к выдаче \nrafl - Выдать игрушку\nprint - печать массив игрушек\nedit - Редактировать шанс выпадения игрушки\nexit - Выход");
    }

    public String command(String text){
        System.out.println(text);
        return this.s.nextLine();
    }

    public int inputInt(String text){
        System.out.println(text);
        return this.s.nextInt();
    }

    public void close(){
        this.s.close();
    }

    public void printprize(String s){
        System.out.println("Очередность призов: "+ s);
    }

    public void printToy(List<Toy> toys){        
        for (Toy i: toys){
            System.out.println("id: "+i.getId()+" Name: "+i.getName()+" frequency: "+i.getFrequency()+"\n\n");
        }
        System.out.println("Выберете ID игрушки для редактирования:\n");
        boolean f = true;
        int a = this.s.nextInt();
        for (Toy i: toys){
            if (i.getId() == a){
                f = false;
                System.out.println("Введите новую вероятность: ");                
                i.setFrequency(this.s.nextInt());
            }
        }
        if (f){
            System.out.println("Нет такой игрушки");
        }            
    }
}
