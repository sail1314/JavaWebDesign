package cn.xb.dao;

import cn.xb.bean.Manager;
import cn.xb.bean.User;
import cn.xb.utils.DBUtils;

public class ManagerDao {
    public Manager geManagerByNameAndPass(String username, String password) {
        String sql = "select Manager_id id,Manager_name name," +
                "Manager_password password from tb_manager where Manager_name = ? and Manager_password = ?";

        return DBUtils.getSingleObj(Manager.class,sql,username,password);

    }
}
