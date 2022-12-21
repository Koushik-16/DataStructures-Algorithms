package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    double n1 = 0, n2 = 0, ans = 0;
    int calculation;

    JFrame frame = new JFrame("Scientific Calculator");
    JLabel label = new JLabel();
    JLabel numtoword = new JLabel("Number to Word Convert: ");
    JLabel Scientific = new JLabel("Scientific Calculator");
    JTextField textField = new JTextField();
    JTextField wordField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("X");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");
    JButton buttonEx = new JButton("ex");
    JButton buttonSin = new JButton("sin");
    JButton buttonCos = new JButton("cos");
    JButton buttonTan = new JButton("tan");
    JButton buttonLog = new JButton("log");
    JButton buttonSinh = new JButton("sinh");
    JButton buttonCosh = new JButton("cosh");
    JButton buttonTanh = new JButton("tanh");
    JButton buttonQube = new JButton("X^3");
    JButton buttonXpY = new JButton("X^Y");
    JButton buttonFact = new JButton("X!");
    JButton buttonPlusMinus = new JButton("+/-");
    JButton buttonCE = new JButton("CE");
    JButton convert = new JButton("Convert");

    Calculator() {
        prepareGui();
        addComponents();
        addActionEvent();
    }

    public void prepareGui() {
        frame.setSize(425, 570);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.blue);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public void addComponents() {
        Scientific.setBounds(100, 3, 200, 50);
		Scientific.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(Scientific);

        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(30, 50, 350, 45);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

		numtoword.setBounds(30, 90, 350, 30);
		numtoword.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(numtoword);

        convert.setBounds(300, 97, 80, 20);
        convert.setFocusable(false);
        convert.setFont(new Font("Arial", Font.BOLD, 12));
        convert.setBackground(Color.green);
        convert.setForeground(Color.white);
        frame.add(convert);

        wordField.setBounds(30, 120, 350, 45);
        wordField.setFont(new Font("Arial", Font.BOLD, 20));
        wordField.setEditable(false);
        wordField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(wordField);

        onRadioButton.setBounds(30, 165, 65, 30);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setBackground(Color.green);
        onRadioButton.setForeground(Color.white);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);

        offRadioButton.setBounds(310, 165, 65, 30);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(Color.red);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonSeven.setBounds(100, 335, 65, 40);
        buttonSeven.setFocusable(false);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
		buttonSeven.setBackground(Color.pink);
		buttonSeven.setForeground(Color.white);
        frame.add(buttonSeven);

        buttonEight.setBounds(170, 335, 65, 40);
        buttonEight.setFocusable(false);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
		buttonEight.setBackground(Color.pink);
		buttonEight.setForeground(Color.white);
        frame.add(buttonEight);

        buttonNine.setBounds(240, 335, 65, 40);
        buttonNine.setFocusable(false);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
		buttonNine.setBackground(Color.pink);
		buttonNine.setForeground(Color.white);
        frame.add(buttonNine);

        buttonFour.setBounds(100, 380, 65, 40);
        buttonFour.setFocusable(false);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
		buttonFour.setBackground(Color.pink);
		buttonFour.setForeground(Color.white);
        frame.add(buttonFour);

        buttonFive.setBounds(170, 380, 65, 40);
        buttonFive.setFocusable(false);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
		buttonFive.setBackground(Color.pink);
		buttonFive.setForeground(Color.white);
        frame.add(buttonFive);

        buttonSix.setBounds(240, 380, 65, 40);
        buttonSix.setFocusable(false);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
		buttonSix.setBackground(Color.pink);
		buttonSix.setForeground(Color.white);
        frame.add(buttonSix);

        buttonOne.setBounds(240, 425, 65, 40);
        buttonOne.setFocusable(false);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
		buttonOne.setBackground(Color.pink);
		buttonOne.setForeground(Color.white);
        frame.add(buttonOne);

        buttonTwo.setBounds(170, 425, 65, 40);
        buttonTwo.setFocusable(false);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
		buttonTwo.setBackground(Color.pink);
		buttonTwo.setForeground(Color.white);
        frame.add(buttonTwo);

        buttonThree.setBounds(100, 425, 65, 40);
        buttonThree.setFocusable(false);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
		buttonThree.setBackground(Color.pink);
		buttonThree.setForeground(Color.white);
        frame.add(buttonThree);

        buttonDot.setBounds(240, 470, 65, 40);
        buttonDot.setFocusable(false);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
		buttonDot.setBackground(Color.orange);
		buttonDot.setForeground(Color.white);
        frame.add(buttonDot);

        buttonZero.setBounds(100, 470, 135, 40);
        buttonZero.setFocusable(false);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
		buttonZero.setBackground(Color.pink);
		buttonZero.setForeground(Color.white);
        frame.add(buttonZero);

        buttonEqual.setBounds(310, 470, 65, 40);
        buttonEqual.setFocusable(false);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(Color.orange);
		buttonEqual.setForeground(Color.white);
        frame.add(buttonEqual);
		

        buttonDiv.setBounds(310, 425, 65, 40);
        buttonDiv.setFocusable(false);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(Color.orange);
		buttonDiv.setForeground(Color.white);
        frame.add(buttonDiv);

        buttonSqrt.setBounds(30, 200, 65, 40);
        buttonSqrt.setFocusable(false);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 20));
		buttonSqrt.setBackground(Color.gray);
		buttonSqrt.setForeground(Color.white);
        frame.add(buttonSqrt);

        buttonMul.setBounds(310, 380, 65, 40);
        buttonMul.setFocusable(false);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(Color.orange);
		buttonMul.setForeground(Color.white);
        frame.add(buttonMul);

        buttonMinus.setBounds(310, 335, 65, 40);
        buttonMinus.setFocusable(false);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(Color.orange);
		buttonMinus.setForeground(Color.white);
        frame.add(buttonMinus);

        buttonPlus.setBounds(310, 290, 65, 40);
        buttonPlus.setFocusable(false);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(Color.gray);
		buttonSqrt.setForeground(Color.white);
        frame.add(buttonPlus);

        buttonSquare.setBounds(30, 380, 65, 40);
        buttonSquare.setFocusable(false);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
		buttonSquare.setBackground(Color.orange);
		buttonSquare.setForeground(Color.white);
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(30, 245, 65, 40);
        buttonReciprocal.setFocusable(false);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
		buttonReciprocal.setBackground(Color.gray);
		buttonReciprocal.setForeground(Color.white);
        frame.add(buttonReciprocal);

        buttonDelete.setBounds(240, 290, 65, 40);
        buttonDelete.setFocusable(false);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        frame.add(buttonDelete);

        buttonClear.setBounds(170, 290, 65, 40);
        buttonClear.setFocusable(false);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        frame.add(buttonClear);

        buttonEx.setBounds(100, 200, 65, 40);
        buttonEx.setFocusable(false);
        buttonEx.setFont(new Font("Arial", Font.BOLD, 12));
        buttonEx.setBackground(Color.gray);
        buttonEx.setForeground(Color.white);
        frame.add(buttonEx);

        buttonLog.setBounds(100, 245, 65, 40);
        buttonLog.setFocusable(false);
        buttonLog.setFont(new Font("Arial", Font.BOLD, 12));
        buttonLog.setBackground(Color.gray);
        buttonLog.setForeground(Color.white);
        frame.add(buttonLog);

        buttonSin.setBounds(170, 200, 65, 40);
        buttonSin.setFocusable(false);
        buttonSin.setFont(new Font("Arial", Font.BOLD, 12));
        buttonSin.setBackground(Color.gray);
        buttonSin.setForeground(Color.white);
        frame.add(buttonSin);

        buttonCos.setBounds(240, 200, 65, 40);
        buttonCos.setFocusable(false);
        buttonCos.setFont(new Font("Arial", Font.BOLD, 12));
        buttonCos.setBackground(Color.gray);
        buttonCos.setForeground(Color.white);
        frame.add(buttonCos);

        buttonTan.setBounds(310, 200, 65, 40);
        buttonTan.setFocusable(false);
        buttonTan.setFont(new Font("Arial", Font.BOLD, 12));
        buttonTan.setBackground(Color.gray);
        buttonTan.setForeground(Color.white);
        frame.add(buttonTan);

        buttonSinh.setBounds(170, 245, 65, 40);
        buttonSinh.setFocusable(false);
        buttonSinh.setFont(new Font("Arial", Font.BOLD, 12));
        buttonSinh.setBackground(Color.gray);
        buttonSinh.setForeground(Color.white);
        frame.add(buttonSinh);

        buttonCosh.setBounds(240, 245, 65, 40);
        buttonCosh.setFocusable(false);
        buttonCosh.setFont(new Font("Arial", Font.BOLD, 12));
        buttonCosh.setBackground(Color.gray);
        buttonCosh.setForeground(Color.white);
        frame.add(buttonCosh);

        buttonTanh.setBounds(310, 245, 65, 40);
        buttonTanh.setFocusable(false);
        buttonTanh.setFont(new Font("Arial", Font.BOLD, 12));
        buttonTanh.setBackground(Color.gray);
        buttonTanh.setForeground(Color.white);
        frame.add(buttonTanh);

        buttonQube.setBounds(30, 335, 65, 40);
        buttonQube.setFocusable(false);
        buttonQube.setFont(new Font("Arial", Font.BOLD, 12));
        buttonQube.setBackground(Color.orange);
        buttonQube.setForeground(Color.white);
        frame.add(buttonQube);

        buttonFact.setBounds(30, 425, 65, 40);
        buttonFact.setFocusable(false);
        buttonFact.setFont(new Font("Arial", Font.BOLD, 12));
        buttonFact.setBackground(Color.orange);
        buttonFact.setForeground(Color.white);
        frame.add(buttonFact);

        buttonPlusMinus.setBounds(30, 470, 65, 40);
        buttonPlusMinus.setFocusable(false);
        buttonPlusMinus.setFont(new Font("Arial", Font.BOLD, 12));
        buttonPlusMinus.setBackground(Color.orange);
        buttonPlusMinus.setForeground(Color.white);
        frame.add(buttonPlusMinus);

        buttonXpY.setBounds(30, 290, 65, 40);
        buttonXpY.setFocusable(false);
        buttonXpY.setFont(new Font("Arial", Font.BOLD, 12));
        buttonXpY.setBackground(Color.gray);
        buttonXpY.setForeground(Color.white);
        frame.add(buttonXpY);

        buttonCE.setBounds(100, 290, 65, 40);
        buttonCE.setFocusable(false);
        buttonCE.setFont(new Font("Arial", Font.BOLD, 12));
        buttonCE.setBackground(Color.gray);
        buttonCE.setForeground(Color.white);
        frame.add(buttonCE);
    }

    public void addActionEvent() {
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
    }

    public static void main(String[] args) {
        Calculator calcu = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        if (object == onRadioButton) {
            enable();
        } else if (object == offRadioButton) {
            disable();
        } else if (object == buttonClear) {
            label.setText("");
            textField.setText("");
        } else if (object == buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if (textField.getText().endsWith(""))
                ;
            label.setText("");
        } else if (object == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + ("0"));
            }
        } else if (object == buttonOne) {
            textField.setText(textField.getText() + ("1"));
        } else if (object == buttonThree) {
            textField.setText(textField.getText() + ("3"));
        } else if (object == buttonTwo) {
            textField.setText(textField.getText() + ("2"));
        } else if (object == buttonFour) {
            textField.setText(textField.getText() + ("4"));
        } else if (object == buttonFive) {
            textField.setText(textField.getText() + ("5"));
        } else if (object == buttonSix) {
            textField.setText(textField.getText() + ("6"));
        } else if (object == buttonSeven) {
            textField.setText(textField.getText() + ("7"));
        } else if (object == buttonEight) {
            textField.setText(textField.getText() + ("8"));
        } else if (object == buttonNine) {
            textField.setText(textField.getText() + ("9"));
        } else if (object == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        } else if (object == buttonPlus) {
            String str = textField.getText();
            n1 = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            label.setText(str + "+");
        } else if (object == buttonMinus) {
            String str = textField.getText();
            n1 = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText(str + "-");
        } else if (object == buttonMul) {
            String str = textField.getText();
            n1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(str + "X");
        } else if (object == buttonDiv) {
            String str = textField.getText();
            n1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(str + "/");
        } else if (object == buttonSquare) {
            n1 = Double.parseDouble(textField.getText());
            double square = Math.pow(n1, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText((string.replace(".0", "")));
            } else {
                textField.setText(string);
            }
        } else if (object == buttonSqrt) {
            n1 = Double.parseDouble(textField.getText());
            double sqrt = Math.sqrt(n1);
            textField.setText(Double.toString(sqrt));
        } else if (object == buttonReciprocal) {
            n1 = Double.parseDouble(textField.getText());
            double resiprocal = 1 / n1;
            String string = Double.toString(resiprocal);
            if (string.endsWith(".0")) {
                textField.setText((string.replace(".0", "")));
            } else {
                textField.setText(string);
            }
        } else if (object == buttonEqual) {
            n2 = Double.parseDouble(textField.getText());
            switch (calculation) {
                case 1:
                    ans = n1 + n2;
                    break;
                case 2:
                    ans = n1 - n2;
                    break;
                case 3:
                    ans = n1 * n2;
                    break;
                case 4:
                    ans = n1 / n2;
                    break;

            }
            if (Double.toString(ans).endsWith(".0")) {
                textField.setText(Double.toString(ans).replace(".0", ""));
            } else {
                textField.setText(Double.toString(ans));
            }
            label.setText("");
            n1 = ans;
        }
    }

    public void enable() {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);

    }

    public void disable() {
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setEnabled(false);
        label.setEnabled(false);
        label.setText("");
        textField.setText("");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
    }
}
