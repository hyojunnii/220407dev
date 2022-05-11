package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) throws IOException {

		//����
		
		//���������� ��Ʈ��ȣ �ʿ�
		//port ��ȣ�� well-known ��Ʈ�� �����ϰ� ��밡��
		ServerSocket ss = new ServerSocket(12345); 
		
		//accept ���� Ŭ�� ���� ���� ����
		//������ ���Ŵ��(block)�ϴ� ����� client socket���� return
		System.out.println("�ٸ� ���� ���� ��ٸ��� �� ...");
		Socket cs = ss.accept(); 
		
		InetAddress ip = cs.getInetAddress();
	
		System.out.println("����� Ŭ���̾�Ʈ�� ip : " + ip);
		
		//�޼��� ����
		//stream ���
//		InputStream is = cs.getInputStream(); 				//1byte�� ó��
//		InputStreamReader isr = new InputStreamReader(is);  //���� 2byte�� ó��
//		BufferedReader br = new BufferedReader(isr); 		//������Ʈ������ ���� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
	
		//�޼��� �а� ����ϱ�
		String msg = br.readLine();
		System.out.println(msg);
		
		//����� �ڿ� �ݳ�
		br.close();
	}

}//class
