package net.pnp.PNPOnlineShopping.model;

import java.io.Serializable;
import java.util.List;

import javax.mail.Address;
import javax.xml.registry.infomodel.User;

import net.pnp.PNPShoppingBackEnd.dto.Cart;
import net.pnp.PNPShoppingBackEnd.dto.CartLine;
import net.pnp.PNPShoppingBackEnd.dto.OrderDetail;

public class CheckoutModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User user;
	private net.pnp.PNPShoppingBackEnd.dto.Address shipping;
	private Cart cart;
	private List<CartLine> cartLines;
	private OrderDetail orderDetail;
	private double checkoutTotal;

	public OrderDetail getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public double getCheckoutTotal() {
		return checkoutTotal;
	}

	public void setCheckoutTotal(double checkoutTotal) {
		this.checkoutTotal = checkoutTotal;
	}

	public List<CartLine> getCartLines() {
		return cartLines;
	}

	public void setCartLines(List<CartLine> cartLines) {
		this.cartLines = cartLines;
	}


	public User getUser() {
		return user;
	}

	public void setUser(net.pnp.PNPShoppingBackEnd.dto.User user2) {
		this.user = (User) user2;
	}

	/*public Address getShipping() {
		return shipping;
	}*/

	public void setShipping(net.pnp.PNPShoppingBackEnd.dto.Address shipping2) {
		this.shipping = shipping2;
	}
	
}
