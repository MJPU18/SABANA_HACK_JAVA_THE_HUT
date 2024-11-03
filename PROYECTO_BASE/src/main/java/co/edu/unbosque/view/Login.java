package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class Login extends JPanel {

	private JLabel imageLabel;
	private JButton ini, secret;
	private ImageIcon botonIcono, botonSe;
	private JTextField user;
	private JPasswordField pass;
	private boolean isPasswordVisible = false;

	public Login() {

		imageLabel = new JLabel();
		imageLabel.setIcon(new ImageIcon("src/main/java/assets/Diseño_int.jpg"));

		ini = new JButton();
		ini.setBounds(121, 478, 559, 58);
		botonIcono = new ImageIcon("src/main/java/assets/btnini.png");
		ini.setIcon(botonIcono);
		ini.setBorderPainted(false);
		ini.setContentAreaFilled(false);

		secret = new JButton();
		secret.setBounds(700, 399, 39, 32);
		botonSe = new ImageIcon("src/main/java/assets/close.png");
		// necesario
		secret.setIcon(botonSe);
		secret.setBorderPainted(false); // Opcional: quitar el borde del botón
		secret.setContentAreaFilled(false); // Opcional: quitar el fondo del botón

		user = new JTextField();
		user.setFont(new Font("Arial", Font.PLAIN, 24));
		user.setOpaque(true);
		user.setBounds(196, 302, 480, 53);
		user.setBorder(null);

		pass = new JPasswordField();
		pass.setFont(new Font("Arial", Font.PLAIN, 24));
		pass.setOpaque(true);
		pass.setBounds(196, 390, 480, 53);
		pass.setBorder(null);

		imageLabel.add(ini);
		imageLabel.add(secret);
		imageLabel.add(user);
		imageLabel.add(pass);
		add(imageLabel, BorderLayout.CENTER);

		secret.addActionListener(e -> togglePasswordVisibility());

		setVisible(true);
	}

	private void togglePasswordVisibility() {
		isPasswordVisible = !isPasswordVisible; // Cambia el estado

		if (isPasswordVisible) {
			// Cambia a open.png y muestra la contraseña
			secret.setIcon(new ImageIcon("src/main/java/assets/open.png"));
			pass.setEchoChar((char) 0); // Muestra la contraseña
		} else {
			// Cambia a close.png y oculta la contraseña
			secret.setIcon(new ImageIcon("src/main/java/assets/close.png"));
			pass.setEchoChar('•'); // Restaura el carácter de eco
		}
	}

	public boolean isPasswordVisible() {
		return isPasswordVisible;
	}

	public void setPasswordVisible(boolean isPasswordVisible) {
		this.isPasswordVisible = isPasswordVisible;
	}

	public JLabel getImageLabel() {
		return imageLabel;
	}

	public void setImageLabel(JLabel imageLabel) {
		this.imageLabel = imageLabel;
	}

	public JButton getIni() {
		return ini;
	}

	public void setIni(JButton ini) {
		this.ini = ini;
	}

	public ImageIcon getBotonIcono() {
		return botonIcono;
	}

	public void setBotonIcono(ImageIcon botonIcono) {
		this.botonIcono = botonIcono;
	}

	public JTextField getUser() {
		return user;
	}

	public JButton getSecret() {
		return secret;
	}

	public void setSecret(JButton secret) {
		this.secret = secret;
	}

	public ImageIcon getBotonSe() {
		return botonSe;
	}

	public void setBotonSe(ImageIcon botonSe) {
		this.botonSe = botonSe;
	}

	public void setUser(JTextField user) {
		this.user = user;
	}

	public JPasswordField getPass() {
		return pass;
	}

	public void setPass(JPasswordField pass) {
		this.pass = pass;
	}
}
