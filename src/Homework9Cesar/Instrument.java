package Homework9Cesar;

/**
 * Created by amikhalnyuk on 01.04.2016.
 */
public abstract class Instrument implements Comparable {
    private String name;
    private int price;

    public Instrument (String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object object) {
        Instrument entry = (Instrument) object;

        int result = name.compareTo(entry.name);
        if (result !=0) {
            return result;
        }

        result = price - entry.price;

        if (result != 0) {
            return (int) result / Math.abs( result );
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
