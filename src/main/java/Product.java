public class Product {

    private String id;
    private String name;
    private double price;


    public Product(String id, String name, double price) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
    }

    public String getId() {
        if (this.id == null){
            return "";
        }
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
        else {
            System.out.println("!! Camp invalid !!");
        }
    }

    public String getName() {
        if (this.name == null){
            return "";
        }
        return this.name;
    }

    public void setName(String name) {
        if (name != null){
            this.name = name;
        }
        else {
            System.out.println("!! Camp invalid !!");
        }
    }

    public double getPrice() {
        if (price < 0) {
            return  0;
        }
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
        else {
            System.out.println("!! Camp invalid !!");
        }
    }

    @Override
    public String toString(){
        return this.getId()+" "+this.getName()+" "+this.getPrice();
    }

}
