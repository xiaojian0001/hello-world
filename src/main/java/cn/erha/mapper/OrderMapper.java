package cn.erha.mapper;

import java.util.Date;
import java.util.List;

import cn.erha.pojo.Order;

public interface OrderMapper {


	List<Order> queryOrder(String userId);


	void saveOrder(Order order);


	void deleteOrder(String orderId);


	void orderOTDelete(Date oTime);

	
}
