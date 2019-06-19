package cn.erha.pojo;

public class OrderItem {
   
	private Long id;
	private String orderid;
	private String carid;
	private Integer num;
	private String carimgurl;
	private String carname;
	private Double carprice;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getCarid() {
		return carid;
	}
	public void setCarid(String carid) {
		this.carid = carid;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	
	public String getCarimgurl() {
		return carimgurl;
	}
	public void setCarimgurl(String carimgurl) {
		this.carimgurl = carimgurl;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public Double getCarprice() {
		return carprice;
	}
	public void setCarprice(Double carprice) {
		this.carprice = carprice;
	}
	
	
	
	
}
