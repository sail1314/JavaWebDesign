package cn.xb.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login.do")
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static int WIDTH=200;
    private static int HEIGHT=50;
    private static BufferedImage image;
    public MyServlet() {}
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("image/jpeg");
        generateComfirImg();
        fillNumber(4,request);
        preventImgRec();
        //输出到客户端
        ImageIO.write(image, "jpg", response.getOutputStream());

    }


    private void generateComfirImg() {
        //创建图片对象
        image=new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_3BYTE_BGR);
        Graphics graphics=image.getGraphics();
        //填充图片背景色
        graphics.setColor(new Color(240,255,240));
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        //填充图片边框颜色
        graphics.setColor(new Color(187,255,255));
        graphics.drawRect(1, 1, WIDTH-2, HEIGHT-2);

    }

    //向图片中插入count个字符
    private void fillNumber(int count , HttpServletRequest request) {
        //旋转图片中的文字需要Graphics2D对象
        Graphics2D graphics=(Graphics2D) image.getGraphics();
        graphics.setColor(new Color(100,149,237));
        graphics.setFont(new Font("Times New Roman", Font.BOLD+ Font.ITALIC, 30));

        //备选字符集
        final String string="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz";

        Random random=new Random();

        //向图片写入字符的开始位置
        int x=20,y=40;

        StringBuffer yzm = new StringBuffer();

        //便于改变生成验证码的个数
        int move=(WIDTH-20)/count;
        for (int i = 0; i < count; i++) {
            //从所有的字符集中随机选择一个字符
            int pos=random.nextInt(string.length());
            int degree=random.nextInt()%25;   //随机-25~25度数
            graphics.rotate(degree*Math.PI/180, x, y);  //将度数转化为弧度

            graphics.drawString(string.charAt(pos)+"",x , y);
            yzm.append(string.charAt(pos));
            graphics.rotate(-degree*Math.PI/180, x, y);   //每次旋转后恢复
            //x坐标向右移动
            x+=move;
        }

        request.getSession().setAttribute("yzm",yzm.toString());
    }


    //防止图片识别技术
    private void preventImgRec() {
        Graphics graphics=image.getGraphics();
        graphics.setColor(new Color(100,149,237));
        graphics.setFont(new Font("Times New Roman", Font.BOLD+ Font.ITALIC, 30));
        int n=6;
        Random random=new Random();
        int startX,startY;
        int endX,endY;
        for (int i = 0; i < n; i++) {
            startX=random.nextInt(WIDTH);
            endX=random.nextInt(WIDTH);
            startY=random.nextInt(HEIGHT);
            endY=random.nextInt(HEIGHT);

            graphics.drawLine(startX, startY, endX, endY);
        }

    }
}

