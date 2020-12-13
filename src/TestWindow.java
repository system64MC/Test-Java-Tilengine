import sun.applet.Main;

public class TestWindow {

    private static final int MAX_LAYERS = 3;
    private static final int LAYER_1 = 0;
    private static final int LAYER_2 = 1;
    private static final int LAYER_3 = 2;
    public static int bgpos[] = new int[6];
    public static int Posx = 0;
    public static int Posy = 0;
    // public static Layer l1 = new Layer(1, "Layer 1", "sonic_md_fg1.tmx", false);


    public static void main(String[] args) {



        // Global.tln.SetLayerBlendMode(1, 1, (byte) 1)
        Global.init();

        //l1.create();
        //RasterEffects raster = new RasterEffects("test", 0);
        //raster.createRaster();
        System.out.println("Test");
        // Global.tln.SetRasterCallback(null, "raster");
        int frame = 0;

        // 1l1.setPosition(100, 100);

        // int foreground =
        //Global.tln.SetLayer(1,1, Global.tln.LoadTilemap ("../assets/sonic_md_fg1.tmx", null));

        //final int tile_width = 16;

        final int size = 8; // 400/16 + 2;



        Global.tln.SetLoadPath ("assets");

        // int foreground = Global.tln.LoadTilemap ("backgrounds/ground.tmx", "Layer 1");
        int foreground = Global.tln.LoadTilemap ("sonic_md_fg1.tmx", "Layer 1");
        System.out.println(foreground);
        Global.tln.SetLayer (0, 0, foreground);
        //Global.tln.SetLayerTilemap(0, Global.tln.LoadTilemap("sonic_md_fg1.tmx", "Layer 1"));
        // int test = Global.tln.GetLayerWidth(0);
        // System.out.println(test);

        // int frame = 0;

        int offsets[] = new int[size];
        //Global.tln.SetLayerColumnOffset(0, offsets);
        int c = 0;


        while(Global.tln.ProcessWindow())
        {
            //if(c < size)
            //{
                //offsets[c] = c/2;
              //  c++;
            //}

            Global.tln.DrawFrame(frame);
            frame++;
        }





    }
    /* linear interpolation helper */

    int lerp (int x, int x0, int x1, int fx0, int fx1) {
        return fx0 + (fx1 - fx0)*(x - x0)/(x1 - x0);
    }



}