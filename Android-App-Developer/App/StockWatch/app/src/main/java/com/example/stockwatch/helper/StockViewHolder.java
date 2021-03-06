package com.example.stockwatch.helper;

import android.view.View;
import android.widget.TextView;

import com.example.stockwatch.R;

import androidx.recyclerview.widget.RecyclerView;

public class StockViewHolder extends RecyclerView.ViewHolder {
    TextView symbol;
    TextView company;
    TextView price;
    TextView todayPriceChange;
    TextView todayPercentChange;

    StockViewHolder(View view){
        super(view);
        symbol = view.findViewById(R.id.symbol);
        company = view.findViewById(R.id.company);
        price = view.findViewById(R.id.price);
        todayPriceChange = view.findViewById(R.id.priceChange);
        todayPercentChange = view.findViewById(R.id.percentChange);
    }
}
