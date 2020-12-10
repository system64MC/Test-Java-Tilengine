public class GamePad {

    public GamePad() {
    }

    public boolean isLeftPressed()
    {
        return Global.tln.GetInput(Tilengine.INPUT_LEFT);
    }

    public boolean isRightPressed()
    {
        return Global.tln.GetInput(Tilengine.INPUT_RIGHT);
    }

}
