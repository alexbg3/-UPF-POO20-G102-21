
import java.util.LinkedList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class MainOnlineStore {
    static LinkedList<Item> availableItems;
    static LinkedList<Package> listPackage;
    static LinkedList<User> listUser;
    static LinkedList<Item> soldItems;
    static double totalPrice = 0.00;
    static double totalProfit = 0.00;
    static LinkedList<Item> boughtItems;
    
    public static void buy(Item item, Buyer buyer){
        buyer.buy(item);
        availableItems.remove(item);
        totalPrice = item.getPrice() + totalPrice;
        totalProfit = item.calculateProfit() + totalProfit;
    }
    
    public static void main(String[] args) {
        boughtItems = new LinkedList<>();
        availableItems = new LinkedList<>();
        listUser = new LinkedList<>();
        soldItems = new LinkedList<>();
        listPackage = new LinkedList<>();
        UnitItem a = new UnitItem("Harry Potter 1", "Book", 3, 3, 3, 3); // size 3, cost 3, unitprice3, 3 units
        UnitItem b = new UnitItem("Harry Potter 2", "Book", 3, 3, 3, 3);// size 3, cost 3, unitprice3, 3 units
        WeightedItem c = new WeightedItem("P", "Nut", 1, 5, 1, 10);// size 1, cost 5, weightedprice =1euro, 10 weight
        WeightedItem d = new WeightedItem("Hazelnut", "Nut", 1, 5, 1, 10);// size 1, cost 5, weightedprice =1euro, 10 weight
        AuctionItem e = new AuctionItem("Pencil", "Antique", 2, 25 ,30, "Monday");
        // Now we will add the created items to the Item list
        availableItems.add(a);
        availableItems.add(b);
        availableItems.add(c);
        availableItems.add(d);
        availableItems.add(e);
        Administrator admin = new Administrator("Alex", "123", "Apple", listUser);// User( Administrator named Alex with id 123 and pass Apple
        Seller seller = new Seller("Emo", "111","Orange","1", soldItems, availableItems);// User( Seller named Emo with id 111, pass Orange and account number 1, list of the sold items, list of the available items
        Buyer buyer = new Buyer("Filip", "112", "Shisha", "2", boughtItems);// User( Buyer named Filip with id 112, pass Shisha and account number 2, list of bought items
        Buyer buyer2 = new Buyer("Filip", "112", "Shisha", "2", boughtItems);// User( Buyer named Filip with id 112, pass Shisha and account number 2, list of bought items
        listUser.add(buyer); // adding buyer to user's /list 
        listUser.add(admin); // adding administrator to user's list
        listUser.add(seller); // adding seller to the user's list
        listUser.add(buyer2);//
        Box box = new Box(5, 5,5 ); // box with 5x5x5 shape
        Envelope envelope = new Envelope(1, 2, "pink");// envelope with name pink width 1 and height 2
        listPackage.add(box); // adding the box in the package list
        listPackage.add(envelope); // adding the envelope in the package list
        // first we test if we have put all the items in the list of items
        System.out.print("List of availale Items:");
        System.out.println(availableItems);
        // test if sell works (it works) 
        buyer.buy(e); // we buy item e
        System.out.print("List of bought items :");
        System.out.println(boughtItems);
        // test if sell works( it works )
        seller.sell(e);
        System.out.print("List of Available items :");
        admin.printStock(availableItems);
        System.out.print("List of Sold items :");
        System.out.println(soldItems);
        //test if expel works ( it works )
        admin.expel(buyer);
        System.out.println(listUser);
        // test for profit
        System.out.print("profit from item c:");
        System.out.println(c.calculateProfit());
        // test for price
        System.out.print("Price for item c:");
        System.out.println(c.getPrice());
        // Testing if the function buy works ( it works)
        buy(a, buyer);
        System.out.print("Total profit: ");
        System.out.println(totalProfit);
        //Profit after sold 1 item
        buy(b, buyer);
        System.out.print("Total profit: ");
        System.out.println(totalProfit);
        //Profit after sold 2 items we can see it increases. Also we check the list of bought Items we can see that the items are added to the list.
        System.out.println(boughtItems);
    }
}
