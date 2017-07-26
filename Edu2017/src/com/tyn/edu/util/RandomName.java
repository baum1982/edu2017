package com.tyn.edu.util;

import java.util.Random;

import javax.swing.JOptionPane;

public class RandomName {
	
	
	
	public static void main(String[] args) {
		NameThread th = new NameThread();
		th.start();
		
		JOptionPane.showMessageDialog(null, "확인 버튼을 클릭하면 선택됩니다.");
		th.setStop(true);
		String selectedName = th.getSelectedName();
		
		
		JOptionPane.showMessageDialog(null, selectedName);
		
		
		
	}
		
}


class NameThread extends Thread {
	
	static final String[] names = {
			"강수지",
			"김동건",
			"김동진",
			"김민수",
			"김소영",
			"김연준",
			"김재철",
			"김찬",
			"노유나",
			"노현우",
			"박준용",
			"백지경",
			"변철민",
			"신진우",
			"양시덕",
			"유재민",
			"윤성훈",
			"이상훈",
			"이정근",
			"장정윤",
			"정동석",
			"정호",
			"차대영",
			"최승태",
			"최윤혁",
			"최인호"
	};
	
	boolean isStop = false;
	String name;
	
	
	@Override
	public void run() {
		
		Random r = new Random();
		while(isStop == false){
			name = names[r.nextInt(names.length)];
			System.out.println(name);
		}
	}
	
	
	public void setStop(boolean isStop) {
		this.isStop = isStop;
	}
	
	public String getSelectedName() {
		return name;
	}
}