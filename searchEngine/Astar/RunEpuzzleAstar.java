public class RunEpuzzleAstar {
    
    public static void main(String[] args) {
		
	    EpuzzleSearch searcher = new EpuzzleSearch();

		//switch between estmated cost strategies by commenting out 
         String remCostStrat = "manhattan" ; 
        //String remCostStrat = "hamming" ;
         
		
        EpuzzGen gen = new EpuzzGen(3563);

        int d = 6;
		int[][] puzz = gen.puzzGen(d);

			SearchState initState1 = (SearchState) new EpuzzleState(puzz, remCostStrat );
			String search1 = searcher.runSearchE(initState1, "Astar");	
			System.out.println("Difficulty : " + d );
		    System.out.println(search1);


		
		// SearchState initState1 = (SearchState) new EpuzzleState(puzz, remCostStrat );
		// String search1 = searcher.runSearchE(initState1, "Astar");	
		// System.out.println("Difficulty : " + d );
		// System.out.println(search1);
		
        
		//int[][] init1 = {{1,0,3},{4,2,6},{7,5,8}};
		//int[][] init2 = {{4,1,3},{7,2,5},{0,8,6}};
		//int[][] init3 = {{2,3,6},{1,5,8},{4,7,0}};

		
		// System.out.println("BreadthFIrst :"); 
	    // for (int i = 4 ; i < 13 ; i= i + 2){
		// 	int[][] puzz = gen.puzzGen(i);
		// 	SearchState initState1 = (SearchState) new EpuzzleState(puzz, remCostStrat );
		// 	String search1 = searcher.runSearchE(initState1, "breadthFirst");	
		// 	System.out.println("Difficulty : " + i );
		//     System.out.println(search1);
		// }

		// System.out.println(); 
		
		// System.out.println("ASTAR : HAmming");

		// for (int i = 6 ; i < 13 ; i= i + 2){
		// 	int[][] puzz = gen.puzzGen(i);
		// 	SearchState initState1 = (SearchState) new EpuzzleState(puzz, remCostStrat );
		// 	String search1 = searcher.runSearchE(initState1, "Astar");	
		// 	System.out.println("Difficulty : " + i );
		//     System.out.println(search1);
		// }

		

		// remCostStrat = "manhattan" ;
		// System.out.println(); 
	
		// System.out.println("ASTAR : Manhattan");


		// for (int i = 6 ; i < 13 ; i= i + 2){
		// 	int[][] puzz = gen.puzzGen(i);
		// 	SearchState initState1 = (SearchState) new EpuzzleState(puzz, remCostStrat );
		// 	String search1 = searcher.runSearchE(initState1, "Astar");	
		// 	System.out.println("Difficulty : " + i );
		//     System.out.println(search1);
		// }

    }

}
