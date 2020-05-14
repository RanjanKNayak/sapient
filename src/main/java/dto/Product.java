package dto;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {
	@Id
	String skuId;
	String brand;
	BigDecimal price;
	Color color;
	Size size;
	@ManyToMany
	List<Brand> brand;
	String SupplierName;
	
	
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public List<Brand> getBrand() {
		return brand;
	}
	public void setBrand(List<Brand> brand) {
		this.brand = brand;
	}
	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	

}
