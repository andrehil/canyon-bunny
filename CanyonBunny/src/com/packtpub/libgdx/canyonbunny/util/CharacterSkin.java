package com.packtpub.libgdx.canyonbunny.util;

import com.badlogic.gdx.graphics.Color;

public enum CharacterSkin {

	WHITE("White", 1.0f, 1.0f, 1.0f),

	GRAY("Gray", 0.7f, 0.7f, 0.7f),

	BROWN("Brown", 0.7f, 0.5f, 0.3f);

	private String name;
	private final Color color = new Color();

	private CharacterSkin(String name, float r, float g, float b) {
		this.name = name;
		color.set(r, g, b, 1.0f);
	}

	@Override
	public String toString() {
		return name;
	}

	public Color getColor() {
		return color;
	}
}