package com.beanfactory.yashp.realtimerecyclercards;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {


    private Context mCtx;
    private List<Product> productList;

    public ProductAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        Product product = productList.get(position);
        holder.titleText.setText(product.getTitle());
        holder.descText.setText(product.getDesc());
        holder.ratingText.setText(String.valueOf(product.getRating()));

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView titleText, descText, ratingText;


        public ProductViewHolder(View itemView) {
            super(itemView);

            titleText = itemView.findViewById(R.id.titleText);
            descText = itemView.findViewById(R.id.descText);
            ratingText = itemView.findViewById(R.id.ratingText);
        }
    }


}
