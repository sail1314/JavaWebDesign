package cn.xb.dao;

import cn.xb.bean.Film;
import cn.xb.bean.Order;
import cn.xb.bean.User;
import cn.xb.utils.DBUtils;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.List;

public class OrderDao {
    public List<Order> getOrderList() {
        String sql = "select Order_id id,Order_position position,Order_code code,User_id uid," +
                "Film_id fid,Cinema_id cid,Lay_id lid from tb_order";


        return DBUtils.getList(Order.class,sql,null);
    }

    public List<Order> getOrderbyUid(Integer id) {
        String sql = "select Order_id id,Order_position position,Order_code code,User_id uid," +
                "Film_id fid,Cinema_id cid,Lay_id lid "+
                " from tb_order where User_id = ?";

        return DBUtils.getList(Order.class,sql,id);
    }
    public Order getOrderByCode(String code) {
        String sql = "select Order_id id,Order_position position,Order_code code,User_id uid," +
                "Film_id fid,Cinema_id cid,Lay_id lid from tb_order where Order_code = ?";

        return DBUtils.getSingleObj(Order.class,sql,code);

    }

    public Integer selectOrderCodeCount(String code) {
        String sql = "select count(*) from tb_order where Order_code = ?";

        return DBUtils.getCount(sql,code);
    }

    public boolean saveOrder(Order order) {
        String sql = "insert into tb_order(Order_id,Order_position,Order_code,User_id," +
                "Film_id,Cinema_id,Lay_id)" +
                " values(?,?,?,?,?,?,?)";

        return DBUtils.save(sql,order.getId(),order.getPosition(),order.getCode(),order.getUid(),order.getFid(),order.getCid(),order.getLid());
    }
}
