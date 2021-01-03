package cn.xb.bean;

import java.util.Date;

public class Film {
    private Integer id;
    private String name;
    private String detail;
    private Integer price;
    private String pic;
    private Date release_date;
    private Integer sold_number;
    private Integer viewing_count;

    public Film() {
    }

    public Film(Integer id, String name, String detail, Integer price, String pic, Date release_date, Integer sold_number, Integer viewing_count) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.price = price;
        this.pic = pic;
        this.release_date = release_date;
        this.sold_number = sold_number;
        this.viewing_count = viewing_count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public Integer getSold_number() {
        return sold_number;
    }

    public void setSold_number(Integer sold_number) {
        this.sold_number = sold_number;
    }

    public Integer getViewing_count() {
        return viewing_count;
    }

    public void setViewing_count(Integer viewing_count) {
        this.viewing_count = viewing_count;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                ", price=" + price +
                ", pic='" + pic + '\'' +
                ", release_date=" + release_date +
                ", sold_number=" + sold_number +
                ", viewing_count=" + viewing_count +
                '}';
    }
}
