package modelElements.characters;

public class positions {

	 private int X;
	    private int Y;

	    public positions() {
	        this(0,0);
	    }        

		public positions(int X, int Y) {
	        this.X = X;
	        this.Y = Y;
	    }
	    public int getX() {
	        return X;
	    }
	    public int getY() {
	        return Y;
	    }
	    public void setX(int X) {
	        this.X = X;
	    }
	    public void setY(int Y) {
	        this.Y = Y;
	    }
}
