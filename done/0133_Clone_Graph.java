/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    HashMap<Integer, UndirectedGraphNode> hasgo = new HashMap<Integer, UndirectedGraphNode>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        return main(node);
    }
    
    public UndirectedGraphNode main(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }
        UndirectedGraphNode d;
        if (hasgo.containsKey(node.label)) {
            return hasgo.get(node.label);
        }
        d = new UndirectedGraphNode(node.label);
        hasgo.put(node.label, d);
        ArrayList<UndirectedGraphNode> list = new ArrayList<UndirectedGraphNode>();
        for (UndirectedGraphNode nd:node.neighbors) {
            list.add(main(nd));
        }
        d.neighbors = list;
        return d;
    }
}
