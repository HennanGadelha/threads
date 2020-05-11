package application;

import javax.swing.JOptionPane;

public class AulaThred {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// processamento pararelo 1
		new Thread() {

			public void run() {

				/* codigo da rotina pra executar em paralelo */
				for (int i = 0; i < 10; i++) {

					System.out.println("Executando rotina");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				// fim do codigo pararelo

			}

		}.start();
		
		//-------------------divisao threads--------------------------
		
		//processamento parelelo 2
		new Thread() {

			public void run() {

				/* codigo da rotina pra executar em paralelo */
				for (int i = 0; i < 10; i++) {

					System.out.println("Executando rotina 2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				// fim do codigo pararelo

			}

		}.start();
		
		
		

		System.out.println("Chegou ao fim teste thread");

		// fluxo do sistema
		JOptionPane.showMessageDialog(null, "Sistema continua executando p usuario");

	}

}
