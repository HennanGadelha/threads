package application;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	
	private JPanel jPanel = new JPanel(new GridBagLayout());//painel de componentes
	
	private JLabel descricaoHora = new JLabel("Time da thread 1");
	private JTextField mostrarTempo = new JTextField();
	
	private JLabel descricaoHoraFim = new JLabel("Time da thread 2");
	private JTextField mostrarTempofim = new JTextField();
	
	private JButton btnStart = new JButton("Start");
	private JButton btnStop = new JButton("Stop");
	
	public TelaTimeThread() {
		
		//configurando tela
		setTitle("Tela time com thread");	
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();//controlador de posicionamento dos componentes
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 10);
		gridBagConstraints.anchor =GridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		mostrarTempo.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy++;
		jPanel.add(mostrarTempo, gridBagConstraints);
		
		descricaoHoraFim.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHoraFim, gridBagConstraints);
		
		mostrarTempofim.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy++;
		jPanel.add(mostrarTempofim, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		
		btnStart.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridy++;
		jPanel.add(btnStart, gridBagConstraints);
		
		btnStop.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridx++;
		jPanel.add(btnStop, gridBagConstraints);
		
		mostrarTempo.setEditable(false);
		mostrarTempofim.setEditable(false);
		
		add(jPanel, BorderLayout.WEST);
		setVisible(true);

	}
	
	
	
	
	
}
