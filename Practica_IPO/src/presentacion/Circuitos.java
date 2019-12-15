package presentacion;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class Circuitos extends JPanel {
	//VentanaPrincipal ventanaprincipal = new VentanaPrincipal();
	/**
	 * Create the panel.
	 */
	public Circuitos() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlNort = new JPanel();
		add(pnlNort, BorderLayout.NORTH);
		GridBagLayout gbl_pnlNort = new GridBagLayout();
		gbl_pnlNort.columnWidths = new int[]{0, 0, 0, 391, 0, 0, 0, 0, 0};
		gbl_pnlNort.rowHeights = new int[]{20, 40, 20, 0};
		gbl_pnlNort.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlNort.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlNort.setLayout(gbl_pnlNort);
		
		JButton btnVistaNormal = new JButton("Vista Normal");
		GridBagConstraints gbc_btnVistaNormal = new GridBagConstraints();
		gbc_btnVistaNormal.insets = new Insets(0, 0, 5, 5);
		gbc_btnVistaNormal.gridx = 1;
		gbc_btnVistaNormal.gridy = 1;
		pnlNort.add(btnVistaNormal, gbc_btnVistaNormal);
		
		JButton btnVistaAmpliada = new JButton("Vista Ampliada");
		GridBagConstraints gbc_btnVistaAmpliada = new GridBagConstraints();
		gbc_btnVistaAmpliada.insets = new Insets(0, 0, 5, 5);
		gbc_btnVistaAmpliada.gridx = 2;
		gbc_btnVistaAmpliada.gridy = 1;
		pnlNort.add(btnVistaAmpliada, gbc_btnVistaAmpliada);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setIcon(new ImageIcon(Circuitos.class.getResource("/presentacion/recycle-bin-filled-tool.png")));
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 4;
		gbc_btnBorrar.gridy = 1;
		pnlNort.add(btnBorrar, gbc_btnBorrar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setIcon(new ImageIcon(Circuitos.class.getResource("/presentacion/refresh-button.png")));
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 5;
		gbc_btnModificar.gridy = 1;
		pnlNort.add(btnModificar, gbc_btnModificar);
		
		JButton btnReservar = new JButton("Reservar");
		btnReservar.setIcon(new ImageIcon(Circuitos.class.getResource("/presentacion/plus.png")));
		btnReservar.addActionListener(new BtnReservarActionListener());
		//btnReservar.addActionListener(new BtnReservarActionListener());
		GridBagConstraints gbc_btnReservar = new GridBagConstraints();
		gbc_btnReservar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnReservar.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservar.gridx = 6;
		gbc_btnReservar.gridy = 1;
		pnlNort.add(btnReservar, gbc_btnReservar);
		
		JPanel pnlCenter = new JPanel();
		add(pnlCenter, BorderLayout.CENTER);
		GridBagLayout gbl_pnlCenter = new GridBagLayout();
		gbl_pnlCenter.columnWidths = new int[] {20, 30, 40, 20};
		gbl_pnlCenter.rowHeights = new int[] {0, 0, 0};
		gbl_pnlCenter.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0};
		gbl_pnlCenter.rowWeights = new double[]{0.0, 1.0, 0.0};
		pnlCenter.setLayout(gbl_pnlCenter);
		
		JList list = new JList();
		list.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 1;
		pnlCenter.add(list, gbc_list);
		
		PanelCircuito panelCircuito = new PanelCircuito();
		GridBagLayout gridBagLayout = (GridBagLayout) panelCircuito.getLayout();
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowHeights = new int[]{20, 20, 20, 20, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.columnWidths = new int[]{20, 30, 20, 80, 30};
		GridBagConstraints gbc_panelCircuito = new GridBagConstraints();
		gbc_panelCircuito.insets = new Insets(0, 0, 5, 0);
		gbc_panelCircuito.fill = GridBagConstraints.BOTH;
		gbc_panelCircuito.gridx = 3;
		gbc_panelCircuito.gridy = 1;
		pnlCenter.add(panelCircuito, gbc_panelCircuito);

	}

	
	private class BtnReservarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Reserva reserva = new Reserva();
			reserva.setVisible(true);
			
		}
	}
}
