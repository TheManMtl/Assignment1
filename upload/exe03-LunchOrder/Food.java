/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class Food {

    private float price;
    private float  fat;
    private float carbohydrate;
    private float fiber;

    public Food(float price,
                float fat,
                float carbohydrate,
                float fiber) {
        this.price = price;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
        this.fiber = fiber;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(float carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public float getFiber() {
        return fiber;
    }

    public void setFiber(float fiber) {
        this.fiber = fiber;
    }
}
