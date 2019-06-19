package cn.erha.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.erha.pojo.Order;
import cn.erha.service.CartServiceInterface;
import cn.erha.service.OrderServiceInterface;
@Controller
@RequestMapping("order")
public class OrderController implements OrderControllerInterface {
    @Autowired
    private OrderServiceInterface orderService;
	@RequestMapping(value="list",method=RequestMethod.GET)
    public String queryMyOrder(HttpSession session, Model model) {
		//通过session获取用户ID
		String userId = (String)session.getAttribute("userId");
	  //通过userId查询订单
		List<Order> orderlist = orderService.queryMyOrder(userId);
	   //使用model将数据返回
	   model.addAttribute("orderlist", orderlist);
	   System.out.println(orderlist);
	 return "order_list";
	}
    @Autowired
    private CartServiceInterface cartService;
	@RequestMapping("order-cart")
	public String goOrderAdd(HttpSession session, Model model) {
		String userId=(String) session.getAttribute("userId");
		List<Order> cartList= cartService.queryMyCart(userId);
		model.addAttribute("cartList", cartList);
		 return "order_add";
	}
	@RequestMapping("addOrder")
	public String addOrder(HttpSession session,Order order){
		String userId=(String)session.getAttribute("userId");
		order.setUserid(userId);
		orderService.addOrder(order);
		return "redirect:/order/list";
	}
	@RequestMapping("deleteOrder/{orderId}")
	public String deleteOrder(@PathVariable String orderId) {
		orderService.deleteOrder(orderId);
		
		return "redirect:/order/list";
	}
	
	

}
