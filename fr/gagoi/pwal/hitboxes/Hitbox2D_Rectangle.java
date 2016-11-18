package fr.gagoi.pwal.hitboxes;

import fr.gagoi.pwal.utils.Vec2D;
import fr.gagoi.pwal.utils.VecUtils;

public class Hitbox2D_Rectangle implements IHitbox {

	private Vec2D pos;
	private Vec2D size;
	private Vec2D speed;

	private boolean isHard;

	public Hitbox2D_Rectangle() {
		this.pos = new Vec2D();
		this.size = new Vec2D(1, 1);
		this.speed = new Vec2D();
	}

	public Hitbox2D_Rectangle(Vec2D pos, Vec2D size, Vec2D speed) {
		this.pos = pos;
		this.size = size;
		this.speed = speed;
	}

	@Override
	public boolean contain(Vec2D p) {
		return VecUtils.isInferior(pos, p) && VecUtils.isSuperior(VecUtils.summOf(pos, size), p);
	}

	@Override
	public void setSize(Vec2D size) {
		this.size = size;
	}

	@Override
	public void setPos(Vec2D pos) {
		this.pos = pos;
	}

	@Override
	public void setSpeed(Vec2D speed) {
		this.speed = speed;
	}

	@Override
	public Vec2D getSize() {
		return size;
	}

	@Override
	public Vec2D getPos() {
		return pos;
	}

	@Override
	public Vec2D getSpeed() {
		return speed;
	}

	@Override
	public boolean isHard() {
		return isHard;
	}

	public boolean isTouchingOnSide(int side) {
		switch (side) {
		case 0:
			return false;
		case 1:
			return false;
		case 2:
			return false;
		case 3:
			return false;
		}
		return false;
	}

	@Override
	public void moove() {
	}

}
