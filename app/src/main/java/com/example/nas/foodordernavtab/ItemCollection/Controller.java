package com.example.nas.foodordernavtab.ItemCollection;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by nas on 04/12/2017.
 */

public class Controller extends Application {

    private ArrayList<Satay> satays = new ArrayList<Satay>();
    private Order order = new Order();

    public Satay getSatay(int position){
        return satays.get(position);
    }

    public void setSatay(Satay satay){
        satays.add(satay);
    }

    public Order getOrder(){
        return order;
    }

    public int getSatayArraylistSize(){
        return satays.size();
    }


}
