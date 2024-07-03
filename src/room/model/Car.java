package room.car;

public class Car {

    //mas 1
    private String maknish;
    private String color;
    private int date;
    private String numbers;

    public Car(String name, int date, String color, String numbers) {
        this.maknish = name;
        this.date = date;
        this.color = color;
        this.numbers = numbers;
    }


    public String getMaknish() {
        return maknish;
    }

    public void setMaknish(String maknish) {
        this.maknish = maknish;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void print() {
        System.out.println("maknish: " + getMaknish());
        System.out.println("color: " + getColor());
        System.out.println("date: " + getDate());
        System.out.println("numbers: " + getNumbers());
    }

}
