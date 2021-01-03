package cn.xb.dao;

import cn.xb.bean.Film;
import cn.xb.bean.Layout;
import cn.xb.bean.User;
import cn.xb.utils.DBUtils;

import java.util.Date;
import java.util.List;

public class LayoutDao {
    public List<Layout> getLayoutList() {
        String sql = "select Lay_id id,Lay_name name,Lay_language language," +
                "Lay_time time,Cinema_id cid,Film_id fid from tb_layout";

        return DBUtils.getList(Layout.class,sql,null);
    }

    public List<Layout> getLayoutListbyCinemaId(Integer cid) {
        String sql = "select Lay_id id,Lay_name name,Lay_language language," +
                "Lay_time time,Cinema_id cid,Film_id fid from tb_layout where Cinema_id = ?";

        return DBUtils.getList(Layout.class,sql,cid);
    }

    public Layout getLayoutbyId(Integer lid) {
            String sql = "select Lay_id id,Lay_name name,Lay_language language," +
                    "Lay_time time,Cinema_id cid,Film_id fid from tb_layout where Lay_id = ?";

            return DBUtils.getSingleObj(Layout.class,sql,lid);
    }
}
