package com.tyn.edu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientThread extends Thread {
	
	public int willScanPort = 0;
	
	public void run() {
		try {
			
			Socket socket = new Socket();			
			
			//socket.connect(new InetSocketAddress("10.10.71.152", willScanPort), 1000);
			socket.connect(new InetSocketAddress("127.0.0.1", willScanPort), 1000);

			
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream()); 

			dos.writeUTF("TONGYANG NETWORKS/홍길동/");

			System.out.println(dis.readUTF());

			System.out.println("##### " + willScanPort + " #####");
			System.exit(0);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		synchronized (FindMeTest.current_count) {
			FindMeTest.current_count--;
		}
	}
}
