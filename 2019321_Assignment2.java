//RITIK VATSAL ||  2019321
//Advanced Programming Assignment 2

package com.company;
import javafx.scene.web.WebHistory;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;


public class Main implements Helper{
    public static void main(String args[]) {


        // HARD CODING 5 Customers and Restaurants

//        1. Ram (Elite)
//        2. Sam (Elite)
//        3. Tim (Special)
//        4. Kim
//        5. Jim

        ArrayList<Cust> CustList = new ArrayList<>();
        CustList.add(new Cust());
        CustList.get(0).ctnm("Ram",1);
        CustList.add(new Cust());
        CustList.get(1).ctnm("Sam",1);
        CustList.add(new Cust());
        CustList.get(2).ctnm("Tim",2);
        CustList.add(new Cust());
        CustList.get(3).ctnm("Kim");
        CustList.add(new Cust());
        CustList.get(4).ctnm("Jim");

//        1) Shah (Authentic)
//        2) Ravi’s
//        3) The Chinese (Authentic)
//        4) Wang’s (Fast Food)
//        5) Paradise

        ArrayList<Rest> RestList = new ArrayList<>();
        RestList.add(new Rest());
        RestList.get(0).ctnm("Shah's Mughlai", 2);
        RestList.add(new Rest());
        RestList.get(1).ctnm("Ravi's");
        RestList.add(new Rest());
        RestList.get(2).ctnm("The Ching Chong - Chinese", 2);
        RestList.add(new Rest());
        RestList.get(3).ctnm("Wang's", 1);
        RestList.add(new Rest());
        RestList.get(4).ctnm("Paradise");
        int TOTALdelivery=0;
        Double TOTALzotat=0.0;

        int dishcount=0;
        Scanner in= new Scanner(System.in);

        int control=0;
        while (control!=5){
            System.out.println(welc1);
        control=in.nextInt();

        if (control==1){
            System.out.println(chrest);
            int chosenRest=in.nextInt();
            int doin=0;

            while(doin!=5){
            System.out.println("----------Welcome " + RestList.get(chosenRest-1).name +"-----------");
            System.out.println(afterChoiceRest);
            doin=in.nextInt();
            in.nextLine();

            if (doin==1){
                dishcount=dishcount+1;
                System.out.println("Enter Food Item Details:\n Food Name");
                Dish dish=new Dish();
                dish.Nm(in.nextLine());
                System.out.println("Price ");
                Double price=in.nextDouble();
                System.out.println("Quantity ");
                int quanti=in.nextInt();
                System.out.println("Category ");
                String cat=in.next();
                System.out.println("Discount Offer");
                Double disc=in.nextDouble();
                dish.dishDeets(price,quanti,cat,disc, dishcount);
                System.out.println(dish.id+"   "+dish.name+"   "+dish.quan+"   "+dish.mrp+"   "+dish.ind_disc+"% off"+"   "+dish.categ);
                RestList.get(chosenRest-1).dishes.add(dish);




            }

            if (doin==2){
                System.out.println("----------Choose item by Code---------");
                for (int i = 0; i <RestList.get(chosenRest-1).dishes.size() ; i++) {
                    System.out.println(RestList.get(chosenRest-1).dishes.get(i).id+"   "+RestList.get(chosenRest-1).dishes.get(i).name+"   "+RestList.get(chosenRest-1).dishes.get(i).quan+"   "+RestList.get(chosenRest-1).dishes.get(i).mrp+"   "+RestList.get(chosenRest-1).dishes.get(i).ind_disc+"% off"+"   "+RestList.get(chosenRest-1).dishes.get(i).categ);
                }

                int chdsh=in.nextInt();
                for (int i = 0; i <RestList.get(chosenRest-1).dishes.size() ; i++) {
                    if (chdsh==RestList.get(chosenRest-1).dishes.get(i).id){
                        chdsh=i;
                    }
                }

                System.out.println(dishEditChoice);
                int boom=in.nextInt();

                if (boom==1){
                    System.out.println("Enter New Name ");
                    in.nextLine();
                    RestList.get(chosenRest-1).dishes.get(chdsh).name=in.nextLine();
                    System.out.println(RestList.get(chosenRest-1).dishes.get(chdsh).id+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).name+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).quan+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).mrp+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).ind_disc+"% off"+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).categ);
                }

