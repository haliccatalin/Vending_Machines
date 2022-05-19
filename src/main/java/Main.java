
/*Vending Machine application requirements
Requirements

Implement a traditional vending machine which:

Allow user to select products - the menu is displayed in console.
Allow user to select what coins to insert - menu is displayed in console.
Allow user to take refund by canceling the request.
Return selected product and remaining change if any.
The state of the vending machine is saved in a file on the disk - a json file.
Vending Machine has the product menu configurable - new products can be added in the json file.
Vending Machine is configurable on what coins it accepts - new coins can be added in the json file.
For guidance you can check the code from this repository to see how these requirements were implemented.
*/


import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static ImportExportController controller = new ImportExportController();

    public static void main (String argv[]){
        controller.importProducts();
        controller.printProducts();



        menu();

    }

    public static void menu() {

        List<Product> productsList = controller.exportProducts();

        // afisare lista
        for (int i = 0; i < productsList.size(); i++) {
            Product p = productsList.get(i);

            System.out.println(i + ". " + p.getName());
        }

        while(true) {
            System.out.println("Selectati un produs din lista, pentru a iesi introduceti \"exit\" ");
            try {
                Scanner scanner = new Scanner(System.in);

                String input = scanner.next();

                if(input.equalsIgnoreCase("exit")) {
                    break;
                }

                int productNumber = Integer.getInteger(input);

                Product product = productsList.get(productNumber);
                System.out.println(product);
            } catch (IndexOutOfBoundsException | NullPointerException indexOutOfBoundsException) {
                System.out.println("Numar invalid!");
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Introduceti un numar, nu un text!!!!");
            }
        }
    }

}
