package com.kh.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LoginTest {

	Scanner sc = new Scanner(System.in);

	private final String path = "D:\\220407dev\\user.txt";
	
	public void login() {
		
		//����� �α���
//		System.out.println("�α���");
		String[] strArr = inputUser();
		
		String id = strArr[0];
		String pwd = strArr[1];
		
		//���Ͽ��� ���̵�, ��� Ȯ���Ͽ�
		//�α��� ���� ���� �Ǵ��ϱ�
		
		//���ϰ�ü ����
		File f = new File(path);
		
		//��Ʈ�� ����
		// try with resource ������ ����ϸ�, close ó���� ���� �� �ʿ䰡 ����.
			// ()�ȿ� �θ� ��Ʈ�� �� �ڵ� close��
		try (BufferedReader br = new BufferedReader(new FileReader(f))){
									//������Ʈ��      //���ν�Ʈ��
			boolean isLoginSuccess = false;
			
			while(true) {
				//���̵�, ��� �б�
				String data = br.readLine();
				
				//data�� null�̶�� �бⳡ
				if(data == null) {break;}
				
				//ID,PWD����
				int index = data.indexOf('/');
				String dataId = data.substring(0,index);
				String dataPwd = data.substring(index + 1);
				
				//�Ǵ��ϱ�
				if(id.equals(dataId) && pwd.equals(dataPwd)) {
					System.out.println(dataId + "�� �α��� ����");
					isLoginSuccess = true;
					break;
				}
			}
			
			//�ѹ��� ���� ���ϸ� ���
			if (!isLoginSuccess) {
				System.out.println("�α��� ����");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("���� !");
		} catch (IOException e1) {
			System.out.println("IO ���� !");
		}
	}
	
	//ȸ������
	public void join() throws JoinException {
		System.out.println("ȸ������");
		String[] strArr = inputUser();
		
		String id = strArr[0];
		String pwd = strArr[1];

		//���̵�, �н����� �߿� '/' ������ ���� �߻���Ű��
		if(id.contains("/") || pwd.contains("/")) {
			throw new JoinException();
					//Ŀ���� ���� ��� : �ٸ� ���� ó�� ���ϱ� ����
		}
		
		//�Է¹��� �����͸� ���Ͽ� �ֱ�
		File f = new File(path);
		
		//��Ʈ�� ����
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(f, true)); //boolean append(�̾��)
			bw.write(id);
			bw.write("/");
			bw.write(pwd);
			bw.write("\n");
			bw.flush(); //���� ������ ���Ϸ� �о��ֱ�
		} catch (IOException e) {
			System.out.println("���ܹ߻�");
		} finally {
			try {bw.close();} catch (IOException e){e.printStackTrace();}
			//��Ʈ�� ���� : ��Ʈ���� ���ǰ� �ִ� �ڿ� �����ֱ�
		}
	}
	
	//ID,PWD �Է¹޴� �޼ҵ�
	public String[] inputUser() {
		System.out.print("ID : ");
		String id = sc.nextLine().trim(); //trim : ���ڿ� ���� ����
		System.out.print("PWD : ");
		String pwd = sc.nextLine().trim();
		
		return new String[] {id,pwd};
//		String[] strArr = new String[2];
//		strArr[0] = id;
//		strArr[1] = pwd;
//		return strArr;
	}
	
}//class
