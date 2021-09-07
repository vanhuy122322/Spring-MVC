package com.chuvanhuy.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chuvanhuy.model.Cart;
import com.chuvanhuy.model.Product;

import com.chuvanhuy.service.ProductService;
@Controller
public class AdminController {
	
	
	private ProductService productService;
	@Autowired(required = true)
	@Qualifier(value = "productService")
	public void setProductService(ProductService pr) {
		this.productService = pr;
	}
	@RequestMapping(value = "admin", method = RequestMethod.GET)
	public String Productsadmin(Model model) {
		
	return "admin/admin";
	}
	@RequestMapping(value ="/admin-product", method = RequestMethod.GET)
	public String ProductsAdminProduct(Model model) {
		model.addAttribute("allproduct", this.productService.listAllProduct());
	return "admin/admin-product";
	}
	@RequestMapping(value ="/admin-product", method = RequestMethod.POST)
	public String ProduAdminProduct(Model model) {
		model.addAttribute("allproduct", this.productService.listAllProduct());
	return "admin/admin-product";
	}
	@RequestMapping(value ="delete/{id}")
	public ModelAndView Delete(@PathVariable("id") int id) {
		ModelAndView mv=new ModelAndView("admin/admin-product");
		
		this.productService.DeleteProduct(id);
		((Model) mv).addAttribute("allproduct", this.productService.listAllProduct());
		
	return mv;
	}
	
	@RequestMapping(value ="edit/{id}")
	public String Edit(@PathVariable("id") int id,Model model) {
		model.addAttribute("product", this.productService.getProductById(id));
		model.addAttribute("allproduct", this.productService.listAllProduct());
	
		
	return "admin/edit-product";
	}

	@RequestMapping(value ="/admin-add", method = RequestMethod.GET)
	public String ProductsAddProduct(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("addproduct", this.productService.listAllProduct());
	return "admin/admin-add";
	}
	
	
	@RequestMapping(value ="/admin-add", method = RequestMethod.POST)
	public String AddProduct(Model model,@PathVariable("product") Product p) {
		this.productService.AddProduct(p);
		model.addAttribute("allproduct", this.productService.listAllProduct());
		
	return "admin/admin-add";
	}
}
