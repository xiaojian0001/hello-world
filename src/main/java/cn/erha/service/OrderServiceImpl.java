package cn.erha.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.erha.mapper.OrderMapper;
import cn.erha.pojo.Order;


@Service
public class OrderServiceImpl implements OrderServiceInterface{
   @Autowired
	private OrderMapper orderMapper;
   
	public List<Order> queryMyOrder( String userId) {
		return orderMapper.queryOrder(userId);
	}

	
	public void addOrder(Order order) {
		order.setOrderid(UUID.randomUUID().toString());
		order.setOrdertime(new Date());
		order.setOrderpaystate(0);
		orderMapper.saveOrder(order);
	}


	
	public void deleteOrder(String orderId) {
		
		orderMapper.deleteOrder(orderId);
	}

	

}
