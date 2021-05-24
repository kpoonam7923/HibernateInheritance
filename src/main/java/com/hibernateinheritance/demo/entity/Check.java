package com.hibernateinheritance.demo.entity;

//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

//***************** For InheritanceType.SINGLE_TABLE *************************
//@Entity
//@DiscriminatorValue("ch")

//***************** For InheritanceType.TABLE_PER_CLASS *************************
//@Entity
//@Table(name="bankcheck")

//***************** For InheritanceType.JOINED *************************
@Entity
@Table(name="bankcheck")
@PrimaryKeyJoinColumn(name = "id")
public class Check extends Payment{
	
	private String checknumber;

	public String getChecknumber() {
		return checknumber;
	}

	public void setChecknumber(String checknumber) {
		this.checknumber = checknumber;
	}

	
	

}
