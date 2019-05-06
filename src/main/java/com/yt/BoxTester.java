package com.yt;

import javax.swing.*;

public class BoxTester {
    public static void main(String[] args) {
        Box3 box3 = null;
        Box5 box5 = null;
        int number = 0;

        while (number != -1) {
            String numberStr = JOptionPane.showInputDialog("If you input -1, it will close the program.\n" +
                    "Please choose box.\nBox3: input 3.\nBox5: input 5");
            number = Integer.parseInt(numberStr);
            if (number != -1) {
                String lengthStr = JOptionPane.showInputDialog("Please enter object's length:");
                float length = Float.parseFloat(lengthStr);

                String widthStr = JOptionPane.showInputDialog("Please enter object's width:");
                float width = Float.parseFloat(widthStr);

                String heightStr = JOptionPane.showInputDialog("Please enter object's height:");
                int height = Integer.parseInt(heightStr);

                switch (number) {
                    case 3:
                        try {
                            box3 = new Box3(length, width, height);
                        } catch (SizeException e) {
                            e.getMessage();
                        }
                        JOptionPane.showMessageDialog(null,
                                "Things could place in the box3:"
                                + box3.validate(length, width, height));
                        break;
                    case 5:
                        try {
                            box5 = new Box5(length, width, height);
                        } catch (SizeException e) {
                            e.getMessage();
                        }
                        JOptionPane.showMessageDialog(null,
                                "Things could place in the box5:"
                                + box5.validate(length, width, height));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,
                                "Please select the right box.");
                }
            }
        }

    }
}
