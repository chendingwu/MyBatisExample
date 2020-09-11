package cn.cdw.demo.pojo;

/**
 * @author DW-CHEN
 *
 */
public class Card {
    private Integer id;
    private String Number;

    private Persion persion;

    public Card() {

    }
    public Card(Integer id, String number, Persion persion) {
        this.id = id;
        Number = number;
        this.persion = persion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
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
                ", Number='" + Number + '\'' +
                ", persion=" + persion +
                '}';
    }
}
