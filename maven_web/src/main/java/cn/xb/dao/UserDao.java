package cn.xb.dao;

import cn.xb.bean.User;
import cn.xb.utils.DBUtils;

import java.util.Date;
import java.util.List;

public class UserDao {

    public Integer selectUserNameCount(String username) {
        String sql = "select count(*) from tb_user where User_name = ?";

        return DBUtils.getCount(sql,username);
    }

    public Integer selectUserIdCount(Integer id) {
        String sql = "select count(*) from tb_user where User_id = ?";

        return DBUtils.getCount(sql,id);
    }

    public boolean saveUser(User user) {
        String sql = "insert into tb_user(User_name,User_password,User_createtime)" +
                " values(?,?,?)";

        return DBUtils.save(sql,user.getName(),user.getPassword(),user.getCreatetime());

    }

    public User getUserByNameAndPass(String username, String password) {
        String sql = "select User_id id,User_name name," +
                "User_password password,User_headpic headpic,User_createtime createtime" +
                " from tb_user where User_name = ? and User_password = ?";

        return DBUtils.getSingleObj(User.class,sql,username,password);

    }

    public User getUserByName(String username) {
        String sql = "select User_id id,User_name name," +
                "User_password password,User_headpic headpic,User_createtime createtime" +
                " from tb_user where User_name = ?";

        return DBUtils.getSingleObj(User.class,sql,username);

    }

    public List<User> getUserList() {
        String sql = "select User_id id,User_name name,User_password password,User_headpic headpic,User_createtime createtime from tb_user";

        return DBUtils.getList(User.class,sql,null);

    }

    public boolean UpdateUser(User user) {
        String sql = "update tb_user set User_name = ?,User_password = ?,User_createtime = ? where User_id = ?";
        boolean flag = DBUtils.update(sql,user.getName(),user.getPassword(),user.getCreatetime(),user.getId());
        return flag;
    }

    public boolean DeleteUser(Integer id) {
        String sql = "delete from tb_user where User_id = ?";
        boolean flag = DBUtils.update(sql,id);
        return flag;
    }

    public User getUserById(Integer uid) {
        String sql = "select User_id id,User_name name," +
                "User_password password,User_headpic headpic,User_createtime createtime" +
                " from tb_user where User_id = ?";

        return DBUtils.getSingleObj(User.class,sql,uid);
    }
}
