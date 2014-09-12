package edu.usmp.dis.sit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

//TIENE CAR_ID COMO FK Y PK A LA VERZ OJO!!!!!!!!!!!!!!!!!!


@Entity
@DynamicUpdate
@Table(name="recharge")
public class Recharge {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="ID_RECHARGE")
     private Integer id;
	 
	 @Column(name="AMOUNT")
     private Double amount;

	 
public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Double getAmount() {
	return amount;
}

public void setAmount(Double amount) {
	this.amount = amount;
}


}
