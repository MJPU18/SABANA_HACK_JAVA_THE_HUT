package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends JPanel {

	private JLabel imp;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;

	public MenuPrincipal() {
		setLayout(new BorderLayout());

		// Imagen de fondo
		imp = new JLabel();
		imp.setIcon(new ImageIcon("src/main/java/assets/Diseño_mp.jpg"));
		add(imp, BorderLayout.CENTER);

		// Panel de botones con FlowLayout para alinearlos de izquierda a derecha
		JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));
		botonesPanel.setOpaque(false);

		// Crear botones con imágenes
		boton1 = new JButton(new ImageIcon("src/main/java/assets/registrar.png"));
		boton2 = new JButton(new ImageIcon("src/main/java/assets/visualizar.png"));
		boton3 = new JButton(new ImageIcon("src/main/java/assets/subir.png"));

		// Configurar el tamaño de los botones
		boton1.setPreferredSize(new Dimension(200, 200));
		boton2.setPreferredSize(new Dimension(200, 200));
		boton3.setPreferredSize(new Dimension(200, 200));

		// Quitar bordes y fondos para solo mostrar las imágenes
		boton1.setContentAreaFilled(false);
		boton1.setBorderPainted(false);

		boton2.setContentAreaFilled(false);
		boton2.setBorderPainted(false);

		boton3.setContentAreaFilled(false);
		boton3.setBorderPainted(false);

		// Agregar botones al panel
		botonesPanel.add(boton1);
		botonesPanel.add(boton2);
		botonesPanel.add(boton3);

		// Configurar el JLabel de fondo para centrar el panel de botones
		imp.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(100, 0, 0, 0); // Añade un margen superior para bajar el panel
		imp.add(botonesPanel, gbc);

		setVisible(true);
	}

	public JButton getBoton1() {
		return boton1;
	}

	public JButton getBoton2() {
		return boton2;
	}

	public JButton getBoton3() {
		return boton3;
	}
}
