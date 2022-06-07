import java.util.LinkedList;
import java.util.List;

import javax.swing.JTextField;

public class KAP302 {

	public void alteradorAtivKAP302(JTextField txtIp, List ll) {
		ll.set(74, "192.168.3." + txtIp.getText());
		ll.set(1538, "192.168.3." + txtIp.getText());
	}
	
// SE NAO FUNCIONAR COM ESSAS LINHAS, TENHO QUE ABAIXAR DOIS NUMEROS 323 - 2...
	public void alteradorDinKAP302(int contador, JTextField[] txtIp, List ll) {
		switch (contador) {
		case 0:
			if (txtIp[2].getText() == "0" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(323, "192.168.0." + txtIp[3].getText());
				ll.set(1077, "192.168.0." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "0" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(323, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1077, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "0" && txtIp[1].getText() != "168" && txtIp[0].getText() == "192") {
				ll.set(323, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1077, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "0" && txtIp[1].getText() != "168" && txtIp[0].getText() != "192") {
				ll.set(323, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(1077, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
			} else {
				System.out.println("O número digitado é inválido.");
			}
		case 1:
			if (txtIp[2].getText() == "1" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(253, "192.168.1." + txtIp[3].getText());
				ll.set(808, "192.168.1." + txtIp[3].getText());
				ll.set(1036, "192.168.1." + txtIp[3].getText());
				ll.set(1190, "192.168.1." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "1" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(581, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(787, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1036, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1190, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "1" && txtIp[1].getText() != "168" && txtIp[0].getText() == "192") {
				ll.set(581, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(787, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1036, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1190, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "1" && txtIp[1].getText() != "168" && txtIp[0].getText() != "192") {
				ll.set(581, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(787, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(1036, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(1190, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
			} else {
				System.out.println("O número digitado é inválido.");
			}
		case 2:
			if (txtIp[2].getText() == "2" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(581, "192.168.2." + txtIp[3].getText());
				ll.set(787, "192.168.2." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "2" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(581, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(787, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "2" && txtIp[1].getText() != "168" && txtIp[0].getText() == "192") {
				ll.set(581, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(787, 192. + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "2" && txtIp[1].getText() != "168" && txtIp[0].getText() != "192") {
				ll.set(581, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(787, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
			} else {
				System.out.println("O número digitado é inválido.");
			}
		case 3:
			if (txtIp[2].getText() == "3" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(67, "192.168.3." + txtIp[3].getText());
				ll.set(239, "192.168.3." + txtIp[3].getText());
				ll.set(418, "192.168.3." + txtIp[3].getText());
				ll.set(586, "192.168.3." + txtIp[3].getText());
				ll.set(1367, "192.168.3." + txtIp[3].getText());
				ll.set(1473, "192.168.3." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "3" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(67, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(239, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(418, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(586, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1367, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1473, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "3" && txtIp[1].getText() != "168" && txtIp[0].getText() == "192") {
				ll.set(67, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(239, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(418, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(586, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1367, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
				ll.set(1473, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "3" && txtIp[1].getText() != "168" && txtIp[0].getText() != "192") {
				ll.set(67, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(239, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(418, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(586, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(1367, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
				ll.set(1473, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
			} else {
				System.out.println("O número digitado é inválido.");
			}
		case 4:
			if (txtIp[2].getText() == "100" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(808, "192.168.100." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "100" && txtIp[1].getText() == "168" && txtIp[0].getText() == "192") {
				ll.set(808, "192.168." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "100" && txtIp[1].getText() != "168" && txtIp[0].getText() == "192") {
				ll.set(808, "192." + txtIp[1].getText() + "." + txtIp[2].getText() + "." + txtIp[3].getText());
			} else if (txtIp[2].getText() != "100" && txtIp[1].getText() != "168" && txtIp[0].getText() != "192") {
				ll.set(808, txtIp[0].getText() + "." + txtIp[1].getText() + "." + txtIp[2].getText() + "."
						+ txtIp[3].getText());
			} else {
				System.out.println("O número digitado é inválido.");
			}
		}
	}

}
