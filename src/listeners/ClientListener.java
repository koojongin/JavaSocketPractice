package listeners;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

import controllers.ClientStarter;

public class ClientListener {
	static int SERVER_PORT = 8080;
	public ServerSocket serverSocket;
	public String Nickname;
	public String ServerIPAddress = "192.168.1.101";
	private ClientStarter clientStarter;
	public static int PORT = 8080;
	
	
	public ClientListener()  {
	}
	
	public void connect(){
		 Socket socket;
			try {
				socket = new Socket(ServerIPAddress, PORT);
				  // ������ �Է½�Ʈ���� ��´�.
		        InputStream in = socket.getInputStream();
		        DataInputStream dis = new DataInputStream(in);
		        // �������κ��� ���� �����͸� ����Ѵ�.
		        System.out.println("�����κ��� ���� �޼��� : " + dis.readUTF());
		        System.out.println("������ �����մϴ�.");
		         
//		        dis.close();
//		        socket.close();
//		        System.out.println("������ ����Ǿ����ϴ�.");
			} catch (ConnectException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null,"������ �����Ҽ� �����ϴ�.");
			} catch (SocketException e){
				JOptionPane.showMessageDialog(null,"������ ����Ǿ����ϴ�.");
				clientStarter.connectFrame.dispose();
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void setNickname(String nickname) {
		Nickname = nickname;
	}

	public void setClientStarter(ClientStarter clientStarter) {
		this.clientStarter = clientStarter;
		
	}

}
