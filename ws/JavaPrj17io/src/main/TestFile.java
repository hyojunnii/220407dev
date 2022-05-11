package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestFile {

	public void test() {

		// ���� ��ǲ ��Ʈ��

		// ���� ��ü
		File f = new File("D:\\220407dev\\abc.txt");

		boolean result = f.isFile();
		System.out.println(result);

		// ���Ͽ��� ������ �б�
		// 1. ����
		// 2. ��ǲ ��Ʈ�� (FileInputStream(1byte) FileReader(2char))

		// FileInputStream ���� ����
		// 1. ���ڷ� ����
		// 2. �ѱ��ڸ� ����
		
		FileReader fr = null;
		try {
			fr = new FileReader(f);
			int data;
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
			}
		} catch(FileNotFoundException fe) {
			System.out.println("���� ��ã��");
		} catch (IOException e) {
			System.out.println("����� ���� �߻� !!");
		} finally {
			// ���� �߻� ���ο� ���� ���� ������ �����ϴ� �ڵ�
			try {fr.close();} catch (IOException e) {System.out.println("close �� ���� �߻�");}
		}
		
	}
	
	public void test2() {
		
		System.out.println("�۾� �Է��ϱ�");
		
		String str = new Scanner(System.in).nextLine();
		
		//���Ͽ� �۾� ����
		
		//1. ���� ���� ���
		String path = "D:\\220407dev\\abc.txt";
		File f = new File(path);
		
		//2. �����̶� ����
		FileWriter fw = null; //finally close ����
		try {
			fw = new FileWriter(f);
			//3. ������ ����
			fw.write(str);
			fw.flush();
		} catch (IOException e) {
			System.out.println("����� ���� �߻�");
		} finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
		
	}

	public void test3() {
		
		//������Ʈ�� Ȱ���ؼ� �Է¹ޱ� : BufferedReader
		
		//���� ��ü ����
		String path = "D:\\220407dev\\abc.txt";
		File f = new File(path);
		
		//��Ʈ�� ����
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String s = null;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("���� ��ã��");
		} catch (IOException e) {
			System.out.println("�б� ����");
		}
		
	}
	
}// class
