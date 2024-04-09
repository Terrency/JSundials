package cn.catarc.jsundials

import com.sun.jna.Pointer
import org.junit.jupiter.api.Test

class LibSundials_cvodeDllLibraryTest {
    /*class EvaluateRhs : Sundials_cvodeLibrary.CVRhsFn {
        override fun apply(
            t: Sundials_kinsolLibrary.sunrealtype,
            y: Sundials_kinsolLibrary.N_Vector,
            ydot: Sundials_kinsolLibrary.N_Vector,
            user_data: Pointer
        ): Int {

            return 0
        }

    }*/
    @Test
    fun CVodeInit() {
//        val t = Sundials_kinsolLibrary.sunrealtype()
//        val y = Sundials_kinsolLibrary.N_Vector()
//        val context = SUNContext()
//
//        val mem = Sundials_cvodeLibrary.INSTANCE.CVodeCreate(Sundials_cvodeLibrary.CV_BDF,
//            context
//        )
//        Sundials_coreLibrary.INSTANCE.SUNContext_Create(mem, context.pointer)
//        val flag = Sundials_cvodeLibrary.INSTANCE.CVode(mem, EvaluateRhs(), t, y)
//        println(flag)
    }
}