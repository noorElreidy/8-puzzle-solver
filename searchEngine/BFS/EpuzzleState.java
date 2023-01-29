import java.util.ArrayList;

import java.util.Arrays;

public class EpuzzleState extends SearchState{
    	
	private int[][] config;
	
	/**
	 * Epuzzle state constructor
	 * @param config a 2d array representing puzzle configuration
	 */
	public EpuzzleState(int[][] config) {
		this.config = config;
	}
	
	/**
	 * @return the 2d array of the state
	 */
	public int[][] getConfig(){
		return config;
	}
	
	/**
	 * deep copies array 
	 * @param arr a 2d array
	 * @return a 2d array deep copy of passed in parameter
	 */
	private int[][] copyArray(int[][] arr){
		
	    int[][] deepCopy = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
	    for (int i = 0 ; i < 3 ; i ++) {
	    	for (int j = 0 ; j < 3 ; j ++) {
	    		deepCopy[i][j] = arr[i][j];
	    	}
	    }
	    return deepCopy;
	}

	/**
	 * goalPredicate
	 * @param searcher - the current search
	 */
	@Override
	boolean goalPredicate(Search searcher) {
		EpuzzleSearch jsearcher = (EpuzzleSearch) searcher;
	    int[][] tar = jsearcher.getTarget(); // get target amount
	    return (Arrays.deepEquals(config, tar));
	}

	/**
	 * @param searcher of type search 
	 * @return an array list of current state's successors 
	 */
	@Override
	ArrayList<SearchState> getSuccessors(Search searcher) {
		int row = -1 , column = -1; 
		
		ArrayList<EpuzzleState> jslis = new ArrayList<EpuzzleState>();
	    ArrayList<SearchState> slis = new ArrayList<SearchState>();
		
		//finds out position of empty tile in configuration
		for (int i = 0; i < 3 ; i ++) {
		    for (int j = 0 ; j < 3 ; j ++) {
		    	if (config[i][j] == 0) {
		    		row = i ;
		    		column = j ;
		    	}
		    }
		}
        
		//moves empty tile down
		if (row < 2) {
			int[][] succConfig = copyArray(config) ; 
			succConfig[row][column] = succConfig[row+1][column];
			succConfig[row+1][column] = 0 ;
			jslis.add(new EpuzzleState(succConfig));
		}
		
		//moves empty tile up
		if (row > 0) {
			int[][] succConfig = copyArray(config) ; 
			succConfig[row][column] = succConfig[row-1][column];
			succConfig[row-1][column] = 0 ; 
			jslis.add(new EpuzzleState(succConfig));
		}
		
		//moves empty tile to the right
		if (column < 2) {
			int[][] succConfig = copyArray(config) ; 
			succConfig[row][column] = succConfig[row][column+1];
			succConfig[row][column+1] = 0 ; 
			jslis.add(new EpuzzleState(succConfig));
		}
		
		//moves empty tile to the left
		if (column > 0) {
			int[][] succConfig = copyArray(config) ; 
			succConfig[row][column] = succConfig[row][column-1];
			succConfig[row][column-1] = 0 ; 
			jslis.add(new EpuzzleState(succConfig));
		}
		
		
		for (EpuzzleState js : jslis)
		      slis.add((SearchState) js);
		
		return slis;
	}

	/**
	 * @param n2 a state of type Search state 
	 * @returns true if parameter state is equal to current state 
	 */
	@Override
	boolean sameState(SearchState n2) {
		EpuzzleState paraState = (EpuzzleState) n2 ;
		int[][] paraConfig = paraState.getConfig();
		boolean same = true; 
		
		for (int i = 0; i < 3 ; i ++) {
		    for (int j = 0 ; j < 3 ; j ++) {
		    	if (config[i][j] != paraConfig[i][j]) {
		    	    same = false ;
		    	}
		    }
		}
		
		return same;
	}
	
	public String toString() {
		String output = "\r\n";
		for (int i = 0; i < 3 ; i ++) {
		    for (int j = 0 ; j < 3 ; j ++) {
		    	output += config[i][j];
		    }
		    output += "\r\n" ;
		}
	    return output;
	  }


}
