package challengeInterface;

import java.util.ArrayList;
import java.util.List;

public class Playa implements SaveObject {
	private String name;
	private String rank;
	private int hp;

	public Playa(String name, String rank, int hp) {
		this.name = name;
		this.rank = rank;
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Playa [name=" + name + ", Rank=" + rank + ", hp=" + hp + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public List<String> write() {
		// TODO Auto-generated method stub
		List<String> values = new ArrayList<String>();
		values.add(0, this.name);
		values.add(1, "" + this.hp);
		values.add(2, this.rank);

		return values;
	}

	@Override
	public void Read(List<String> values) {
		// TODO Auto-generated method stub
		if (values != null && values.size() > 0) {
			this.name = values.get(0);
			this.rank = values.get(1);
			this.hp = Integer.parseInt(values.get(2));
		}
	}
}
