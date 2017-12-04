package com.example.nas.foodordernavtab.ItemCollection;

import java.util.ArrayList;

/**
 * Created by nas on 30/11/2017.
 */

public class Order {

    private ArrayList<Satay> cartItems = new ArrayList<Satay>();

    public Satay getProducts(int position){
        return cartItems.get(position);
    }

    public void setProducts(Satay satay){
        cartItems.add(satay);
    }


    public int getCartsize(){
        return cartItems.size();
    }

    public boolean CheckProductInCart(Satay asatay){
        return cartItems.contains(asatay);
    }




    ///  first try..
//    String nama;
//    Float nombor;
//    Double harga;
//
//    public Order() {
//
//    }
//
//    public String getNama() {
//        return nama;
//    }
//
//    public Float getNombor() {
//        return nombor;
//    }
//
//    public Double getHarga() {
//        return harga;
//    }
//
//    public void setNama(String nama) {
//        this.nama = nama;
//    }
//
//    public void setNombor(Float nombor) {
//        this.nombor = nombor;
//    }
//
//    public void setHarga(Double harga) {
//        this.harga = harga;
//    }
}
