import com.google.gson.Gson;
import io.javalin.Javalin;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Store store = new Store();

        Javalin javalinApp = Javalin.create();

//        Reciept web app
//        Example item JSON
//        {"name":"Burger deluxe", "price":12.99}
//        post /items this will add a new item to the reciept
//        get /items this will return all the items on the reciept
//        get /total the total cost of all items on the reciept
//        delete /items removes all items on the reciept

        // post /items
        javalinApp.post("/items", context -> {
            String body = context.body();
            Gson gson = new Gson();

            ReceiptItem receiptItem = gson.fromJson(body, ReceiptItem.class);

            store.addItem(receiptItem);

            context.status(201);
            context.result("Added reciept item!!!");
        });

        // get /items
        javalinApp.get("/items", context -> {
            Gson gson = new Gson();

            List<ReceiptItem> receiptItemList = store.getItems();
            String json = gson.toJson(receiptItemList);
            context.result(json);
        });

        // get /items
        javalinApp.get("/total", context -> {
            Gson gson = new Gson();

            Double totalCost = store.getTotalCost();
            String json = gson.toJson(totalCost);
            context.result(json);
        });

        // get /items
        javalinApp.delete("/items", context -> {
            store.removeAllItems();

            context.status(201);
            context.result("All receipt items deleted!!!");
        });

        javalinApp.start(7000);


    }
}