                if (boom==2){
                    System.out.println("Enter New Price ");
                    RestList.get(chosenRest-1).dishes.get(chdsh).mrp=in.nextDouble();
                    System.out.println(RestList.get(chosenRest-1).dishes.get(chdsh).id+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).name+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).quan+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).mrp+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).ind_disc+"% off"+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).categ);

                }

                if (boom==3){
                    System.out.println("Enter New Quantity ");
                    RestList.get(chosenRest-1).dishes.get(chdsh).quan=in.nextInt();
                    System.out.println(RestList.get(chosenRest-1).dishes.get(chdsh).id+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).name+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).quan+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).mrp+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).ind_disc+"% off"+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).categ);

                }

                if (boom==4){
                    System.out.println("Enter New Category ");
                    RestList.get(chosenRest-1).dishes.get(chdsh).categ=in.next();
                    System.out.println(RestList.get(chosenRest-1).dishes.get(chdsh).id+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).name+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).quan+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).mrp+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).ind_disc+"% off"+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).categ);

                }

                if (boom==5){
                    System.out.println("Enter New Offer ");
                    RestList.get(chosenRest-1).dishes.get(chdsh).ind_disc=in.nextDouble();
                    System.out.println(RestList.get(chosenRest-1).dishes.get(chdsh).id+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).name+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).quan+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).mrp+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).ind_disc+"% off"+"   "+RestList.get(chosenRest-1).dishes.get(chdsh).categ);

                }
            }

            if (doin==3){
                System.out.println("Reward Points:" + RestList.get(chosenRest-1).rewards);
            }

            if (doin==4){
                System.out.println("Offer on Bill Value");
                RestList.get(chosenRest-1).ovrdisc=in.nextInt();
            }


            }

        }

        if (control==2){
            System.out.println(userslistprint);
            int username=in.nextInt();
            ArrayList<DishinCart> order=new ArrayList<>();


            int userchoice=0;

            while(userchoice!=5){
                System.out.println("-------------Welcome "+ CustList.get(username-1).name+" | Delhi |"+"--------------");
                System.out.println(usermenu);
                userchoice=in.nextInt();

                if (userchoice==1){
                    System.out.println(chrest);
                    int userRestChoice=in.nextInt();
                    System.out.println("----------Choose item by Code---------");
                    for (int i = 0; i <RestList.get(userRestChoice-1).dishes.size() ; i++) {
                        System.out.println(RestList.get(userRestChoice-1).dishes.get(i).id+"   "+RestList.get(userRestChoice-1).dishes.get(i).name+"   "+RestList.get(userRestChoice-1).dishes.get(i).quan+"   "+RestList.get(userRestChoice-1).dishes.get(i).mrp+"   "+RestList.get(userRestChoice-1).dishes.get(i).ind_disc+"% off"+"   "+RestList.get(userRestChoice-1).dishes.get(i).categ);
                    }
                    int userchosdish=in.nextInt();
                    for (int i = 0; i <RestList.get(userRestChoice-1).dishes.size() ; i++) {
                        if(userchosdish==RestList.get(userRestChoice-1).dishes.get(i).id){
                            userchosdish=i;
                        }
                    }


                    System.out.println("Please Enter Quantity");
                    int itemQ=in.nextInt();
                    order.add(new DishinCart(RestList.get(userRestChoice-1).dishes.get(userchosdish),itemQ));
                    RestList.get(userRestChoice-1).dishes.get(userchosdish).quan=RestList.get(userRestChoice-1).dishes.get(userchosdish).quan-itemQ;
                    System.out.println("Item(s) Added to Cart!");


                    while(userchoice!=5){
                        System.out.println("-------------Welcome "+ CustList.get(username-1).name+" | Delhi |"+ CustList.get(username-1).Moni +"--------------");
                        System.out.println(afteraddScrn);

                    userchoice=in.nextInt();

                    if (userchoice==1){

                        System.out.println("----------Choose item by Code---------");
                        for (int i = 0; i <RestList.get(userRestChoice-1).dishes.size() ; i++) {
                            System.out.println(RestList.get(userRestChoice-1).dishes.get(i).id+"   "+RestList.get(userRestChoice-1).dishes.get(i).name+"   "+RestList.get(userRestChoice-1).dishes.get(i).quan+"   "+RestList.get(userRestChoice-1).dishes.get(i).mrp+"   "+RestList.get(userRestChoice-1).dishes.get(i).ind_disc+"% off"+"   "+RestList.get(userRestChoice-1).dishes.get(i).categ);
                        }
                        userchosdish=in.nextInt();
                        for (int i = 0; i <RestList.get(userRestChoice-1).dishes.size() ; i++) {
                            if(userchosdish==RestList.get(userRestChoice-1).dishes.get(i).id){
                                userchosdish=i;
                            }
                        }

                        System.out.println("Please Enter Quantity");
                        itemQ=in.nextInt();
                        order.add(new DishinCart(RestList.get(userRestChoice-1).dishes.get(userchosdish),itemQ));
                        RestList.get(userRestChoice-1).dishes.get(userchosdish).quan=RestList.get(userRestChoice-1).dishes.get(userchosdish).quan-itemQ;
                        System.out.println("Item(s) Added to Cart!");

                    }

                    if (userchoice==2){
                        Double PricetoPay=0.0;
                        String ordrd="";
                        System.out.println("Items in Cart -");
//                        System.out.println(PricetoPay);
                        int totnum=0;
                        for (int i = 0; i < order.size() ; i++) {
                            System.out.print(RestList.get(userRestChoice-1).name+ " ");
                            System.out.println(order.get(i).dish.name+" | "+order.get(i).dish.mrp+" | "+order.get(i).Quantity+" | "+order.get(i).dish.ind_disc);
                            ordrd=ordrd+ "You Bought "+ order.get(i).dish.name + " Quantity - " +order.get(i).Quantity+ " From " + RestList.get(userRestChoice-1).name+"\n" ;
                            PricetoPay=PricetoPay+((order.get(i).dish.mrp*(100-order.get(i).dish.ind_disc)/100)*order.get(i).Quantity);
//                            System.out.println("bo" + PricetoPay);
                            totnum=totnum+order.get(i).Quantity;
                        }
//                        System.out.println(PricetoPay);

                        PricetoPay=(PricetoPay*(100-RestList.get(userRestChoice-1).ovrdisc)/100);
                        if (RestList.get(userRestChoice-1).cat==2){
                            if (PricetoPay>100){
                                PricetoPay=PricetoPay-50;
                            }
                        }


                        if (CustList.get(username-1).cat==1){
                            System.out.println("Delivery Charges - 0/-");
                            ordrd= ordrd+" Delivery Charges - 0/- \n" ;
                            if (PricetoPay>200){
                                PricetoPay=PricetoPay-50;
                            }
                        }
                        if (CustList.get(username-1).cat==2){
                            System.out.println("Delivery Charges - 20/-");
                            ordrd= ordrd+" Delivery Charges - 20/- \n" ;
                            PricetoPay=PricetoPay+20;
                            TOTALdelivery=TOTALdelivery+20;
                            if (PricetoPay>200){
                                PricetoPay=PricetoPay-25;
                            }
                        }

                        if (CustList.get(username-1).cat==3){
                            System.out.println("Delivery Charges - 40/-");
                            ordrd= ordrd+" Delivery Charges - 40/- \n" ;
                            TOTALdelivery=TOTALdelivery+40;
                            PricetoPay=PricetoPay+40;
//                            System.out.println("bavm" +PricetoPay);


                        }

                        System.out.println("Total Order Value - INR " + PricetoPay);
                        System.out.println("Enter 1 to Confirm your Order!");
                        in.nextInt();
                        ordrd= ordrd+"Order Total was - " + PricetoPay ;
                        CustList.get(username-1).ordHist.push(ordrd);
                        order.clear();
                        int no=0;
                        TOTALzotat=TOTALzotat+(PricetoPay/100);

                        if(CustList.get(username-1).reward>0){
                            if(CustList.get(username-1).reward>PricetoPay){
                                CustList.get(username-1).reward=CustList.get(username-1).reward-PricetoPay;
                            }

                            else{
                                CustList.get(username-1).reward=0.0;

                            }
                        }

                        else{
                            CustList.get(username-1).Moni=CustList.get(username-1).Moni-(PricetoPay-CustList.get(username-1).reward);
                        }

                        if (RestList.get(userRestChoice-1).cat==1){
                             no = (int) ((PricetoPay)/150);

                            RestList.get(userRestChoice-1).rewards=RestList.get(userRestChoice-1).rewards+10*no;
                            CustList.get(username-1).reward=CustList.get(username-1).reward+10*no;
                        }

                        if (RestList.get(userRestChoice-1).cat==2){
                            no = (int) ((PricetoPay)/200);

                            RestList.get(userRestChoice-1).rewards=RestList.get(userRestChoice-1).rewards+25*no;
                            CustList.get(username-1).reward=CustList.get(username-1).reward+25*no;
                        }

                        if (RestList.get(userRestChoice-1).cat==3){
                            no = (int) ((PricetoPay)/100);
                            RestList.get(userRestChoice-1).rewards=RestList.get(userRestChoice-1).rewards+5*no;
                            CustList.get(username-1).reward=CustList.get(username-1).reward+5*no;
                        }


                        System.out.println("Success! You placed an order for " + totnum + " Items. Your total amount is INR " + PricetoPay);





                                                    // End TRANSACTION
                    }

                    if (userchoice==3){
                            System.out.println("Your Rewards - " + CustList.get(username-1).reward);
                        }

                    if (userchoice==4){
                        Stack temp=(Stack)CustList.get(username-1).ordHist.clone();
                        if(CustList.get(username-1).Moni!=1000.0){
                        while (!temp.empty()){
                            System.out.println(temp.pop());
                            System.out.println("------------------");
                        }}

                    }

                    }
                }

                if (userchoice==2){
                    System.out.println("Cart Empty!");
                }

                if (userchoice==3){
                    System.out.println("Your Rewards - " + CustList.get(username-1).reward);
                }

                if (userchoice==4) {
                    Stack temp = (Stack) CustList.get(username - 1).ordHist.clone();
                    if (CustList.get(username - 1).Moni != 1000.0) {
                        while (!temp.empty()) {
                            System.out.println(temp.pop());
                            System.out.println("------------------");
                        }
                    }
                }


            }

        }

        if (control==3){
            System.out.println("1. Customers \n2. Restaurant" );
            int stalkchoice=in.nextInt();
            if(stalkchoice==1){
            System.out.println("----------Select User---------");
            System.out.println(userslistprint);
            int stalk=in.nextInt();
            System.out.println(CustList.get(stalk-1).name +" | Delhi | "+ CustList.get(stalk-1).Moni +" | "+ CustList.get(stalk-1).reward);
                System.out.println(CustList.get(stalk-1).Categori());
            }

            if(stalkchoice==2){

                System.out.println(chrest);
                int stalk=in.nextInt();
                System.out.println(RestList.get(stalk-1).name +" | Delhi | "+ RestList.get(stalk-1).ovrdisc +"% ovr Discount | " + RestList.get(stalk-1).dishes.size()+" Dishes | "+ RestList.get(stalk-1).rewards);
                System.out.println(RestList.get(stalk-1).Categori());
            }
        }

        if (control==4){
            System.out.println("Total Delivery Charge - " + TOTALdelivery);
            System.out.println("Total Zotato Earnings - " + TOTALzotat);
        }


    }
    }
}

