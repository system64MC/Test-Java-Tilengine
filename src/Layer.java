public class Layer {

    //import Tilengine;

    // Tilengine tln = new Tilengine();


    public Layer(int layerID, String layerName, String tilemap, boolean background) {
        this.layerID = layerID;
        this.layerName = layerName;
        this.tilemap = tilemap;
        if(!background)
            Global.tln.SetLoadPath ("assets");
        else
            Global.tln.SetLoadPath("assets/backgrounds");
    }

    public void setPosition(int x, int y)
    {
        Global.tln.SetLayerPosition(this.layerID, x, y);
    }

    private int layerID;
    private String layerName;
    private String tilemap;

    public int getLayerID() {
        return layerID;
    }

    public void setLayerID(int layerID) {
        this.layerID = layerID;
    }

    public void create()
    {
        int foreground = Global.tln.LoadTilemap (tilemap, layerName);
        Global.tln.SetLayer (0, 0, foreground);
    }

    //public static void setLayer(int layers[])
    //{
    //    layers[1] Global.tln.LoadTilemap()
    //}
}
