package com.packtpub.libgdx.canyonbunny.game.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.packtpub.libgdx.canyonbunny.game.Assets;

public class GoldCoin extends AbstractGameObject {

	private TextureRegion regGoldCoin;
	public boolean collected;

	public GoldCoin() {
		init();
	}

	private void init() {
		dimension.set(0.5f, 0.5f);
		regGoldCoin = Assets.instance.goldCoin.goldCoin;
		// Set bounding box for collision detection
		bounds.set(0, 0, dimension.x, dimension.y);
		collected = false;
	}

	@Override
	public void render(SpriteBatch batch) {
		if (!collected) {
			TextureRegion reg = null;
			reg = regGoldCoin;
			batch.draw(reg.getTexture(), position.x, position.y, origin.x, origin.y, dimension.x, dimension.y, scale.x, scale.y, rotation, //
					reg.getRegionX(), reg.getRegionY(), reg.getRegionWidth(), reg.getRegionHeight(), false, false);
		}
	}

	public int getScore() {
		return 100;
	}

}
