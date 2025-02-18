package com.zq.generics.example4.bounded.lower;

import java.util.List;

public class MailSender {
	public String sendMail(String body, Object recipient) {
		return "Email sent to: " + recipient.toString();
	}

	public static String sendMail(String body, List<? super ValidEmail> recipients) {
		MailSender mailSender = new MailSender();
		StringBuilder sb = new StringBuilder();
		for (Object o : recipients) {
			String result = mailSender.sendMail(body, o);
			sb.append(result+"\n");
		}
		return sb.toString();
	}
}
