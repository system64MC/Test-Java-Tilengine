import java.lang.Math.*;

public class RasterEffects {



    public RasterEffects(String rasterMode, int layerID) {
        this.rasterMode = rasterMode.toLowerCase();
        this.layerID = layerID;
    }

    public void setRaster()
    {
        Global.tln.SetRasterCallback(this, this.rasterMode);
    }

    public String getRasterMode() {
        return rasterMode.toLowerCase();
    }

    public void setRasterMode(String rasterMode) {
        this.rasterMode = rasterMode.toLowerCase();
    }

    private String rasterMode;
    private int layerID;

    public void createRaster()
    {
        Global.tln.SetRasterCallback(this, rasterMode);
    }

    public void mode7(int line)
    {
        if(line == 24)
        {
            // Global.tln.DisableLayer(layer.getLayerID());
        }
    }

    public static double speed = 0;
    public static double amplitude = 200.0;
    public static double periods = 1;
    public static boolean stch = true;

    public void test2 (int line)
    {
        Global.tln.SetLayerPosition(layerID, (int) (amplitude * Math.sin(((double) Math.toRadians(line) *periods + speed))), 0);

            speed +=0.0002; // stch = !stch;

    }

    public void test (int line)
    {
        // Global.tln.SetLayerPosition(layerID, (int) (amplitude * Math.sin(((double) Math.toRadians(line) *periods + speed))), (int) (amplitude * Math.sin(((double) Math.toRadians(line) *periods + speed))));
        // Global.tln.SetLayerTransform (0, (float) line, 240.0f,160.0f, 1.0f,1.0f);

        speed +=0.0002; // stch = !stch;
        // Global.tln.SetLayerPosition(0, (int)speed,0);
        //if(line > 80 && line < 200) {
            if (line % 2 != 0)
                //Global.tln.SetLayerBlendMode(0, Tilengine.MAX_BLEND, (byte) 255);
                Global.tln.SetLayerPosition(layerID, (int) (amplitude * Math.sin(((double) Math.toRadians(line) * periods + speed - 2 * Math.PI))), 0);
            else
                // Global.tln.SetLayerBlendMode(0, Tilengine.BLEND_NONE, (byte) 255);
                Global.tln.SetLayerPosition(layerID, (int) (amplitude * Math.sin(((double) Math.toRadians(line) * periods + speed + Math.PI))), 0);
            if (amplitude > 0)
                amplitude -= 0.0005;

            // Global.tln.SetLayerMosaic(0, 8,8);
            // speed += 0.0002;
        //}
        //else
            //Global.tln.SetLayerPosition(0,0,0);

    }



}
