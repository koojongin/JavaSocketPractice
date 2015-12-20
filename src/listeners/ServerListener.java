package listeners;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener {

	static int SERVER_PORT = 8080;
	public ServerSocket serverSocket;

	public ServerListener() {
		try {
			serverSocket = new ServerSocket(SERVER_PORT);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void listen(){
		while(true){
			Socket socket = null;
			try {
				socket = serverSocket.accept();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(socket.getInetAddress() + "로부터 연결요청이 들어왔습니다.");
		}
	}

}
