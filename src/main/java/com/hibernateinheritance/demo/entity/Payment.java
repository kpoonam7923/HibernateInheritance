package com.hibernateinheritance.demo.entity;

// import javax.persistence.DiscriminatorColumn;
// import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

// ***************** For InheritanceType.SINGLE_TABLE *************************
//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
////tell that pmode act as discriminator of tables and pmode type is STRING (i.e. DiscriminatorType)
//@DiscriminatorColumn(name="pmode", discriminatorType = DiscriminatorType.STRING)

//***************** For InheritanceType.TABLE_PER_CLASS *************************
//@Entity
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

//***************** For InheritanceType.JOINED *************************
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Payment {
	
	
	@Id
	private int id;
	private double amount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
