package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import listeners.ClientListener;
import frames.ClientConnectView;
import frames.ServerManagementView;

public class ClientStarter {

	public ClientConnectView connectFrame;
	private ClientListener clientListener;
	
	
	public ClientStarter() {
		connectFrame = new ClientConnectView();
		attachListener();
		clientListener = new ClientListener();
		clientListener.setClientStarter(this);
	}

	public static void main(String[] args) {
		new ClientStarter();
	}

	private void attachListener() {
		// TODO Auto-generated method stub
		connectFrame.btnConnectServer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientListener.setNickname(connectFrame.tf_nickname.getText());
				clientListener.connect();
				//startFrame.dispose();
				//managementFrame = new ServerManagementView();
			}
		});

	}
}