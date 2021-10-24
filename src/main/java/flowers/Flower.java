package flowers;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.Arrays;

@Setter@Getter
public class Flower {
    private double price;
    private double sepalLength;
    private  FlowerType flowerType;
    private int[] color;

    public FlowerType getFlowerType() {
        return flowerType;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(int[] color){
        this.color = Arrays.copyOf(color,color.length);

    }

    public int[] getColor() {
        return color;
    }

    public double getSepalLength() {
        return sepalLength;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSepalLength(double sepalLength) {
        this.sepalLength = sepalLength;
    }

    public Flower(FlowerType flowerType){
        this.flowerType=flowerType;
    }
}
