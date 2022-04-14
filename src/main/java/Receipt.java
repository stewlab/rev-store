import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Receipt {

    Integer id;
    String restarauntName;
    Double tip;
    Date purchaseDate;
    List<ReceiptItem> receiptItemList;

    public Receipt() {
        this.receiptItemList = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRestarauntName() {
        return restarauntName;
    }

    public void setRestarauntName(String restarauntName) {
        this.restarauntName = restarauntName;
    }

    public Double getTip() {
        return tip;
    }

    public void setTip(Double tip) {
        this.tip = tip;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public List<ReceiptItem> getReceiptItemList() {
        return receiptItemList;
    }

    public void setReceiptItemList(List<ReceiptItem> receiptItemList) {
        this.receiptItemList = receiptItemList;
    }

    public Double getTotalCost() {
        Double totalCost = 0.0;

        for (ReceiptItem receiptItem : receiptItemList) {
            totalCost += receiptItem.getCost();
        }

        return totalCost;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "id=" + id +
                ", restarauntName='" + restarauntName + '\'' +
                ", tip=" + tip +
                ", purchaseDate=" + purchaseDate +
                ", receiptItemList=" + receiptItemList +
                '}';
    }
}
