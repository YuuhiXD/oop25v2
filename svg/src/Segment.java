import static java.lang.Math.pow;

public class Segment {
    public Point a;
    public Point b;

    public double length()
    {
        return Math.sqrt(pow(a.x-b.x,2) + pow(a.y-b.y,2));
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
    public String toSegmentString(){
        return "("+a.x+" , "+a.y+" , "+b.x+", " +b.y+")";
    }
    public String toSegmentSvg()
    {
        return "<rect x=\""+a.x+"\" y=\""+a.y+"\" rx=\""+b.x+"\" ry=\""+b.y+"\" width=\"150\" height=\"150\" style=\"fill:red;stroke:black;stroke-width:5;opacity:0.5\" />";
    }
}

