import java.util.LinkedList;
import java.util.List;

import javax.swing.JTextField;

public class KAP302 {

	public void alteradorAtivKAP302(JTextField txtIp, List ll) {
		ll.set(65, "192.168.3." + txtIp.getText());
		ll.set(1471, "192.168.3." + txtIp.getText());
	}
	
// SE NAO FUNCIONAR COM ESSAS LINHAS, TENHO QUE ABAIXAR DOIS NUMEROS 323 - 2...
	public void alteradorDinKAP302(int contador, JTextField[] txtIp, List ll) {
		switch (contador) {
		case 0:
			if (txtIp[2].getText() == "0" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(321, "192.168.0." + txtIp[3].getText());
				ll.set(1075, "192.168.0." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "0" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(321, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1075, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "0" && txtIp[1].getText() != "168" && txtIp[0].getText() == "192") {
				ll.set(321, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1075, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "0" && txtIp[1].getText() != "168" && txtIp[0].getText() != "192") {
				ll.set(321, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(1075, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
			} else {
				System.out.println("O número digitado é inválido.");
			}
		case 1:
			if (txtIp[2].getText() == "1" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(251, "192.168.1." + txtIp[3].getText());
				ll.set(806, "192.168.1." + txtIp[3].getText());
				ll.set(1034, "192.168.1." + txtIp[3].getText());
				ll.set(1188, "192.168.1." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "1" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(251, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(806, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1034, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1188, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "1" && txtIp[1].getText() != "168" && txtIp[0].getText() == "192") {
				ll.set(251, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(806, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1034, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1188, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "1" && txtIp[1].getText() != "168" && txtIp[0].getText() != "192") {
				ll.set(251, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(806, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(1034, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(1188, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
			} else {
				System.out.println("O número digitado é inválido.");
			}
		case 2:
			if (txtIp[2].getText() == "2" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(579, "192.168.2." + txtIp[3].getText());
				ll.set(785, "192.168.2." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "2" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(579, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(785, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "2" && txtIp[1].getText() != "168" && txtIp[0].getText() == "192") {
				ll.set(579, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(785, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "2" && txtIp[1].getText() != "168" && txtIp[0].getText() != "192") {
				ll.set(579, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(785, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
			} else {
				System.out.println("O número digitado é inválido.");
			}
		case 3:
			if (txtIp[2].getText() == "3" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(65, "192.168.3." + txtIp[3].getText());
				ll.set(237, "192.168.3." + txtIp[3].getText());
				ll.set(416, "192.168.3." + txtIp[3].getText());
				ll.set(584, "192.168.3." + txtIp[3].getText());
				ll.set(1365, "192.168.3." + txtIp[3].getText());
				ll.set(1471, "192.168.3." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "3" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(65, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(237, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(416, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(584, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1365, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1471, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "3" && txtIp[1].getText() != "168" && txtIp[0].getText() == "192") {
				ll.set(65, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(237, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(416, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(584, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1365, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1471, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "3" && txtIp[1].getText() != "168" && txtIp[0].getText() != "192") {
				ll.set(65, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(237, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(416, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(584, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(1365, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(1471, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
			} else {
				System.out.println("O número digitado é inválido.");
			}
		case 4:
			if (txtIp[2].getText() == "100" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(806, "192.168.100." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "100" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(806, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "100" && txtIp[1].getText() != "168" && txtIp[0].getText() == "192") {
				ll.set(806, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "100" && txtIp[1].getText() != "168" && txtIp[0].getText() != "192") {
				ll.set(806, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
			} else {
				System.out.println("O número digitado é inválido.");
			}
		}
	}

}
