package cn.xb.dao;

import cn.xb.bean.Film;
import cn.xb.bean.User;
import cn.xb.utils.DBUtils;

import java.util.Date;
import java.util.List;

public class FilmDao {
    public List<Film> getFilmList() {
        String sql = "select Film_id id,Film_name name,Film_detail detail," +
                "Film_price price,Film_pic pic,Film_release_date release_date," +
                "Film_sold_number sold_number,Film_viewing_count viewing_count from tb_film";

        return DBUtils.getList(Film.class,sql,null);

    }

    public Integer selectFilmNameCount(String name) {
        String sql = "select count(*) from tb_film where Film_name = ?";

        return DBUtils.getCount(sql,name);
    }

    public boolean saveFilm(Film film) {
        String sql = "insert into tb_film(Film_name,Film_detail,Film_price,Film_pic,Film_release_date,Film_sold_number,Film_viewing_count)" +
                " values(?,?,?,?,?,?,?)";

        return DBUtils.save(sql,film.getName(),film.getDetail(),film.getPrice(),film.getPic(),film.getRelease_date(),film.getSold_number(),film.getViewing_count());
    }

    public Integer selectFilmIdCount(Integer id) {
        String sql = "select count(*) from tb_film where Film_id = ?";

        return DBUtils.getCount(sql,id);
    }

    public boolean UpdateFilm(Film film) {
        String sql = "update tb_film set Film_name = ?,Film_detail = ?,Film_price = ?,Film_pic = ?,Film_release_date = ? where Film_id = ?";
        boolean flag = DBUtils.update(sql,film.getName(),film.getDetail(),film.getPrice(),film.getPic(),film.getRelease_date(),film.getId());
        return flag;
    }

    public boolean DeleteUser(String name) {
        String sql = "delete from tb_film where Film_name = ?";
        boolean flag = DBUtils.update(sql,name);
        return flag;
    }

    public Film getFilmByName(String name) {
        String sql = "select Film_id id,Film_name name," +
                "Film_detail detail,Film_price price,Film_pic pic" +
                ",Film_release_date release_date,Film_sold_number sold_number," +
                "Film_viewing_count viewing_count from tb_film where Film_name = ?";

        return DBUtils.getSingleObj(Film.class,sql,name);
    }

    public Film getFilmById(Integer fid) {
        String sql = "select Film_id id,Film_name name," +
                "Film_detail detail,Film_price price,Film_pic pic" +
                ",Film_release_date release_date,Film_sold_number sold_number," +
                "Film_viewing_count viewing_count from tb_film where Film_id = ?";

        return DBUtils.getSingleObj(Film.class,sql,fid);
    }
}
