package web.model;

public class Car {

    private String mark;
    private String model;
    private String number;

    public Car() {}

    public Car(String mark, String model, String number) {
        this.mark = mark;
        this.model = model;
        this.number = number;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
