public class RunEpuzzleBFS {
    
	public static void main(String[] args) {
		
		EpuzzleSearch searcher = new EpuzzleSearch();
		
        System.out.println("P1 : Breadth-First");
		int[][] init1 = {{1,0,3},{4,2,6},{7,5,8}};
		SearchState initState1 = (SearchState) new EpuzzleState(init1);
		String resb1 = searcher.runSearch(initState1, "breadthFirst");
		System.out.println(resb1);
		
		System.out.println();
		System.out.println("==============");
		System.out.println();
		
		System.out.println("P2 : Breadth-First");
		int[][] init2 = {{4,1,3},{7,2,5},{0,8,6}};
		SearchState initState2 = (SearchState) new EpuzzleState(init2);
		String resb2 = searcher.runSearch(initState2, "breadthFirst");
		System.out.println(resb2);

		System.out.println();
		System.out.println("==============");
		System.out.println(); 
		
		System.out.println("P3 : Breadth-First");
		int[][] init3 = {{2,3,6},{1,5,8},{4,7,0}};
		SearchState initState3 = (SearchState) new EpuzzleState(init3);
		String resb3 = searcher.runSearch(initState3, "breadthFirst");
		System.out.println(resb3);
	}


    
}
