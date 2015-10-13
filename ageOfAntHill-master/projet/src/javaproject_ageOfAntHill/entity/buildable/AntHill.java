package javaproject_ageOfAntHill.entity.buildable;
/**
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *         
 * @version 20150906
 */

public class AntHill extends Building {
	/**
	  * AntHill's informations (HP, armor)
	  */
	 private final static String ANTHILL_TYPE = "AHILL";
	 private final static int ANTHILL_HP = 1000;
	 private final static int DEFAULT_ANTHILL_ARMOR = 10;
	 
	/**
	 * 
	 * antHill's builder 
	 */
	public AntHill(){
		 this.setType(ANTHILL_TYPE);
	 }
}
