package cn.erha.service;

import java.util.List;

import cn.erha.pojo.Order;

public interface CartServiceInterface {

	List<Order> queryMyCart(String userId);

	

}
