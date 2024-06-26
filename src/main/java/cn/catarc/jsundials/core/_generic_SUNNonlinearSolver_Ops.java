package cn.catarc.jsundials.core;
import cn.catarc.jsundials.core.Sundials_coreLibrary.SUNNonlinSolConvTestFn;
import cn.catarc.jsundials.core.Sundials_coreLibrary.SUNNonlinSolLSetupFn;
import cn.catarc.jsundials.core.Sundials_coreLibrary.SUNNonlinSolLSolveFn;
import cn.catarc.jsundials.core.Sundials_coreLibrary.SUNNonlinSolSysFn;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.LongByReference;
import java.util.Arrays;
import java.util.List;
/**
 * Structure containing function pointers to nonlinear solver operations<br>
 * <i>native declaration : include\sundials\sundials_nonlinearsolver.h:46</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class _generic_SUNNonlinearSolver_Ops extends Structure {
	/** C type : gettype_callback* */
	public _generic_SUNNonlinearSolver_Ops.gettype_callback gettype;
	/** C type : setup_callback* */
	public _generic_SUNNonlinearSolver_Ops.setup_callback setup;
	/** C type : solve_callback* */
	public _generic_SUNNonlinearSolver_Ops.solve_callback solve;
	/** <i>native declaration : include\sundials\sundials_nonlinearsolver.h</i> */
	public interface gettype_callback extends Callback {
		int apply(_generic_SUNNonlinearSolver SUNNonlinearSolver1);
	};
	/** <i>native declaration : include\sundials\sundials_nonlinearsolver.h</i> */
	public interface SUNErrCode_callback extends Callback {
		int apply(_generic_SUNNonlinearSolver SUNNonlinearSolver1);
	};
	/** <i>native declaration : include\sundials\sundials_nonlinearsolver.h</i> */
	public interface setup_callback extends Callback {
		int apply(_generic_SUNNonlinearSolver SUNNonlinearSolver1, _generic_N_Vector N_Vector1, Pointer voidPtr1);
	};
	/** <i>native declaration : include\sundials\sundials_nonlinearsolver.h</i> */
	public interface solve_callback extends Callback {
		int apply(_generic_SUNNonlinearSolver SUNNonlinearSolver1, _generic_N_Vector N_Vector1, _generic_N_Vector N_Vector2, _generic_N_Vector N_Vector3, double sunrealtype1, int int1, Pointer voidPtr1);
	};
	/** <i>native declaration : include\sundials\sundials_nonlinearsolver.h</i> */
	public interface SUNErrCode_callback2 extends Callback {
		int apply(_generic_SUNNonlinearSolver SUNNonlinearSolver1);
	};
	/** <i>native declaration : include\sundials\sundials_nonlinearsolver.h</i> */
	public interface SUNErrCode_callback3 extends Callback {
		int apply(_generic_SUNNonlinearSolver SUNNonlinearSolver1, SUNNonlinSolSysFn SUNNonlinSolSysFn1);
	};
	/** <i>native declaration : include\sundials\sundials_nonlinearsolver.h</i> */
	public interface SUNErrCode_callback4 extends Callback {
		int apply(_generic_SUNNonlinearSolver SUNNonlinearSolver1, SUNNonlinSolLSetupFn SUNNonlinSolLSetupFn1);
	};
	/** <i>native declaration : include\sundials\sundials_nonlinearsolver.h</i> */
	public interface SUNErrCode_callback5 extends Callback {
		int apply(_generic_SUNNonlinearSolver SUNNonlinearSolver1, SUNNonlinSolLSolveFn SUNNonlinSolLSolveFn1);
	};
	/** <i>native declaration : include\sundials\sundials_nonlinearsolver.h</i> */
	public interface SUNErrCode_callback6 extends Callback {
		int apply(_generic_SUNNonlinearSolver SUNNonlinearSolver1, SUNNonlinSolConvTestFn SUNNonlinSolConvTestFn1, Pointer voidPtr1);
	};
	/** <i>native declaration : include\sundials\sundials_nonlinearsolver.h</i> */
	public interface SUNErrCode_callback7 extends Callback {
		int apply(_generic_SUNNonlinearSolver SUNNonlinearSolver1, int int1);
	};
	/** <i>native declaration : include\sundials\sundials_nonlinearsolver.h</i> */
	public interface SUNErrCode_callback8 extends Callback {
		int apply(_generic_SUNNonlinearSolver SUNNonlinearSolver1, LongByReference longPtr1);
	};
	/** <i>native declaration : include\sundials\sundials_nonlinearsolver.h</i> */
	public interface SUNErrCode_callback9 extends Callback {
		int apply(_generic_SUNNonlinearSolver SUNNonlinearSolver1, IntByReference intPtr1);
	};
	/** <i>native declaration : include\sundials\sundials_nonlinearsolver.h</i> */
	public interface SUNErrCode_callback10 extends Callback {
		int apply(_generic_SUNNonlinearSolver SUNNonlinearSolver1, LongByReference longPtr1);
	};
	public _generic_SUNNonlinearSolver_Ops() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("gettype", "setup", "solve");
	}
	/**
	 * @param gettype C type : gettype_callback*<br>
	 * @param setup C type : setup_callback*<br>
	 * @param solve C type : solve_callback*
	 */
	public _generic_SUNNonlinearSolver_Ops(_generic_SUNNonlinearSolver_Ops.gettype_callback gettype, _generic_SUNNonlinearSolver_Ops.setup_callback setup, _generic_SUNNonlinearSolver_Ops.solve_callback solve) {
		super();
		this.gettype = gettype;
		this.setup = setup;
		this.solve = solve;
	}
	public _generic_SUNNonlinearSolver_Ops(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends _generic_SUNNonlinearSolver_Ops implements Structure.ByReference {
		
	};
	public static class ByValue extends _generic_SUNNonlinearSolver_Ops implements Structure.ByValue {
		
	};
}
