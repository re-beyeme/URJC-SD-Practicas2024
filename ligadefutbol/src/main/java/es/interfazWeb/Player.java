/**
 * 
 */
package interfazWeb;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author re.bayeme
 * @param <T>
 *
 */
@Getter 
@Setter
@AllArgsConstructor
public class Player{
	
	private String name;
	private String surnames;
	private String nameSport;
	private String position;
	private double playervalue;
	private double dribble;
	private Team team;

}
