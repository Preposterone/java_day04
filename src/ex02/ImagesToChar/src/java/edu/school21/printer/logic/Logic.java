package edu.school21.printer.logic;

import com.diogonunes.jcolor.Ansi;
import com.diogonunes.jcolor.Attribute;

import java.awt.image.BufferedImage;

public class Logic {
	private final Attribute whitePixColor;
	private final Attribute blackPixColor;

	public Logic(String whitePixColor, String blackPixColor) {
		this.whitePixColor = resolveColor(whitePixColor);
		this.blackPixColor = resolveColor(blackPixColor);
	}

	public void printImage(BufferedImage image) {
		for (int i = 0; i < image.getHeight(); i++) {
			for (int j = 0; j < image.getWidth(); j++) {
				int pixel = image.getRGB(j, i);
				if ((pixel & 0x00FFFFFF) == 0) {
					System.out.print(Ansi.colorize(" ", blackPixColor));
				} else {
					System.out.print(Ansi.colorize(" ", whitePixColor));
				}
			}
			System.out.println();
		}
	}

	private Attribute resolveColor(String input) throws IllegalColorException {
		switch (input) {
			case "RED":
				return Attribute.RED_BACK();
			case "GREEN":
				return Attribute.GREEN_BACK();
			case "BLUE":
				return Attribute.BLUE_BACK();
			case "BLACK":
				return Attribute.BLACK_BACK();
			case "WHITE":
				return Attribute.WHITE_BACK();

			case "BRIGHT_RED":
				return Attribute.BRIGHT_RED_BACK();
			case "BRIGHT_GREEN":
				return Attribute.BRIGHT_GREEN_BACK();
			case "BRIGHT_BLUE":
				return Attribute.BRIGHT_BLUE_BACK();
			case "BRIGHT_BLACK":
				return Attribute.BRIGHT_BLACK_BACK();
			case "BRIGHT_WHITE":
				return Attribute.BRIGHT_WHITE_BACK();

			default:
				throw new IllegalColorException();
		}
	}
}
