/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class DigitalExtractor {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getOnes() {
        return (num % 10) ;
    }

    public int getTens() {
        return (num % 100) / 10;
    }

    public int getHundreds() {
        return num / 100;
    }

    public int getDigitCount() {
        int count = 0;
        int tempNum=num;
        while (tempNum != 0) {
            tempNum /= 10;
            count++;
        }
        return count;
    }

}
