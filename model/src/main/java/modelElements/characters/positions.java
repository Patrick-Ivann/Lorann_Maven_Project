package modelElements.characters;

public class positions {

	 private int X;
	    private int Y;

	    /**
	     * 
	     */
	    public positions() {
	        this(0,0);
	    }        

		/**
		 * @param X
		 * @param Y
		 */
		public positions(int X, int Y) {
	        this.X = X;
	        this.Y = Y;
	    }
	    /**
	     * @return
	     */
	    public int getX() {
	        return X;
	    }
	    /**
	     * @return
	     */
	    public int getY() {
	        return Y;
	    }
	    /**
	     * @param X
	     */
	    public void setX(int X) {
	        this.X = X;
	    }
	    /**
	     * @param Y
	     */
	    public void setY(int Y) {
	        this.Y = Y;
	    }
}
