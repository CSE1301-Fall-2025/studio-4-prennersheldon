package studio4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		double x = 0.5;
		double y = 0.5;
		double halfWidth = 0.4;
		double halfHeight = 0.2;
		StdDraw.setPenColor(StdDraw.MAGENTA);
		StdDraw.filledRectangle(x, y, halfWidth, halfHeight);

		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.filledEllipse(0.5, 0.5, 0.1, 0.1);
	}
}