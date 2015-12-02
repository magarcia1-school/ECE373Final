/**
 * 
 */

/**
 * @author phillipshowers
 *
 */


public class GalaxyPlayer 
{
	
	public static final int JEDI = 0;
	public static final int SITH = 1;
	
	private int test = 2;
	private String name;
	private Ship battleShip;
	private String experience;
	private boolean chosenSide;

	public Ship getBattleShip() 
	{
		return battleShip;
	}

	public void setBattleShip(Ship battleShip) 
	{
		this.battleShip = battleShip;
	}

	public String getExperience() 
	{
		return experience;
	}

	public void setExperience(String experience) 
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
