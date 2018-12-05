package com.felipe.spring1.services;

import org.springframework.mail.SimpleMailMessage;

import com.felipe.spring1.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);	
}