// No need for Private variables

class Details {
    String name;
    int cat;

    public void Nm(String name){
        this.name=name;
    }

    public void ctnm(String name, int cat){
        this.name=name;
        this.cat=cat;

    }

    public void ctnm(String name){              //POLYMORPHISM
        this.name=name;
        this.cat=3;
    }


}

class Cust extends Details{
    private String Catt;
    Double reward=0.0;
    Double Moni=1000.0;

Stack<String> ordHist= new Stack<>();

public String Categori(){
    // for Category (int cat) 1 - Elite | 2 - Special | 3 - Normal
    if (this.cat==1){
        this.Catt="-Elite User-";
    }
    if (this.cat==2){
        this.Catt="-Special User-";
    }
    if (this.cat==3){
        this.Catt="-Regular User-";
    }
    String finn=this.Catt;
    return finn;
}





}

class Rest extends Details{
    private String Catt;
    ArrayList<Dish> dishes=new ArrayList<>();
    int rewards;
    int ovrdisc=0;

    public String Categori(){
        // for Category (int cat)  1 - Fast | 2 - Authentic | 3 - Normal

        if (this.cat==1){
            this.Catt="-Cuisine | Fast Food-";
        }
        if (this.cat==2){
            this.Catt="-Cuisine | Authentic-";
        }
        if (this.cat==3){
            this.Catt="-Cuisine | Normal-";
        }
        String finn=this.Catt;
        return finn;
    }





}

