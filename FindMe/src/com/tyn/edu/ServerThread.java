package com.tyn.edu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread extends Thread {
	
	private ServerSocket serverSocket;
	private int serverPort;
	
	public ServerThread(int port) {
		serverPort = port;
	}
	
	public void run() {
		try {
			serverSocket = new ServerSocket(serverPort);
			
			while (true) {
				Socket clientSocket = serverSocket.accept();
				System.out.println(clientSocket.getInetAddress().getHostAddress() + " 접속하였습니다.");

				ClientThread clientThread = new ClientThread();
				clientThread.clientSocket = clientSocket;
				clientThread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (serverSocket != null) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
