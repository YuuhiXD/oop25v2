import static java.lang.Math.pow;

public class Segment {
    private final Point a;
    private final Point b;

    public Segment(Point a, Point b) {
        this.a = new Point(a);
        this.b = new Point(b);
    }

    public double length()
    {
        return Math.sqrt(pow(a.getX()-b.getX(),2) + pow(a.getY() -b.getY(),2));
    }
    public static Segment maxSegment(Segment[] arr)
    {
        if (arr.length==0) return null;

        Segment max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i].length() > max.length())
            {
                max=arr[i];
            }
        }
        return max;
    }
//gg
    @Override
    public String toString() {
        return "{" + "a=" + a + ", b=" + b + '}';
    }

    public String toSegmentSvg()
    {
        return "<rect x=\""+ a.getX()+"\" y=\""+ a.getY()+"\" rx=\""+ b.getX()+"\" ry=\""+ b.getY()+"\" width=\"150\" height=\"150\" style=\"fill:red;stroke:black;stroke-width:5;opacity:0.5\" />";
    }
}

