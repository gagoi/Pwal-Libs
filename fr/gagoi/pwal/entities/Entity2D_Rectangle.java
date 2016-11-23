package fr.gagoi.pwal.entities;

import fr.gagoi.pwal.hitboxes.Hitbox2D_Rectangle;

public class Entity2D_Rectangle extends EntityBase {

	public Entity2D_Rectangle(String name, Hitbox2D_Rectangle hitbox) {
		super(name);
		this.hitbox = hitbox;
	}

}
