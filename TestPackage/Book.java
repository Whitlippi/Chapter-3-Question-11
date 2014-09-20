package TestPackage;
	
	public class Book {
			
		private int currentPage;
		private int numPages;

		protected void initialize(int page){
			numPages = page;
			currentPage = 1;
		}
		
	
		public int getCurrentPage() {
			return currentPage;
		}

		public void setCurrentPage(int currentPage) {
			this.currentPage = currentPage;
		}

		public int getNumPages() {
			return numPages;
		}

		public void setNumPages(int numPages) {
			this.numPages = numPages;
		}

		protected void nextPage() {
			if (currentPage < numPages){
				currentPage++;
		
			}
		}	
}

	
