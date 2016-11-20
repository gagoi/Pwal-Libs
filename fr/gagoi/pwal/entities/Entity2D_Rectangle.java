package fr.gagoi.pwal.entities;

import fr.gagoi.pwal.hitboxes.Hitbox2D_Rectangle;
import fr.gagoi.pwal.utils.Vec2D;

public class Entity2D_Rectangle extends EntityBase {

	public Entity2D_Rectangle(String name, Vec2D pos, Vec2D size, Vec2D speed, boolean isHard) {
		super(name);
		this.hitbox = new Hitbox2D_Rectangle(pos, size, speed);
	}

}
