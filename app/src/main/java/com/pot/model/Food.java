package com.pot.model;

public class Food {
    private int FoodImg;
    private String FoodName;
    private float Amount;
    private int Quantity;

    public Food(int foodImg, String foodName, float amount, int quantity) {
        FoodImg = foodImg;
        FoodName = foodName;
        Amount = amount;
        Quantity = quantity;
    }

    public int getFoodImg() {
        return FoodImg;
    }

    public void setFoodImg(int foodImg) {
        FoodImg = foodImg;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        FoodName = foodName;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float amount) {
        Amount = amount;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
