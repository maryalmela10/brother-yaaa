package geometriaObjetos;

public class Rectangulo {

	    private int width = 0;
	    private int height = 0;
	    private Point origin;
	 
	    // four constructors
	    public Rectangulo() {
	    origin = new Point(0, 0);
	    }
	    public Rectangulo(Point p) {
	    origin = p;
	    }
	    public Rectangulo(int w, int h) {
	    origin = new Point(0, 0);
	    width = w;
	    height = h;
	    }
	    public Rectangulo(Point p, int w, int h) {
	    origin = p;
	    width = w;
	    height = h;
	    }
	 
	    public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public Point getOrigin() {
			return origin;
		}
		public void setOrigin(Point origin) {
			this.origin = origin;
		}
		
		// a method for moving the rectangle
	    public void move(int x, int y) {
	    	this.origin.setX(x);
	    	this.origin.setY(y);
	    }
	 
	    // a method for computing the area of the rectangle
	    public int getArea() {
	    return width * height;
	    }
}
