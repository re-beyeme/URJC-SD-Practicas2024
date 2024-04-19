package interfazWeb;

import java.util.Date;

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
public class MatchSoccer {
	
	private Team localTeam;
	private Team visitingTeam;
	private Date schedule;
	private String ResultMatch;
	

}
