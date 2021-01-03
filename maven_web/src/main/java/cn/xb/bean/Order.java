package cn.xb.bean;

public class Order {
    private Integer id;
    private Integer position;
    private String code;
    private Integer uid;
    private Integer fid;
    private Integer cid;
    private Integer lid;

    public Order() {
    }

    public Order(Integer id, Integer position, String code, Integer uid, Integer fid, Integer cid, Integer lid) {
        this.id = id;
        this.position = position;
        this.code = code;
        this.uid = uid;
        this.fid = fid;
        this.cid = cid;
        this.lid = lid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", position=" + position +
                ", code='" + code + '\'' +
                ", uid=" + uid +
                ", fid=" + fid +
                ", cid=" + cid +
                ", lid=" + lid +
                '}';
    }
}
