package cn.cdw.demo.pojo;

import java.util.List;

/**
 * @author DW-CHEN
 */

public class Card {
    private Integer id;
    private String number;

    private Persion persion;

    public Card() {
    }

    public Card(Integer id, String number, Persion persion) {
        this.id = id;
        this.number = number;
        this.persion = persion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Persion getPersion() {
        return persion;
    }

    public void setPersion(Persion persion) {
        this.persion = persion;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", persion=" + persion +
                '}';
    }
}
