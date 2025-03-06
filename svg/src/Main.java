import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world");
        Point p1 = new Point(30,40);
        Point p2 = new Point();
        p2.setY(40);


        System.out.println(p1);
        System.out.println(p2);

        Segment seg = new Segment(p1,p2);
        System.out.println(seg);
        p2.setX(60);
        System.out.println(seg);

        Point[] arr={p1, p2, p1};
        Polygon poly=new Polygon(arr);
        System.out.println(poly);
        arr[2]=new Point(30,0);
        System.out.println(poly);

        Polygon polyCopy = new Polygon(poly);
        System.out.println(polyCopy);

        poly.setPoint(1,0,40);
        System.out.println("Poly: " +poly);
        System.out.println("Kopia:" +polyCopy);

        System.out.println(polyCopy.toSvg());

        SvgScene scene = new SvgScene();
        scene.addPolygon(poly);
        scene.addPolygon(polyCopy);
        polyCopy.setPoint(0, -50, -50);
        polyCopy.setPoint(1, 0, 0);
        polyCopy.setPoint(2,-100, -30);
        Polygon square = new Polygon(new Point[]{new Point(70, 70), new Point(130, 70), new Point(130, 130), new Point(70, 130) });
        scene.addPolygon(square);
        System.out.println("Scena SVG");
        System.out.println(scene.toSvg());

        System.out.println(polyCopy.boundingBox());

        scene.save("rysunek.svg");
//        p.x = 5.0;
//        p.y = 3.0;
//        System.out.println("(" + p.x + "," + p.y + ")");
//
//        System.out.println("P : " + p.toString());
//
//        System.out.println(p.toSvg());
//
//        p.translate(5, -5);
//        System.out.println("translate: " + p);
//
//        System.out.println("translated: " + p.translated(3, 3));
//        Point translated = p.translated(3, 3);
//        System.out.println("translated 2: " + translated);
//
//        Segment seg = new Segment();
//
//        seg.a = new Point();
//        seg.b = new Point();
//
//        seg.a.x = 1.0;
//        seg.a.y = 1.0;
//        seg.b.x = 3;
//        seg.b.y = 4;
//
//        System.out.println("Seg len: " + seg.length());
//
//        Segment[] tab = new Segment[2];
//        tab[0] = seg;
//        tab[1] = new Segment();
//        tab[1].a = new Point();
//        tab[1].b = new Point();
//        tab[1].a.x = 0;
//        tab[1].a.y = 0;
//        tab[1].b.x = 12;
//        tab[1].b.y = 5;
//
//        Segment longest = Segment.maxSegment(tab);
//        System.out.println("longest: " + longest.length());
//        System.out.println(seg.toSegmentString());
//        System.out.println(seg);
    }
}