class Dish extends Details{
    Double mrp;
    int id;
    Double ind_disc;
//    int fin_price;
     int quan;
    String categ;

    public void dishDeets(Double price, int quan, String category, Double disc, int id){
        this.mrp=price;
        this.id=id;
        this.quan=quan;
        this.categ=category;
        this.ind_disc=disc;
//        this.fin_price=price * (100-disc) / 100;
    }



}

interface Helper{
    final String welc1="----------Welcome to ZOTATO-----------\n" +                             // "final" Keyword not required, since interface variables are final.
            "1) Enter as Restaurant Owner\n" +
            "2) Enter as Customer\n" +
            "3) Check User Details\n" +
            "4) Company Account details\n" +
            "5) Exit\n";

    final String chrest="----------Choose a Restaurant-----------\n"+"1) Shah's Mughlai (Authentic)\n" +
            "2) Ravi’s\n" +
            "3) The Ching Chong - Chinese (Authentic)\n" +
            "4) Wang’s (Fast Food)\n" +
            "5) Paradise\n";

    String afterChoiceRest="1) Add item\n" +
            "2) Edit item\n" +
            "3) Print Rewards\n" +
            "4) Discount on bill value\n" +
            "5) Exit";

    String dishEditChoice="Choose an attribute to edit:\n" +
            "1) Name\n" +
            "2) Price\n" +
            "3) Quantity\n" +
            "4) Category\n" +
            "5) Offer";

    String userslistprint="1. Ram (Elite)\n" +
            "2. Sam (Elite)\n" +
            "3. Tim (Special)\n" +
            "4. Kim\n" +
            "5. Jim";

    String usermenu="Customer Menu\n" +
            "1) Select Restaurant\n" +
            "2) checkout cart\n" +
            "3) Reward won\n" +
            "4) print the recent orders\n" +
            "5) Exit";

    String afteraddScrn="Customer Menu\n" +
            "1) Search item\n" +
            "2) checkout cart\n" +
            "3) Reward won\n" +
            "4) print the recent orders\n" +
            "5) Exit";


}

class DishinCart{
     Dish dish;
     int Quantity;


    public  DishinCart( Dish dish, int Quantity){
        this.dish=dish;
        this.Quantity=Quantity;
    }
}