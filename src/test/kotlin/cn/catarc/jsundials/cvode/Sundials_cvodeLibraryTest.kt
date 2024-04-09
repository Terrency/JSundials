package cn.catarc.jsundials.cvode

import cn.catarc.jsundials.core.Sundials_coreLibrary
import com.sun.jna.Pointer
import com.sun.jna.ptr.PointerByReference
import org.junit.jupiter.api.Test

class Sundials_cvodeLibraryTest {
    class EvaluateRhs : Sundials_cvodeLibrary.CVRhsFn {
        override fun apply(t: Double, y: Pointer, ydot: Pointer, user_data: Pointer): Int {
            return 0
        }

    }

    @Test
    fun CVodeCreate() {
    }

    @Test
    fun CVodeInit() {
        val ctx = Sundials_cvodeLibrary.SUNContext()
        val p = PointerByReference()
        Sundials_coreLibrary.INSTANCE.SUNContext_Create(Sundials_cvodeLibrary.CV_BDF, p)
        ctx.setPointer(p.getPointer())
        val mem = Sundials_cvodeLibrary.INSTANCE.CVodeCreate(Sundials_cvodeLibrary.CV_BDF, ctx)
        val rhs = EvaluateRhs()
        val flag = Sundials_cvodeLibrary.INSTANCE.CVodeInit(mem, rhs, 1.0, Sundials_cvodeLibrary.N_Vector())
        println(flag)
    }
}