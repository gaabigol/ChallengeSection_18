package model.service;

public interface OnlinePaymentService {

	public double PaymentFee(double amount);

	public double interest(double amount, int mounths);

}
