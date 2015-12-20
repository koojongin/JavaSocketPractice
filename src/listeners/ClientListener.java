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
				  // 소켓의 입력스트림을 얻는다.
		        InputStream in = socket.getInputStream();
		        DataInputStream dis = new DataInputStream(in);
		        // 소켓으로부터 받은 데이터를 출력한다.
		        System.out.println("서버로부터 받은 메세지 : " + dis.readUTF());
		        System.out.println("연결을 종료합니다.");
		         
//		        dis.close();
//		        socket.close();
//		        System.out.println("연결이 종료되었습니다.");
			} catch (ConnectException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null,"서버에 연결할수 없습니다.");
			} catch (SocketException e){
				JOptionPane.showMessageDialog(null,"서버가 종료되었습니다.");
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
