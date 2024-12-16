package com.assignment2.word.AbstractFactory;

import com.assignment2.word.components.Button;
import com.assignment2.word.components.Panel;
import com.assignment2.word.components.TextBox;

public abstract class GuiFactoryWord {
	protected static final int MAX_INSTANCES = 2;

	public abstract Panel createPanel();

	public abstract Button createButton();

	public abstract TextBox createTextbox();

}
