package ru.mrskycriper;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

enum CalcAction
{
	plus,
	minus,
	multiply,
	div
}

public class Controller
{
	float firstNumber = 0f;
	float secondNumber = 0f;

	CalcAction operation = CalcAction.plus;

	@FXML
	private Button one;

	@FXML
	private Button two;

	@FXML
	private Button three;

	@FXML
	private Button four;

	@FXML
	private Button five;

	@FXML
	private Button six;

	@FXML
	private Button seven;

	@FXML
	private Button eight;

	@FXML
	private Button nine;

	@FXML
	private Button zero;

	@FXML
	private Button plus;

	@FXML
	private Button minus;

	@FXML
	private Button multiply;

	@FXML
	private Button div;

	@FXML
	private Button clear;

	@FXML
	private Button calculate;

	@FXML
	private TextField display;

	@FXML
	void handleButtonAction(ActionEvent event)
	{
		if (event.getSource() == one)
		{
			display.setText(display.getText() + "1");
		}
		else if (event.getSource() == two)
		{
			display.setText(display.getText() + "2");
		}
		else if (event.getSource() == three)
		{
			display.setText(display.getText() + "3");
		}
		else if (event.getSource() == four)
		{
			display.setText(display.getText() + "4");
		}
		else if (event.getSource() == five)
		{
			display.setText(display.getText() + "5");
		}
		else if (event.getSource() == six)
		{
			display.setText(display.getText() + "6");
		}
		else if (event.getSource() == seven)
		{
			display.setText(display.getText() + "7");
		}
		else if (event.getSource() == eight)
		{
			display.setText(display.getText() + "8");
		}
		else if (event.getSource() == nine)
		{
			display.setText(display.getText() + "9");
		}
		else if (event.getSource() == zero)
		{
			display.setText(display.getText() + "0");
		}
		else if (event.getSource() == clear)
		{
			display.setText("");
		}
		else if (event.getSource() == calculate)
		{
			secondNumber = Float.parseFloat(display.getText());
			display.setText("");
			if (operation == CalcAction.plus)
			{
				display.setText(String.valueOf(firstNumber + secondNumber));
			}
			else if (operation == CalcAction.minus)
			{
				display.setText(String.valueOf(firstNumber - secondNumber));
			}
			else if (operation == CalcAction.multiply)
			{
				display.setText(String.valueOf(firstNumber * secondNumber));
			}
			else if (operation == CalcAction.div)
			{
				if (secondNumber == 0)
				{
					display.setText("Error");
				}
				else
				{
					display.setText(String.valueOf(firstNumber / secondNumber));
				}
			}

			firstNumber = 0f;
			secondNumber = 0f;
			operation = CalcAction.plus;
		}
		else if (event.getSource() == plus)
		{

			firstNumber = Float.parseFloat(display.getText());
			operation = CalcAction.plus;
			display.setText("");

		}
		else if (event.getSource() == minus)
		{

			firstNumber = Float.parseFloat(display.getText());
			operation = CalcAction.minus;
			display.setText("");

		}
		else if (event.getSource() == multiply)
		{

			firstNumber = Float.parseFloat(display.getText());
			operation = CalcAction.multiply;
			display.setText("");

		}
		else if (event.getSource() == div)
		{

			firstNumber = Float.parseFloat(display.getText());
			operation = CalcAction.div;
			display.setText("");

		}
	}
}
