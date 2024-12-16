package com.assignment2.word.ConcreteFactory;

import com.assignment2.word.AbstractFactory.GuiFactoryWord;
import com.assignment2.word.components.Button;
import com.assignment2.word.components.Panel;
import com.assignment2.word.components.TextBox;
import com.assignment2.word.components.implementation.Word90Button;
import com.assignment2.word.components.implementation.Word90Panel;
import com.assignment2.word.components.implementation.Word90TextBox;

public class Word90Factory extends GuiFactoryWord {

	private static Word90Factory instance;
	private static int count = 0;

	private Word90Factory() {
	}

	public static synchronized Word90Factory getInstance() {
		if (count >= MAX_INSTANCES) {
			System.out.println("Warning: Word90 has exceeded maximum allowed instances (" + MAX_INSTANCES + ") and has current instance ("+(count+1)+")");
		}
		if (instance == null) {
			instance = new Word90Factory();
		}
		count++;
		return instance;
	}

	public static int getCount() {
		return count;
	}

	public static void resetCount() {
		count = 0;
		instance = null;
	}

	@Override
	public Panel createPanel() {
		return new Word90Panel();
	}

	@Override
	public Button createButton() {
		return new Word90Button();
	}

	@Override
	public TextBox createTextbox() {
		return new Word90TextBox();
	}

}
