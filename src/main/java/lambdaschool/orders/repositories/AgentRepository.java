package lambdaschool.orders.repositories;

import lambdaschool.orders.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepository extends CrudRepository<Agent, Long> {
}