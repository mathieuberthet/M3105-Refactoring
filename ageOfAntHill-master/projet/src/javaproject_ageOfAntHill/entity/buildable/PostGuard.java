package javaproject_ageOfAntHill.entity.buildable;
/**
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 * @version 20150906
 */

public class PostGuard extends Building{
	/**
	  * PostGuard's informations
	  */
	 private final static String POSTGUARD_TYPE = "POSTG";
	 private final static int DEFAULT_POSTGUARD_HP = 500;
	 private final static int DEFAULT_POSTGUARD_ARMOR = 10;
	 /**
	  * create a building with his type(here POSTGUARD_TYPE) 
	  */
	public PostGuard(){
		 this.setType(POSTGUARD_TYPE);
	 }
}
