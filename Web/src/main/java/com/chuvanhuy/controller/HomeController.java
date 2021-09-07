package com.chuvanhuy.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.chuvanhuy.model.Product;
import com.chuvanhuy.service.BannerService;

import com.chuvanhuy.service.CategoryService;
import com.chuvanhuy.service.ProductService;
import com.chuvanhuy.service.RelateService;

@Controller
public class HomeController {

	
	private ProductService productService;
	@Autowired(required = true)
	@Qualifier(value = "productService")
	public void setProductService(ProductService pr) {
		this.productService = pr;
	}
	private RelateService relateService;
	@Autowired(required = true)
	@Qualifier(value = "relateService")
	public void setRelateService(RelateService re) {
		this.relateService = re;
	}
	private CategoryService categoryService;
	@Autowired(required = true)
	@Qualifier(value = "categoryService")
	public void setCategoryService(CategoryService ct) {
		this.categoryService = ct;
	}
	private BannerService bannerService;
	@Autowired(required = true)
	@Qualifier(value = "bannerService")
	public void setBannerService(BannerService bn) {
		this.bannerService = bn;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Productsdealsofweek(Model model) {
		model.addAttribute("products", new Product());
	model.addAttribute("dealsOfWeek", this.productService.listProductsdealsofweek());
	model.addAttribute("featuresOfWeek", this.productService.listProductsfeatureofweek());
	model.addAttribute("newarrivals", this.productService.listProductsnewarrival());
	model.addAttribute("newarrivalscover", this.productService.listProductsnewarrivalscover());
	model.addAttribute("bestseller", this.productService.listProductsbestseller());
	model.addAttribute("trend", this.productService.listProductstrend());
	//model.addAttribute("viewed", this.productService.listProductsviewe());
	model.addAttribute("categories", this.categoryService.listCategory());//Category
	model.addAttribute("bannerbot", this.bannerService.listBanner());//	Banner
	model.addAttribute("bannertop", this.bannerService.listBannertop());//Bannertop
	return "home/home";
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String ProductDetails(@PathVariable("id") int id, Model model) {
		model.addAttribute("products", new Product());
		model.addAttribute("dealsOfWeek", this.productService.listProductsdealsofweek());
		model.addAttribute("featuresOfWeek", this.productService.listProductsfeatureofweek());
		model.addAttribute("newarrivals", this.productService.listProductsnewarrival());
		model.addAttribute("newarrivalscover", this.productService.listProductsnewarrivalscover());
		model.addAttribute("bestseller", this.productService.listProductsbestseller());
		model.addAttribute("trend", this.productService.listProductstrend());
		//model.addAttribute("viewed", this.productService.listProductsviewe());
		model.addAttribute("categories", this.categoryService.listCategory());//Category
		model.addAttribute("bannerbot", this.bannerService.listBanner());//	Banner
		model.addAttribute("bannertop", this.bannerService.listBannertop());//Bannertop
		
		model.addAttribute("relate", this.relateService.listRelate(id));
		
		model.addAttribute("allproduct", this.productService.listAllProduct());

	model.addAttribute("product", this.productService.getProductById(id));
	return "product/product";
	}
	
}
