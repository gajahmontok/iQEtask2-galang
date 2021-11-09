package part3oop.problem2;

public class kubus extends bangunruang{
    int sisi;
    public kubus(int sisi){
        this.sisi= sisi;
    }
    public double volume(){
        return (this.sisi * this.sisi * this.sisi);
    }
}
