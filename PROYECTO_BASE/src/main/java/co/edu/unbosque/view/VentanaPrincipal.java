package co.edu.unbosque.view;

import java.awt.CardLayout;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	private Login log;
	private MenuPrincipal mp;
	private CardLayout cardLayout;

	public VentanaPrincipal() {
		setTitle("Health Hub");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);

		cardLayout = new CardLayout();
		setLayout(cardLayout);

		log = new Login();
		mp = new MenuPrincipal();

		add(log, "login");
		add(mp, "menu");

		cardLayout.show(getContentPane(), "login");

		setVisible(true);
	}

	public void showMenu() {
		cardLayout.show(getContentPane(), "menu");
	}

	public void showLogin() {
		cardLayout.show(getContentPane(), "login");
	}

	public void showFormulario() {
		cardLayout.show(getContentPane(), "formulario");
	}

	public CardLayout getCardLayout() {
		return cardLayout;
	}

	public void setCardLayout(CardLayout cardLayout) {
		this.cardLayout = cardLayout;
	}

	public void setLog(Login log) {
		this.log = log;
	}

	public void setMp(MenuPrincipal mp) {
		this.mp = mp;
	}

	public MenuPrincipal getMp() {
		return mp;
	}

	public Login getLog() {
		return log;
	}

}
