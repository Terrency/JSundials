package cn.catarc.jsundials.cvode;

import com.sun.jna.Pointer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sundials_cvodeLibraryTest {

    @Test
    void CVodeCreate() {
    }

    @Test
    void CVodeInit() {
        Sundials_cvodeLibrary.SUNContext ctx = new Sundials_cvodeLibrary.SUNContext();
        Pointer mem = Sundials_cvodeLibrary.INSTANCE.CVodeCreate(Sundials_cvodeLibrary.CV_BDF, ctx);

//        Sundials_cvodeLibrary.INSTANCE.CVodeInit(mem, ctx);
    }
}