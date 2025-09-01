package br.com.mariojp.solid.dip.service;

public interface MailService {
	public void send(String to, String subject, String body);
}
