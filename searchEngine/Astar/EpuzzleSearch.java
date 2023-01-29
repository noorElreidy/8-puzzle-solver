public class EpuzzleSearch extends Search {
    	
	private int[][] config ; 
	private int[][] target= {{1,2,3},{4,5,6},{7,8,0}};
	
	
	/** constructor  takes  target
	 * @param config current puzzle configuration
	 * @param target configuration
	 */
	public EpuzzleSearch(int[][] config, int[][] target) {
		this.config = config ;
		this.target = target ;
	}
	
	public EpuzzleSearch() {
	}
	
	/**
	 * accessor for current configuration
	 */
	public int[][] getConfig() {
	    return config ;
	}
	
	/**
	 * accessor for target
	 */
	public int[][] getTarget(){
	    return target;
	}

    
}
