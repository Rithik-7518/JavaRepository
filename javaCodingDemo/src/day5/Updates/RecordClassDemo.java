package day5.Updates;

import java.util.Objects;

/*
class DemoData{
	private final int id;
	private final String name;
	
	public DemoData(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "DemoData [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DemoData other = (DemoData) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}
*/

record DemoData (int id,String name) {
	/*
	public DemoData(){
		this(0, "");
	}*/
	public DemoData {
		if(id==0)
			throw new IllegalArgumentException("id cannot be zero");
	}
}

public class RecordClassDemo {

	public static void main(String[] args) {
		
		DemoData d1=new DemoData(1,"msd");
		DemoData d2=new DemoData(1,"msd");
		//DemoData d3 = new DemoData();
		System.out.println(d1.name());
		System.out.println(d1.equals(d2));
		
		System.out.println(d1);
		
		
	}

}
