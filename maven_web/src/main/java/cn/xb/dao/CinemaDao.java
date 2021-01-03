package cn.xb.dao;

import cn.xb.bean.Cinema;
import cn.xb.bean.Layout;
import cn.xb.bean.User;
import cn.xb.utils.DBUtils;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public class CinemaDao {

    public List<Cinema> getCinemaList() {
        String sql = "select Cinema_id id,Cinema_name name,Cinema_address address from tb_cinema";

        return DBUtils.getList(Cinema.class,sql,null);
    }

    public Cinema getCinemabyId(Integer id) {
        String sql = "select Cinema_id id,Cinema_name name," +
                "Cinema_address address from tb_cinema where Cinema_id = ?";


        return DBUtils.getSingleObj(Cinema.class,sql,id);
    }
}
