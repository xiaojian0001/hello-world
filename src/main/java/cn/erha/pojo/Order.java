package cn.erha.pojo;

import java.util.Date;
import java.util.List;

public class Order {
   private String orderid;
   private Double ordermoney;
   private String orderreceiverinfo;
   private Integer orderpaystate;
   private Date ordertime;
   private String userid;
   
   private List<OrderItem> orderItems;

public String getOrderid() {
	return orderid;
}

public void setOrderid(String orderid) {
	this.orderid = orderid;
}

public Double getOrdermoney() {
	return ordermoney;
}

public void setOrdermoney(Double ordermoney) {
	this.ordermoney = ordermoney;
}

public String getOrderreceiverinfo() {
	return orderreceiverinfo;
}

public void setOrderreceiverinfo(String orderreceiverinfo) {
	this.orderreceiverinfo = orderreceiverinfo;
}

public Integer getOrderpaystate() {
	return orderpaystate;
}

public void setOrderpaystate(Integer orderpaystate) {
	this.orderpaystate = orderpaystate;
}

public Date getOrdertime() {
	return ordertime;
}

public void setOrdertime(Date ordertime) {
	this.ordertime = ordertime;
}

public String getUserid() {
	return userid;
}

public void setUserid(String userid) {
	this.userid = userid;
}

public List<OrderItem> getOrderItems() {
	return orderItems;
}

public void setOrderItems(List<OrderItem> orderItems) {
	this.orderItems = orderItems;
}


}
