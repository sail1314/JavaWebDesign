package cn.xb.bean;

import java.util.Date;

public class Layout {
    private Integer id;
    private String name;
    private String language;
    private Date time;
    private Integer cid;
    private Integer fid;

    public Layout() {
    }

    public Layout(Integer id, String name, String language, Date time, Integer cid, Integer fid) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.time = time;
        this.cid = cid;
        this.fid = fid;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Override
    public String toString() {
        return "Layout{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", time=" + time +
                ", cid=" + cid +
                ", fid=" + fid +
                '}';
    }
}
