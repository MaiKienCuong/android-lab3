package maikiencuong.lab3;

import java.io.Serializable;

public class SmartPhone implements Serializable {
    private String phoneName;
    private int review;
    private double price;
    private double discountPrice;
    private int image;

    public SmartPhone(String phoneName, int review, double price, double discountPrice, int image) {
        this.phoneName = phoneName;
        this.review = review;
        this.price = price;
        this.discountPrice = discountPrice;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
}

