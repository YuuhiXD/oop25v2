public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Point p = new Point();
        p.x = 5.0;
        p.y = 3.0;
        System.out.println("("+p.x+","+p.y+")");

        System.out.println("P : "+p.toString());

        System.out.println(p.toSvg());

        p.translate(5,-5);
        System.out.println("translate: "+p);

        System.out.println("translated: "+p.translated(3,3));
        Point translated = p.translated(3,3);
        System.out.println("translated 2: "+translated);

        Segment seg = new Segment();

        seg.a = new Point();
        seg.b = new Point();

        seg.a.x=1.0;
        seg.a.y=1.0;
        seg.b.x=3;
        seg.b.y=4;

        System.out.println("Seg len: "+seg.length());
    }
}
