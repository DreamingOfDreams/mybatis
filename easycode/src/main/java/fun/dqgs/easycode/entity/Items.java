package fun.dqgs.easycode.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Items)实体类
 *
 * @author makejava
 * @since 2019-06-28 14:55:10
 */
public class Items implements Serializable {
    private static final long serialVersionUID = -70348119564710686L;
    
    private Integer id;
    //商品名称
    private String name;
    //商品定价
    private Object price;
    //商品描述
    private String detail;
    //商品图片
    private String pic;
    //生产日期
    private Date createtime;
    
    private String flag;


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

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                ", pic='" + pic + '\'' +
                ", createtime=" + createtime +
                ", flag='" + flag + '\'' +
                '}';
    }
}