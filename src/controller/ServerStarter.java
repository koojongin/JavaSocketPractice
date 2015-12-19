package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frames.ServerMainView;
import frames.ServerManagementView;

public class ServerStarter {

	private ServerMainView startFrame;
	private ServerManagementView managementFrame;

	public ServerStarter() {
		startFrame = new ServerMainView();
		attachListener();
	}

	public static void main(String[] args) {
		new ServerStarter();
	}

	private void attachListener() {
		// TODO Auto-generated method stub
		startFrame.btnStartServer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				startFrame.dispose();
				managementFrame = new ServerManagementView();

			}
		});

	}
}