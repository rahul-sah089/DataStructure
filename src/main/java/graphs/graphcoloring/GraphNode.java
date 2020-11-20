package graphs.graphcoloring;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/*
Given an undirected graph ↴ with maximum degree ↴ DD, find a graph coloring ↴ using at most D+1 colors.
 */
public class GraphNode {
    private String label;
    private Set<GraphNode> neighbour;
    private Optional<String> color;


    public GraphNode(String label) {
        this.label = label;
        this.neighbour = new HashSet<GraphNode>();
        this.color = Optional.empty();
    }

    public String getLabel() {
        return label;
    }

    public Set<GraphNode> getNeighbour() {
        return Collections.unmodifiableSet(neighbour);
    }



    public Optional<String> getColor() {
        return color;
    }
}
