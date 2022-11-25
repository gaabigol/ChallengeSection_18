package model.entities;

import java.util.ArrayList;
import java.util.Date;

public class Contract {
	private int number;
	private Date date;

	private ArrayList<Installment> installments = new ArrayList<Installment>();
	
	
	public Contract(int number, Date date) {
		this.number = number;
		this.date = date;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ArrayList<Installment> getInstallments() {
		return installments;
	}


	/*public double totalValue() {
		return 0.0;
	}*/

}
