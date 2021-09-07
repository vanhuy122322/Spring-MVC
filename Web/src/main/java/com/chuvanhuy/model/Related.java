package com.chuvanhuy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QUESTION")
public class Related {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
	@Column(name = "id_product")
    protected String id_product;
	@Column(name = "id_product_re")
    protected String id_product_re;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getId_product() {
		return id_product;
	}
	public void setId_product(String id_product) {
		this.id_product = id_product;
	}
	public String getId_product_re() {
		return id_product_re;
	}
	public void setId_product_re(String id_product_re) {
		this.id_product_re = id_product_re;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((id_product == null) ? 0 : id_product.hashCode());
		result = prime * result + ((id_product_re == null) ? 0 : id_product_re.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Related other = (Related) obj;
		if (id != other.id)
			return false;
		if (id_product == null) {
			if (other.id_product != null)
				return false;
		} else if (!id_product.equals(other.id_product))
			return false;
		if (id_product_re == null) {
			if (other.id_product_re != null)
				return false;
		} else if (!id_product_re.equals(other.id_product_re))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", id_product=" + id_product + ", id_product_re=" + id_product_re + "]";
	}

}
