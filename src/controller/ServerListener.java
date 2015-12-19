package controller;

import java.io.IOException;
import java.net.ServerSocket;

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

}
