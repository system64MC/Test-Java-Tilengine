public class Global {
    public static Tilengine tln = new Tilengine();

    public static void init()
    {
        Global.tln.Init(400,240,3,128,20);
        Global.tln.CreateWindow("test", Tilengine.CWF_S4);
        // Global.tln.EnableCRTEffect(3, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, true, (byte)5);
    }

    public static int lerp (int x, int x0, int x1, int fx0, int fx1) {
        return fx0 + (fx1 - fx0)*(x - x0)/(x1 - x0);
    }
}
