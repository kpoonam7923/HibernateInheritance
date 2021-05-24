package com.hibernateinheritance.demo.entity;

//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

//***************** For InheritanceType.SINGLE_TABLE *************************
//@Entity
//@DiscriminatorValue("cc")

//***************** For InheritanceType.TABLE_PER_CLASS *************************
//@Entity
//@Table(name="card")

//***************** For InheritanceType.JOINED *************************
@Entity
@Table(name="card")
@PrimaryKeyJoinColumn(name = "id")
public class CreditCard extends Payment{
	
	private String cardnumber;

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	
}
