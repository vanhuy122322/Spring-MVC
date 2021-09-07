
 package com.chuvanhuy.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chuvanhuy.model.Cart;
import com.chuvanhuy.service.CartService;


@Controller
 public class CartController {
	private CartService cartService;
	@Autowired(required = true)
	@Qualifier(value = "cartService")
	public void setCartService(CartService cr) {
		this.cartService = cr;
	}

	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String CartModel(Model model) {
	
	return "cart/cart";
	}
	@RequestMapping(value = "AddCart/{id}")
	public String AddCart(HttpServletRequest request,HttpSession session,@PathVariable int id ) {
	HashMap<Integer,Cart> cart=(HashMap<Integer,Cart>)session.getAttribute("Cart");
	if(cart==null) {
		cart=new HashMap<Integer,Cart>();
	}
	cart=cartService.AddCart(id, cart);
	session.setAttribute("Cart", cart);
	session.setAttribute("TotalQuantyCart", cartService.TotalQuanty(cart));
	session.setAttribute("TotalPriceCart", cartService.TotalPrice(cart));
	return "redirect:" +request.getHeader("Referer");
	}
	@RequestMapping(value = "EditCart/{id}")
		public String EditCart(HttpServletRequest request,HttpSession session,@PathVariable int id,@PathVariable int quanty ) {
			HashMap<Integer,Cart> cart=(HashMap<Integer,Cart>)session.getAttribute("Cart");
			if(cart==null) {
				cart=new HashMap<Integer,Cart>();
			}
			
			 cart=cartService.EditCart(id, quanty, cart);
					 session.setAttribute("Cart",cart); 
			 session.setAttribute("TotalQuantyCart",cartService.TotalQuanty(cart));
			   session.setAttribute("TotalPriceCart",
			 cartService.TotalPrice(cart));
			 
			return "redirect:" +request.getHeader("Referer");
	}
		@RequestMapping(value = "DeleteCart/{id}")
			public String DeleteCart(HttpServletRequest request,HttpSession session,@PathVariable int id ) {
				HashMap<Integer,Cart> cart=(HashMap<Integer,Cart>)session.getAttribute("Cart");
				if(cart==null) {
					cart=new HashMap<Integer,Cart>();
				}
				cart=cartService.DeleteCart(id, cart);
				session.setAttribute("Cart", cart);
				session.setAttribute("TotalQuantyCart", cartService.TotalQuanty(cart));
				session.setAttribute("TotalPriceCart", cartService.TotalPrice(cart));
				return "redirect:" +request.getHeader("Referer");
		}
}