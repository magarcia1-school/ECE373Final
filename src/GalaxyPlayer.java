/**
 * 
 */

/**
 * @author phillipshowers
 *
 */

public class GalaxyPlayer 
{
	private String name;
	private Ship battleShip;
	private Proficiency experience;

	public Ship getBattleShip() 
	{
		return battleShip;
	}

	public void setBattleShip(Ship battleShip) 
	{
		this.battleShip = battleShip;
	}

	public Proficiency getExperience() 
	{
		return experience;
	}

	public void setExperience(Proficiency experience) 
	{
		this.experience = experience;
	}

	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
}
