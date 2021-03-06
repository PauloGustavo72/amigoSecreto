package amigoSecreto.email;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public  class Email {

	public void mandaEmail(String nome, String email, String pessoaQueTirou) {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("colocar o email", "senha do email");
			}
		});
		/** Ativa Debug para sessão */
		session.setDebug(true);
		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("colocar email")); // Remetente

			Address[] toUser = InternetAddress // Destinatário(s)
					.parse(email);
			message.setRecipients(Message.RecipientType.TO, toUser);
			message.setSubject("Sorteio amigo secreto da Silvana");// Assunto
			message.setText("Olá " + nome +"\n\nVocê tirou o " + pessoaQueTirou + " no amigo secreto"
					+ " que vai acontecer no dia 17/12/2017");
			/** Método para enviar a mensagem criada */
			Transport.send(message);
			System.out.println("Feito!!!");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}