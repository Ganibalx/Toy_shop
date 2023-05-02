public class Toy {
    private int id;
    private String name;
    private int frequency;
    private int quantity;
    private static int quan_all = 1;

    public Toy( String name, int frequency, int quantity) {
        this.id = quan_all;
        quan_all +=1;
        this.name = name;
        this.frequency = frequency;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
