package com.tyn.edu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.StringTokenizer;

public class ClientThread extends Thread {
	
	public Socket clientSocket = null;
	
	public void run() {
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			dis = new DataInputStream(clientSocket.getInputStream());
			dos = new DataOutputStream(clientSocket.getOutputStream());
			
			// 그냥 3초간 sleep
			Thread.sleep(3000);

			String recvMsg = dis.readUTF();
			System.out.println(recvMsg);
			
			StringTokenizer tokenizer = new StringTokenizer(recvMsg, "/");
			
			if (tokenizer.countTokens() >= 1) {
				String token = tokenizer.nextToken();
				
				if ("TONGYANG NETWORKS".equals(token)) {
					dos.writeUTF("OK/지금은 테스트입니다. 여기에 미션내용이 전송됩니다./");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
