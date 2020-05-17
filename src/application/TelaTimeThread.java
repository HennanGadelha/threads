package application;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	
	private JPanel jPanel = new JPanel(new GridBagLayout());//painel de componentes
	
	private JLabel descricaoHora = new JLabel("Time da thread 1");
	private JTextField mostrarTempo = new JTextField();
	

	public TelaTimeThread() {
		
		//configurando tela
		setTitle("Tela time com thread");	
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();//controlador de posicionamento dos componentes
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		descricaoHora.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		mostrarTempo.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy++;
		jPanel.add(mostrarTempo, gridBagConstraints);
		
		add(jPanel, BorderLayout.WEST);
		setVisible(true);

	}
	
	
	
	
	
}
