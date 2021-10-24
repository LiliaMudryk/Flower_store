package flowers;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.Arrays;

@Setter@Getter
public class Flower extends Item{
    private double price;
    private double sepalLength;
    private  FlowerType flowerType;
    private int[] color;
    public Flower(FlowerType flowerType,double price,int[] color,double sepalLength){
        this.price = price;
        this.flowerType = flowerType;
        this.color = color;
        this.sepalLength = sepalLength;

    }
    public FlowerType getFlowerType() {
        return flowerType;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Flower. Details: "+flowerType+", sepal length: "+sepalLength+", color: "+Arrays.toString(color)+".\nFlower price "+getPrice();
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


}
