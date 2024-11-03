package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaPrincipal vp;

	public Controller() {
		vp = new VentanaPrincipal();
		run();
	}

	public void run() {

		agregarLectores();

	}

	public void agregarLectores() {

		vp.getLog().getIni().addActionListener(this);
		vp.getLog().getIni().setActionCommand("iniciarsesion");

		vp.getMp().getBoton1().addActionListener(this);
		vp.getMp().getBoton1().setActionCommand("formulario");

	}

	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case "iniciarsesion": {

			String usuario = vp.getLog().getUser().getText();
			String contrasena = new String(vp.getLog().getPass().getPassword());

			if ("Admin".equals(usuario) && "SistemaHack2024".equals(contrasena)) {
				vp.getMp().setVisible(true);
				vp.getLog().setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null, "Credenciales inválidas, intente de nuevo", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
			break;
		}

		}
	}
}
