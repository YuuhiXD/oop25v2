import java.util.Arrays;

public class Polygon {
    private Point[] vertices;

    public Polygon(Point[] vertices, Style style) {
        this.vertices = new Point[vertices.length];
        for(int i=0;i<vertices.length;i++)
        {
            this.vertices[i]=new Point(vertices[i]);
        }
    }

    public Polygon(Polygon other)
    {
        this.vertices=new Point[other.vertices.length];
        for(int i=0;i<other.vertices.length;i++)
        {
            this.vertices[i]=new Point(other.vertices[i]);
        }
    }

    public void setPoint(int ix, int x, int y)
    {
        this.vertices[ix].setX(x);
        this.vertices[ix].setY(y);
    }

    public BoundingBox boundingBox()
    {
        if(vertices.length==0)
        {
            return null;
        }

        double minX = vertices[0].getX();
        double maxX = vertices[0].getX();
        double minY = vertices[0].getY();
        double maxY = vertices[0].getY();
        for(int i=1;i< vertices.length;i++)
        {
            if(vertices[i].getX()<minX) minX=vertices[i].getX();
            if(vertices[i].getX()>maxX) maxX=vertices[i].getX();
            if(vertices[i].getY()<minY) minY=vertices[i].getY();
            if(vertices[i].getY()>maxY) maxY=vertices[i].getY();

        }
        return new BoundingBox(minX,minY,maxX-minX,maxY-minY);
    }
//TODO: dodać klasę style z polami fill, stroke, stroke_width
    // TODO: dodać pole style w tej klasie i zamienić atrybut style poniżej
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for(Point p : vertices)
        {
            s.append(p.getX()).append(",").append(p.getY()).append(" ");
        }
        return s.toString().trim();
    }

    public String toSvg()
    {
        return "<polygon points=\""+
                this
                +"\" style=\"fill:none;stroke:purple;stroke-width:3\" />";
    }
}
