import java.util.ArrayList;
import java.util.List;

public class ImportExportController {

    private List<Product> productsList;

    public ImportExportController() {
        this.productsList = new ArrayList<>();
    }

    public void importProducts() {
        for (int i=1; i<=20; i++){
            Product p = new Product("product-"+i,"coffee "+i,i*10.0);
            this.productsList.add(p);
        }
    }

    public void printProducts(){
        for (Product product : productsList){
            System.out.println(product);
        }
    }

}
