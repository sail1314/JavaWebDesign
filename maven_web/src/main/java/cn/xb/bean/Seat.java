package cn.xb.bean;

public class Seat {
    private Integer id;
    private String list;

    public Seat() {
    }

    public Seat(Integer id, String list) {
        this.id = id;
        this.list = list;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", list='" + list + '\'' +
                '}';
    }
}
