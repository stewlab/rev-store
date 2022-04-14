import java.util.ArrayList;
import java.util.List;

public class Store {

//        Reciept web app
//        Example item JSON
//        {"name":"Burger deluxe", "price":12.99}
//        post /items this will add a new item to the reciept
//        get /items this will return all the items on the reciept
//        get /total the total cost of all items on the reciept
//        delete /items removes all items on the reciept

    Receipt receipt;

    public Store() {
        this.receipt = new Receipt();
    }

    // post /items
    public void addItem(ReceiptItem receiptItem) {

        List<ReceiptItem> receiptItemList = this.receipt.getReceiptItemList();

        receiptItemList.add(receiptItem);

        this.receipt.setReceiptItemList(receiptItemList);

    }

    // get /items
    public List<ReceiptItem> getItems() {
        return receipt.getReceiptItemList();
    }

    // get /total
    public Double getTotalCost() {
        return this.receipt.getTotalCost();
    }

    // delete /items
    public void removeAllItems() {

        List<ReceiptItem> emptyList = new ArrayList<ReceiptItem>();
        this.receipt.setReceiptItemList(emptyList);
    }

}
