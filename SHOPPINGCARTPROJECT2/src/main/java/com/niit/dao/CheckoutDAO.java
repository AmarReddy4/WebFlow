package com.niit.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.models.Checkout;

@Repository
public interface CheckoutDAO {

	public boolean saveOrUpdate(Checkout checkout);
	public boolean delete(Checkout checkout);
	public List<Checkout>list();
	public Checkout get(int id);
}