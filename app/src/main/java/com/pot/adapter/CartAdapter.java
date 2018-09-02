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

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartVH> {

    private List<Food> list;
    private Context context;

    public CartAdapter(Context context, List<Food> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public CartVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_cart, parent, false);
        return new CartVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CartVH holder, final int position) {
        holder.txtFoodName.setText(list.get(position).getFoodName());
        holder.imgFood.setImageResource(list.get(position).getFoodImg());
        holder.txtAmount.setText("₹ " + list.get(position).getAmount());
        holder.txtQuantity.setText(list.get(position).getQuantity()+"");
        holder.txtMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (list.get(position).getQuantity() > 1) {
                    list.get(position).setQuantity(list.get(position).getQuantity() - 1);
                    holder.txtQuantity.setText(list.get(position).getQuantity() + "");
                } else if (list.get(position).getQuantity() == 1) {
                    list.remove(position);
                    notifyDataSetChanged();
                }
            }
        });

        holder.txtPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.get(position).setQuantity(list.get(position).getQuantity() + 1);
                holder.txtQuantity.setText(list.get(position).getQuantity() + "");
            }
        });

        holder.imgCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.remove(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CartVH extends RecyclerView.ViewHolder {
        private ImageView imgFood, imgCancel;
        private TextView txtAmount, txtFoodName, txtMinus, txtPlus, txtQuantity;
        private RelativeLayout rlAddToCart;

        public CartVH(View itemView) {
            super(itemView);
            imgFood = (ImageView) itemView.findViewById(R.id.imgFood);
            imgCancel = (ImageView) itemView.findViewById(R.id.imgCancel);
            txtFoodName = (TextView) itemView.findViewById(R.id.txtFoodName);
            txtAmount = (TextView) itemView.findViewById(R.id.txtAmount);
            txtMinus = (TextView) itemView.findViewById(R.id.txtMinus);
            txtPlus = (TextView) itemView.findViewById(R.id.txtPlus);
            txtQuantity = (TextView) itemView.findViewById(R.id.txtQuantity);
            rlAddToCart = (RelativeLayout) itemView.findViewById(R.id.rlAddToCart);
        }
    }
}
