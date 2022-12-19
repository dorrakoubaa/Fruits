package com.Souk.Fruits.model;


import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;  

@Entity  

@Table
public class Fruit {

  

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column 
		private int id;  
		@Column  
		private String name; 
		@Column  
		private int qte; 
		@Column  
		private float price;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getQte() {
			return qte;
		}
		public void setQte(int qte) {
			this.qte = qte;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "FruitsModel [id=" + id + ", name=" + name + ", qte=" + qte + ", price=" + price + "]";
		}
		
		
	

}
