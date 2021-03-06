package javaproject_ageOfAntHill.entity;

/**
 * This class is a scout, a pathfinder This unit got a huge move scope.
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 * @version 20150526
 */
public class Scout extends Unit {
	/**
	 * Scout's informations about speed, armor, ...
	 */
	private final static int DEFAULT_SCOUT_SPEED = 6;
	private static final int DEFAULT_LIGHT_UNIT_ARMOR = 0;
	private static final int DEFAULT_LIGHT_UNIT_DAMAGE = 0;
	private static final int DEFAULT_LIGHT_UNIT_HP_START = 0;
	private final static String SCOUT_TYPE = "SCOUT";

	/**
	 * That creates a Shooter with its default stats.
	 */
	public Scout(int teamNumber) {
		this.setRange(DEFAULT_UNIT_RANGE);
		this.setArmor(DEFAULT_LIGHT_UNIT_ARMOR);
		this.setDamages(DEFAULT_LIGHT_UNIT_DAMAGE);
		this.setMaxHealthPoints(DEFAULT_LIGHT_UNIT_HP_START);
		this.setHealthPoints(DEFAULT_LIGHT_UNIT_HP_START);
		this.setDeplacements(DEFAULT_SCOUT_SPEED);
		this.setTeam(teamNumber);
		this.setType(SCOUT_TYPE);
	}
}
