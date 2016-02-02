package mpei.bkm.model.lq.query;

import java.util.ArrayList;
import java.util.List;


public class Query {
    private List<Goal> goals = new ArrayList<Goal>();
    private List<Condition> conditions = new ArrayList<Condition>();

    public Query(List<Goal> goals, List<Condition> conditions) {
        this.goals = goals;
        this.conditions = conditions;
    }

    public List<Goal> getGoals() {
        return goals;
    }

    public List<Condition> getConditions() {
        return conditions;
    }
}
