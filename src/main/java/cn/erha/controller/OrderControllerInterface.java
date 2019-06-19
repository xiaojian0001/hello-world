package cn.erha.controller;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import cn.erha.pojo.Order;

public interface OrderControllerInterface {

  public String queryMyOrder(HttpSession session,Model model);

  public String goOrderAdd(HttpSession session,Model model);	
 
  public String addOrder(HttpSession session,Order order);
  
  public String deleteOrder(String orderId );
  
  
  
  
}
