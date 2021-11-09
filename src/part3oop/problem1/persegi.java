package part3oop.problem1;

public class persegi extends bangundatar{
    int sisi;
    public  persegi(int sisi){
        this.sisi=sisi;
    }
    public float keliling(){
        return this.sisi * 4;
    }
    public float luas(){
        return this.sisi * this.sisi;
    }

}
