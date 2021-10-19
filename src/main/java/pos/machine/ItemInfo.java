package pos.machine;

import com.sun.tools.internal.xjc.model.CArrayInfo;

public class ItemInfo {
    private final String barcode;
    private final String name;
    private final int price;
    int quantity;

    //constructor for item
    public ItemInfo(String barcode, String name, int price) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
    }

    //method (get method)
    public String getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String generateReceiptLine(int start, int row){
        String line = null;
        for (int i = start; i <= row; i++) {
           line = System.out.println("Name: " + name + ", quantity: " + quantity + "Unit Price:" + price, ", subtotal: "+ subtotal);
        }
        return line;
    }

    public int calculateQuantity(){
        return quantity;
    }

    public int calculateReceipt(){
        int subtotal = 0;
        subtotal = getPrice();
        subtotal = subtotal * quantity;
        return subtotal;
    }


}
