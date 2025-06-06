package org.firstinspires.ftc.teamcode.Core.Utils.ToogleBool;

public class ToggleBool {
    private boolean released = true;
    private boolean retVal = false;

    public boolean update(boolean newValue) {
        if(newValue && released) {
            released = false;
            retVal = !retVal;
        }
        if(!newValue) {
            released = true;
        }
        return retVal;
    }
}
