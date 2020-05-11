package application;

import javax.swing.JOptionPane;

public class AulaThred {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// processamento pararelo 1
		Thread rotina1 = new Thread(thread1);
		rotina1.start();

		// -------------------divisao threads--------------------------

		// processamento parelelo 2

		Thread rotina2 = new Thread(thread2);
		rotina2.start();

		System.out.println("Chegou ao fim teste thread");

		// fluxo do sistema
		JOptionPane.showMessageDialog(null, "Sistema continua executando p usuario");

	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub

			/* codigo da rotina pra executar em paralelo */
			for (int i = 0; i < 10; i++) {

				System.out.println("Executando rotina 1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			// fim do codigo pararelo

		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < 10; i++) {

				System.out.println("Executando rotina 2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
	};

}
