import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Data {

	class Node {

		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
			left = null;
			right = null;
		}
	}

	public class JavaTree {
		Node root;

		public void traverseRecursionTree(Node node) {
			if (node != null) {
				traverseRecursionTree(node.left);
				System.out.print(" " + node.value);
				traverseRecursionTree(node.right);
			}
		}
	}

	public static void salvar(String path, String linha) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		buffWrite.append(linha);
		buffWrite.close();
	}

	public String CarregarG208N() throws IOException {
		String texto = Files.readString(Path.of("C:\\Users\\Unifique\\eclipse-workspace\\Interface de Alteracao de IP facilitado\\G208N - prov padrao.txt"), StandardCharsets.UTF_8);
		return texto;
	}

	public String CarregarKAP302() throws IOException {
		String texto = Files.readString(Path.of("C:\\Users\\Unifique\\eclipse-workspace\\Interface de Alteracao de IP facilitado\\KAP302 - prov padrao.txt"), StandardCharsets.UTF_8);
		return texto;
	}

	public static String remontar(String[] aux, String aux2, List ll) throws IOException {
		for (int i = 0; i < aux.length; i++) {
			if (i == 0) {
				aux2 += ll.get(i) + "=";
			} else if ((ll.get(i)).toString().substring(0, 1).equals("1")
					|| (ll.get(i)).toString().substring(0, 1).equals("2")
					|| (ll.get(i)).toString().substring(0, 1).equals("3")
					|| (ll.get(i)).toString().substring(0, 1).equals("4")
					|| (ll.get(i)).toString().substring(0, 1).equals("5")
					|| (ll.get(i)).toString().substring(0, 1).equals("6")
					|| (ll.get(i)).toString().substring(0, 1).equals("7")
					|| (ll.get(i)).toString().substring(0, 1).equals("8")
					|| (ll.get(i)).toString().substring(0, 1).equals("9")
					|| (ll.get(i)).toString().substring(0, 1).equals("0")
					|| (ll.get(i)).toString().substring(0, 1).equals("[")
					|| (ll.get(i)).toString().substring(0, 1).equals("*")
					|| (ll.get(i)).toString().substring(0, 1).equals("/")
					|| (ll.get(i)).toString().substring(0, 1).equals("$")
					|| (ll.get(i)).toString().substring(0, 2).equals("R4")
					|| (ll.get(i)).toString().substring(0, 2).equals("R3")
					|| (ll.get(i)).toString().substring(0, 2).equals("R2")
					|| (ll.get(i)).toString().substring(0, 2).equals("R1")
					|| (ll.get(i)).toString().substring(0, 2).equals("ht") || (ll.get(i)).toString().equals("Auto")
					|| (ll.get(i)).toString().equals("useradmin") || (ll.get(i)).toString().equals("STATIC")
					|| (ll.get(i)).toString().equals("user") || (ll.get(i)).toString().equals("TR069_VOICE_INTERNET")
					|| (ll.get(i)).toString().equals("subnet") || (ll.get(i)).toString().equals("INFO")
					|| (ll.get(i)).toString().equals("KeepAlive") || (ll.get(i)).toString().equals("DHCP")
					|| (ll.get(i)).toString().equals("AES") || (ll.get(i)).toString().equals("VOIP")
					|| (ll.get(i)).toString().equals("VOIP-0E5AD0") || (ll.get(i)).toString().equals("IPPhone")
					|| (ll.get(i)).toString().equals("MT7621") || (ll.get(i)).toString().equals("enable")
					|| (ll.get(i)).toString().equals("Enable") || (ll.get(i)).toString().equals("Route")
					|| (ll.get(i)).toString().equals("private") || (ll.get(i)).toString().equals("public")
					|| (ll.get(i)).toString().equals("NONE") || (ll.get(i)).toString().equals("DHCPv6")
					|| (ll.get(i)).toString().equals("TR069_VOICE_INTERNET") || (ll.get(i)).toString().equals("WPA-EAP")
					|| (ll.get(i)).toString().equals("FLY44169000045") || (ll.get(i)).toString().equals("trap")
					|| (ll.get(i)).toString().equals("g508_flyingvoice-201703280319")
					|| (ll.get(i)).toString().equals("internet	sip	rtp	tr069	snmp	goahead	telnet")
					|| (ll.get(i)).toString().equals("admin") || (ll.get(i)).toString().equals("RalinkInitialAP")
					|| (ll.get(i)).toString().equals("tunnel") || (ll.get(i)).toString().equals("yes")
					|| (ll.get(i)).toString().equals("CN") || (ll.get(i)).toString().equals("WPAPSK")
					|| (ll.get(i)).toString().equals("scaptest") || (ll.get(i)).toString().equals("GIP2000")
					|| (ll.get(i)).toString().equals("gateway") || (ll.get(i)).toString().equals("VOIP-5G-0E5AD0")
					|| (ll.get(i)).toString().equals("wired") || (ll.get(i)).toString().equals("FLY07172000203")
					|| (ll.get(i)).toString().equals("wharever") || (ll.get(i)).toString().equals("TIME")
					|| (ll.get(i)).toString().equals("EBS_-03") || (ll.get(i)).toString().equals("error")
					|| (ll.get(i)).toString().equals("mydevice") || (ll.get(i)).toString().equals("pool.ntp.org")
					|| (ll.get(i)).toString().equals("ip_br") || (ll.get(i)).toString().equals("Manual")
					|| (ll.get(i)).toString().equals("IPv4")
					|| (ll.get(i)).toString().equals("g508_flyingvoice-201703280319")
					|| (ll.get(i)).toString()
							.equals("sip.tpa.com.br	sip.tpa.com.br	sip.tpa.com.br	sip.tpa.com.br	sip.tpa.com.br")
					|| (ll.get(i)).toString().equals(
							"sip.tpa.com.br	sip.tpa.com.br	sip.tpa.com.br	sip.tpa.com.br	sip.tpa.com.br	sip.tpa.com.br	sip.tpa.com.br	sip.tpa.com.br")) {
				aux2 += ll.get(i);
			} else if (ll.get(i).toString().equals("fec0::1")) {
				aux2 += "\n" + ll.get(i);
			} else {
				aux2 += "\n" + ll.get(i) + "=";
			}
		}
		return aux2;
	}

}
