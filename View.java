import java.util.Scanner;

public class View {
    private Scanner s;

    public View(){
        this.s = new Scanner(System.in);
    }
    public void info(){
        System.out.println("Возмодные команды: \nadd - добавить игрушку в список\nlist - сформировать список игрушек к выдаче \nrafl - Выдать игрушку\nprint - печать массив игрушек\nexit - Выход");
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

}
