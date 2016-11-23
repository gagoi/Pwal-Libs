package fr.gagoi.pwal.hitboxes;

import fr.gagoi.pwal.utils.Vec2D;

public interface IHitbox {
	
	public static final int DIRECTION_UP = 0;
	public static final int DIRECTION_RIGHT = 1;
	public static final int DIRECTION_DOWN = 2;
	public static final int DIRECTION_LEFT = 3;

	public boolean contain(Vec2D p);
	
	public boolean[] isHard();

	public void setSize(Vec2D size);

	public void setPos(Vec2D pos);

	public void setSpeed(Vec2D speed);

	public Vec2D getSize();

	public Vec2D getPos();

	public Vec2D getSpeed();
	
	public void moove();

	public boolean collide(IHitbox hitbox);
}
