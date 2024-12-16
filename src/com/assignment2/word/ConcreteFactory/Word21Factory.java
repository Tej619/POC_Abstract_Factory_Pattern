package com.assignment2.word.ConcreteFactory;

import com.assignment2.word.AbstractFactory.GuiFactoryWord;
import com.assignment2.word.components.Button;
import com.assignment2.word.components.Panel;
import com.assignment2.word.components.TextBox;
import com.assignment2.word.components.implementation.Word21Button;
import com.assignment2.word.components.implementation.Word21Panel;
import com.assignment2.word.components.implementation.Word21TextBox;

public class Word21Factory extends GuiFactoryWord {

	private static Word21Factory instance;
	private static int count = 0;

	private Word21Factory() {
	}

	public static synchronized Word21Factory getInstance() {
		if (count >= MAX_INSTANCES) {
			System.out.println("Warning: Word21 has exceeded maximum allowed instances (" + MAX_INSTANCES + ") and has current instance ("+(count+1)+")");
		}
		if (instance == null) {
			instance = new Word21Factory();
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
		return new Word21Panel();
	}

	@Override
	public Button createButton() {
		return new Word21Button();
	}

	@Override
	public TextBox createTextbox() {
		return new Word21TextBox();
	}

}
