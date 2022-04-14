public class ReceiptItem {

    String itemName;
    Double cost;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ReceiptItem{" +
                "itemName='" + itemName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
