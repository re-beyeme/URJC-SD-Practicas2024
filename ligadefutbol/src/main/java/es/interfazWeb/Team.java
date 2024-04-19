package interfazWeb;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author re.bayeme
 *
 */
@Getter 
@Setter
@AllArgsConstructor
public class Team {
	
	private String name;
	private int foundationyear;
	private double budgetTeam;
	private double dribble;
	private List<Player> players;
	
	

}
