package com.company.view;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;

public class View extends JApplet implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Button btn6;
	Button btn7;
	Button btn8;
	Button btn9;
	Button btn0;
	TextField txt1 = new TextField();

	public void init() {
		setSize(400, 400);
		setLayout(new GridLayout(4, 3));

		btn1 = new Button(" 1 ");
		btn2 = new Button(" 2 ");
		btn3 = new Button(" 3 ");
		btn4 = new Button(" 4 ");
		btn5 = new Button(" 5 ");
		btn6 = new Button(" 6 ");
		btn7 = new Button(" 7 ");
		btn8 = new Button(" 8 ");
		btn9 = new Button(" 9 ");
		btn0 = new Button(" 0 ");
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		add(btn0);
		add(txt1);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn0.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1){
			System.out.println("Hello");
		} else if (e.getSource() == btn2){
			System.out.println("2");
		} else if (e.getSource() == btn3){
			System.out.println("3");
		} else if (e.getSource() == btn4){
			System.out.println("4");
		} else if (e.getSource() == btn5){
			System.out.println("5");
		} else if (e.getSource() == btn6){
			System.out.println("6");
		} else if (e.getSource() == btn7){
			System.out.println("7");
		} else if (e.getSource() == btn8){
			System.out.println("8");
		} else if (e.getSource() == btn9){
			System.out.println("9");
		} else {
			System.out.println("0");
		}
	}

}
