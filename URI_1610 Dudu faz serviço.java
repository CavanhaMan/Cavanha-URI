/*-------------------*
| Rodrigo CavanhaMan |
| URI 1610           |
| Dudu Faz Servico   |
*--------------------*/
import java.io.*;
import java.util.*;

class Main  {
    public static HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<Integer, ArrayList<Integer>>();  
    
    public static void printAnswer(BufferedWriter bw, boolean loop) throws NumberFormatException, IOException {
        if (loop)
            bw.write("SIM\n");
        else
            bw.write("NAO\n");
    }
    
    public static boolean dfs(int currNode, HashSet<Integer> visited, HashSet<Integer> current) {
        boolean loop = false;
          
        visited.add(currNode);
        current.add(currNode);
        
        ArrayList<Integer> reachables = adjList.get(currNode);
        for (int i = 0; i < reachables.size() && !loop; i++) {
            int node = reachables.get(i);
            if (visited.contains(node) && current.contains(node))
                return true;
            else if (!visited.contains(node))
                loop = dfs(node, visited, current);
        }          
        current.remove(currNode);
        return loop;
    }
    
    public static void readDependencies(BufferedReader br, int numDependencies) throws NumberFormatException, IOException {
        for (int j = 0; j < numDependencies; j++) {
            int doc = reader(br);
            int dep = reader(br);
            adjList.get(doc).add(dep); 
        }
    }
    
    public static void initAdjList(int numDocuments) {
        for (int j = 0; j < numDocuments; j++)
            adjList.put((j+1), new ArrayList<Integer>()); 
    }
    
    static int reader(BufferedReader br) throws NumberFormatException, IOException {      
        int n;
        int resp = 0;        
       
        while (true) {          
            n = br.read();          
            if (n >= '0' && n <= '9')
                break;    
        } 
            
        while (true) {          
            resp = resp*10 + n-'0';          
            n = br.read();          
            if (n < '0' || n > '9')
                break;      
        }
        return resp;      
    }
    
    public static void process() throws NumberFormatException, IOException {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int numCases = reader(br);
        for (int i = 0; i < numCases; i++) {
            int numDocuments = reader(br);
            int numDependencies = reader(br);
            
            initAdjList(numDocuments);
            
            readDependencies(br, numDependencies);
            
            boolean loop = false;
            HashSet<Integer> visited = new HashSet<Integer>();
            for (int j = 0; j < numDocuments && !loop; j++) 
                if (!visited.contains(j+1)) {
                    HashSet<Integer> current = new HashSet<Integer>();
                    loop = dfs(j+1, visited, current);
                }
            
            printAnswer(bw, loop);
            
            adjList.clear();
        }
        
        bw.flush();
        bw.close();
        
        return;
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        Main m = new Main();
        m.process();

        System.exit(0);
    }
}