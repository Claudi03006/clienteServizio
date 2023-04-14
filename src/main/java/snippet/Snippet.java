package snippet;

import java.util.List;

import com.savarino.entities.Servizio;

import jakarta.persistence.OneToMany;

public class Snippet {
	 @OneToMany(mappedBy = "cliente")
	    private List<Servizio> servizi;
}

