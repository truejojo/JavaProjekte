package de.jojo;
import java.util.Map;

public class EigenschaftenIterator
{
	private Map<String, Object> eigenschaften;
	
	EigenschaftenIterator(Map<String, Object> eigenschaften)
	{
		this.eigenschaften = eigenschaften;
	}
	
	public Object gebeObjekt(String name)
	{
		return this.eigenschaften.get(name);
	}
	
	public void setzeMap(Map<String, Object> eigenschaften)
	{
		this.eigenschaften.putAll(eigenschaften);
	}
	
}
