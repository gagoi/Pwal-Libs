package fr.gagoi.pwal.entities;

import fr.gagoi.pwal.hitboxes.IHitbox;

public class EntityBase {
	
	protected IHitbox hitbox;
	private String name;
	
	public EntityBase(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public IHitbox getHitbox(){
		return this.hitbox;
	}
}
