package com.example.nas.foodordernavtab;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.support.design.widget.CollapsingToolbarLayout;
import android.widget.Toast;

import com.example.nas.foodordernavtab.Adapter.CartAdapterAku;
//import com.example.nas.foodordernavtab.Data.SharedPreference;
import com.example.nas.foodordernavtab.ItemCollection.Controller;
import com.example.nas.foodordernavtab.ItemCollection.Order;
import com.example.nas.foodordernavtab.ItemCollection.Satay;

import java.util.ArrayList;

import static com.example.nas.foodordernavtab.SatayFragment.sataylist;

public class DetailActivity extends AppCompatActivity {

    CollapsingToolbarLayout collapsingToolbarLayout;
    String nama;
    ArrayList<Order> orders = new ArrayList<>();
    CartAdapterAku adapterAku;
//    SharedPreference pref;
    Controller cl = (Controller) getApplicationContext();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView txtNama = (TextView) findViewById(R.id.txtNama);
        TextView txtHarga = (TextView) findViewById(R.id.txtHarga);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapse);

//        Bundle b = getIntent().getBundleExtra("makan");
//        final String nama = b.getString("nama");
//        Double harga = b.getDouble("harga");
//        final int pos = b.getInt("position");

        Bundle b = getIntent().getExtras();
        int pos = b.getInt("pos");

        Satay satay = sataylist.get(pos);

        txtNama.setText(satay.getNamaSatay());
        txtHarga.setText(String.format("RM" + "%.2f", satay.getHargaSatay()));
        collapsingToolbarLayout.setTitle(nama);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.btnCart);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                Satay satayObject = cl.getSatay(pos);
//
//
//                if(!cl.getOrder().CheckProductInCart(satayObject)){
//
//                    cl.getOrder().setProducts(satayObject);
//
//                    Snackbar.make(view, "Item added to cart", Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();
//
//                }


                /// third try..
//                String tag = button.getTag().toString();
//                if (tag.equalsIgnoreCase("grey")) {
//                    sharedPreference.addFavorite(activity, products.get(position));
//                    Toast.makeText(activity,
//                            activity.getResources().getString(R.string.add_favr),
//                            Toast.LENGTH_SHORT).show();
//
//                    button.setTag("red");
//                    button.setImageResource(R.drawable.ic_brightness_5_black_24dp);
//                } else {

//                pref.addOrder(DetailActivity.this, nama);

                //// first try..
//                SharedPreference prefs = PreferenceManager.getDefaultSharedPreferences(DetailActivity.this);
//                SharedPreference.Editor editor = prefs.edit();
//                editor.putString("nama", nama); //InputString: from the EditText
//                editor.apply();


                //// second try..
//                Order cart = new Order();
//                cart.setNama(nama);
//                orders.add(cart);
//                adapterAku.notifyDataSetChanged(orders);


//                Intent i = new Intent(DetailActivity.this, CartActivity.class);
//                startActivity(i);
            }
        });


    }
}
