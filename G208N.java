import java.util.List;

import javax.swing.JTextField;

public class G208N {

	public void alteradorAtivG208N(JTextField txtIp, List ll) {
		ll.set(74, "192.168.3." + txtIp.getText());
		ll.set(1538, "192.168.3." + txtIp.getText());
	}

	public void alteradorFreeG208N(JTextField txtIp, List ll) {
		/*switch (comboBoxDin.getSelectedIndex()) {
		case 0:

		case 1:

		case 2:

		case 3:

		case 4:

		case 5:

		case 6:

		case 7:

		case 8:

		case 9:

		case 10:

		case 11:

		case 12:

		case 13:

		case 14:

		case 15:

		}
	}*/

	}

	public void alteradorDinG208N(int contador, JTextField[] txtIp, List ll) {
		switch (contador) {
		case 0:
			if (txtIp[2].getText() == "0" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(374, "192.168.0." + txtIp[3].getText());
				ll.set(1118, "192.168.0." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "0" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(374, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1118, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "0" && txtIp[1].getText() != "168" && txtIp[0].getText() == "192") {
				ll.set(374, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1118, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "0" && txtIp[1].getText() != "168" && txtIp[0].getText() != "192") {
				ll.set(374, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(1118, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
			} else {
				System.out.println("O número digitado é inválido.");
			}
		case 1:
			if (txtIp[2].getText() == "1" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(267, "192.168.1." + txtIp[3].getText());
				ll.set(850, "192.168.1." + txtIp[3].getText());
				ll.set(1083, "192.168.1." + txtIp[3].getText());
				ll.set(1245, "192.168.1." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "1" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(581, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(787, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1083, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1245, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "1" && txtIp[1].getText() != "168" && txtIp[0].getText() == "192") {
				ll.set(581, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(787, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1083, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1245, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "1" && txtIp[1].getText() != "168" && txtIp[0].getText() != "192") {
				ll.set(581, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(787, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(1083, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(1245, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
			} else {
				System.out.println("O número digitado é inválido.");
			}
		case 2:
			if (txtIp[2].getText() == "2" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(608, "192.168.2." + txtIp[3].getText());
				ll.set(825, "192.168.2." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "2" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(608, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(825, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "2" && txtIp[1].getText() != "168" && txtIp[0].getText() == "192") {
				ll.set(608, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(825, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "2" && txtIp[1].getText() != "168" && txtIp[0].getText() != "192") {
				ll.set(608, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(825, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
			} else {
				System.out.println("O número digitado é inválido.");
			}
		case 3:
			if (txtIp[2].getText() == "3" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(74, "192.168.3." + txtIp[3].getText());
				ll.set(249, "192.168.3." + txtIp[3].getText());
				ll.set(437, "192.168.3." + txtIp[3].getText());
				ll.set(615, "192.168.3." + txtIp[3].getText());
				ll.set(1424, "192.168.3." + txtIp[3].getText());
				ll.set(1538, "192.168.3." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "3" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(74, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(249, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(437, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(615, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1424, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1538, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "3" && txtIp[1].getText() != "168" && txtIp[0].getText() == "192") {
				ll.set(74, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(249, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(437, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(615, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1424, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1538, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "3" && txtIp[1].getText() != "168" && txtIp[0].getText() != "192") {
				ll.set(74, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(249, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(437, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(615, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(1424, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(1538, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
			} else {
				System.out.println("O número digitado é inválido.");
			}
		case 4:
			if (txtIp[2].getText() == "100" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(848, "192.168.100." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "100" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(848, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "100" && txtIp[1].getText() != "168" && txtIp[0].getText() == "192") {
				ll.set(848, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "100" && txtIp[1].getText() != "168" && txtIp[0].getText() != "192") {
				ll.set(848, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
			} else {
				System.out.println("O número digitado é inválido.");
			}
		}
	}

}
