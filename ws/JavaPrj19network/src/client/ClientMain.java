package client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//Ŭ���̾�Ʈ
		System.out.println("Ŭ���̾�Ʈ ����");
		
		//���� �� ���� ���� ���� ���ڷ� ���� (�߽�)	
		//("��������ip�ּ�", ��������port��ȣ)
		Socket s = new Socket("127.0.0.1",12345); //127.0.0.1 == localhost
		
		//�޼��� �߽�
		//stream ���
		OutputStream os = s.getOutputStream();				 //1����Ʈ
		OutputStreamWriter osw = new OutputStreamWriter(os); //2����Ʈ
		BufferedWriter bw = new BufferedWriter(osw); 		 //������Ʈ������ �������
		
		//�Է¹ް�, write ���ֱ�
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
	
		bw.write(msg);
		bw.flush();

		//����� �ڿ� �ݳ�
		bw.close();
	}
	
}//class
