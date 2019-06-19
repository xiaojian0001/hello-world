package cn.erha.service;

import java.util.List;

import cn.erha.pojo.Order;

public interface OrderServiceInterface {

	public List<Order> queryMyOrder(String userId);

	public void addOrder(Order order);

	public void deleteOrder(String orderId);

	
}
