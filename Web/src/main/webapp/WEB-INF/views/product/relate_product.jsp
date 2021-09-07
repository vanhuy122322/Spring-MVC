<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
	<div class="viewed">
		<div class="container">
			<div class="row">
				<div class="col">
					<div class="viewed_title_container">
						<h3 class="viewed_title">Sản phẩm liên quan</h3>
						<div class="viewed_nav_container">
							<div class="viewed_nav viewed_prev"><i class="fas fa-chevron-left"></i></div>
							<div class="viewed_nav viewed_next"><i class="fas fa-chevron-right"></i></div>
						</div>
					</div>

					<div class="viewed_slider_container">
						
						<!-- Recently Viewed Slider -->

						<div class="owl-carousel owl-theme viewed_slider">
							<c:forEach var="related" items="${relate}">
								<c:forEach var="product" items="${allproduct}">
								<c:if test="${product.getId()==related.getId_product_re()}">
							<!-- Recently Viewed Item -->
							<div class="owl-item">
								<div class="viewed_item discount d-flex flex-column align-items-center justify-content-center text-center">
									<div class="viewed_image"><img src="resources/${product.getImage() }" alt=""></div>
									<div class="viewed_content text-center">
										<div class="viewed_price"><fmt:formatNumber value = "${product.getPrice() }" type="number" maxIntegerDigits="14"/><span><fmt:formatNumber value = "${product.getPrice() }" type="number" maxIntegerDigits="14"/></span></div>
										<div class="viewed_name"><a href="#">${product.getTitle() }</a></div>
									</div>
									<ul class="item_marks">
										<li class="item_mark item_discount">${product.getDiscount() }%</li>
										<li class="item_mark item_new">Mới</li>
									</ul>
								</div>
							</div>
							</c:if>
							</c:forEach>
							</c:forEach>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>