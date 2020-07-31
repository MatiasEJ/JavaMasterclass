package challengeInterface;

import java.util.ArrayList;
import java.util.List;

public class Monster implements SaveObject {
	private String name;
	private int hitPoints;
	private int strength;
	private String weapon;

	public Monster(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.weapon = "Club";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public List<String> write() {
		// TODO Auto-generated method stub
		List<String> values = new ArrayList<String>();
		values.add(0, this.name);
		values.add(1, "" + this.hitPoints);
		values.add(2, "" + this.strength);
		values.add(3, this.weapon);

		return values;
	}

	@Override
	public void Read(List<String> values) {
		// TODO Auto-generated method stub
		if (values != null && values.size() > 0) {
			this.name = values.get(0);
			this.hitPoints = Integer.parseInt(values.get(1));
			this.strength = Integer.parseInt(values.get(2));
			this.weapon = values.get(3);
		}
	}

	@Override
	public String toString() {
		return "Monster [name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength + ", weapon=" + weapon
				+ "]";
	}

}
