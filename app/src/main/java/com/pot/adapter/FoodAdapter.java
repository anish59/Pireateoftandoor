package com.pot.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pot.R;
import com.pot.model.Food;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodVH> {

    private List<Food> list;
    private Context context;

    public FoodAdapter(Context context, List<Food> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public FoodVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_food, parent, false);
        return new FoodVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final FoodVH holder, final int position) {
        holder.txtFoodName.setText(list.get(position).getFoodName());
        holder.imgFood.setImageResource(list.get(position).getFoodImg());
        holder.txtAmount.setText("₹ " + list.get(position).getAmount());
        if (list.get(position).getQuantity() > 0) {
            holder.llAddToCart.setVisibility(View.GONE);
            holder.rlAddToCart.setVisibility(View.VISIBLE);
        } else {
            holder.llAddToCart.setVisibility(View.VISIBLE);
            holder.rlAddToCart.setVisibility(View.GONE);
        }
        holder.llAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.llAddToCart.setVisibility(View.GONE);
                holder.rlAddToCart.setVisibility(View.VISIBLE);
                holder.txtQuantity.setText("1");
                list.get(position).setQuantity(1);
            }
        });
        holder.txtMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(list.get(position).getQuantity()>1){
                    list.get(position).setQuantity(list.get(position).getQuantity()-1);
                    holder.txtQuantity.setText(list.get(position).getQuantity()+"");
                }else if(list.get(position).getQuantity() == 1){
                    list.get(position).setQuantity(0);
                    holder.txtQuantity.setText("0");
                    holder.rlAddToCart.setVisibility(View.GONE);
                    holder.llAddToCart.setVisibility(View.VISIBLE);
                }
            }
        });

        holder.txtPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.get(position).setQuantity(list.get(position).getQuantity()+1);
                holder.txtQuantity.setText(list.get(position).getQuantity()+"");
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class FoodVH extends RecyclerView.ViewHolder {
        private ImageView imgFood;
        private TextView txtAmount, txtFoodName, txtMinus, txtPlus, txtQuantity;
        private LinearLayout llAddToCart;
        private RelativeLayout rlAddToCart;

        public FoodVH(View itemView) {
            super(itemView);
            imgFood = (ImageView) itemView.findViewById(R.id.imgFood);
            txtFoodName = (TextView) itemView.findViewById(R.id.txtFoodName);
            txtAmount = (TextView) itemView.findViewById(R.id.txtAmount);
            txtMinus = (TextView) itemView.findViewById(R.id.txtMinus);
            txtPlus = (TextView) itemView.findViewById(R.id.txtPlus);
            txtQuantity = (TextView) itemView.findViewById(R.id.txtQuantity);
            llAddToCart = (LinearLayout) itemView.findViewById(R.id.llAddToCart);
            rlAddToCart = (RelativeLayout) itemView.findViewById(R.id.rlAddToCart);
        }
    }
}
