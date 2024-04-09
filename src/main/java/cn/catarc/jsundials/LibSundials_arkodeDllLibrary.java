package cn.catarc.jsundials;

import cn.catarc.jsundials.LibSundials_coreDllLibrary.sunrealtype;
import com.sun.jna.*;
/**
 * JNA Wrapper for library <b>lib\sundials_arkode.dll</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public interface LibSundials_arkodeDllLibrary extends Library {
	public static final String JNA_LIBRARY_NAME = "lib\\sundials_arkode.dll";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(LibSundials_arkodeDllLibrary.JNA_LIBRARY_NAME);
	public static final LibSundials_arkodeDllLibrary INSTANCE = (LibSundials_arkodeDllLibrary)Native.loadLibrary(LibSundials_arkodeDllLibrary.JNA_LIBRARY_NAME, LibSundials_arkodeDllLibrary.class);
	/**
	 * <i>native declaration : include\arkode\arkode.h</i><br>
	 * enum values
	 */
	public static interface ARKRelaxSolver {
		/** <i>native declaration : include\arkode\arkode.h:153</i> */
		public static final int ARK_RELAX_BRENT = 0;
		/** <i>native declaration : include\arkode\arkode.h:154</i> */
		public static final int ARK_RELAX_NEWTON = 1;
	};
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_NORMAL = (int)1;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_ONE_STEP = (int)2;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_ADAPT_CUSTOM = (int)-1;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_ADAPT_PID = (int)0;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_ADAPT_PI = (int)1;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_ADAPT_I = (int)2;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_ADAPT_EXP_GUS = (int)3;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_ADAPT_IMP_GUS = (int)4;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_ADAPT_IMEX_GUS = (int)5;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_FULLRHS_START = (int)0;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_FULLRHS_END = (int)1;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_FULLRHS_OTHER = (int)2;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_INTERP_MAX_DEGREE = (int)5;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_INTERP_HERMITE = (int)0;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_INTERP_LAGRANGE = (int)1;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_SUCCESS = (int)0;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_TSTOP_RETURN = (int)1;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_ROOT_RETURN = (int)2;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_WARNING = (int)99;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_TOO_MUCH_WORK = (int)-1;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_TOO_MUCH_ACC = (int)-2;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_ERR_FAILURE = (int)-3;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_CONV_FAILURE = (int)-4;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_LINIT_FAIL = (int)-5;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_LSETUP_FAIL = (int)-6;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_LSOLVE_FAIL = (int)-7;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_RHSFUNC_FAIL = (int)-8;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_FIRST_RHSFUNC_ERR = (int)-9;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_REPTD_RHSFUNC_ERR = (int)-10;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_UNREC_RHSFUNC_ERR = (int)-11;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_RTFUNC_FAIL = (int)-12;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_LFREE_FAIL = (int)-13;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_MASSINIT_FAIL = (int)-14;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_MASSSETUP_FAIL = (int)-15;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_MASSSOLVE_FAIL = (int)-16;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_MASSFREE_FAIL = (int)-17;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_MASSMULT_FAIL = (int)-18;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_CONSTR_FAIL = (int)-19;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_MEM_FAIL = (int)-20;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_MEM_NULL = (int)-21;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_ILL_INPUT = (int)-22;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_NO_MALLOC = (int)-23;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_BAD_K = (int)-24;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_BAD_T = (int)-25;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_BAD_DKY = (int)-26;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_TOO_CLOSE = (int)-27;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_VECTOROP_ERR = (int)-28;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_NLS_INIT_FAIL = (int)-29;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_NLS_SETUP_FAIL = (int)-30;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_NLS_SETUP_RECVR = (int)-31;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_NLS_OP_ERR = (int)-32;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_INNERSTEP_ATTACH_ERR = (int)-33;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_INNERSTEP_FAIL = (int)-34;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_OUTERTOINNER_FAIL = (int)-35;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_INNERTOOUTER_FAIL = (int)-36;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_POSTPROCESS_FAIL = (int)-37;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_POSTPROCESS_STEP_FAIL = (int)-37;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_POSTPROCESS_STAGE_FAIL = (int)-38;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_USER_PREDICT_FAIL = (int)-39;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_INTERP_FAIL = (int)-40;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_INVALID_TABLE = (int)-41;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_CONTEXT_ERR = (int)-42;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_RELAX_FAIL = (int)-43;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_RELAX_MEM_NULL = (int)-44;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_RELAX_FUNC_FAIL = (int)-45;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_RELAX_JAC_FAIL = (int)-46;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_CONTROLLER_ERR = (int)-47;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public static final int ARK_UNRECOGNIZED_ERROR = (int)-99;
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public interface ARKRhsFn extends Callback {
		int apply(sunrealtype t, _generic_N_Vector y, _generic_N_Vector ydot, Pointer user_data);
	};
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public interface ARKRootFn extends Callback {
		int apply(sunrealtype t, _generic_N_Vector y, sunrealtype gout, Pointer user_data);
	};
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public interface ARKEwtFn extends Callback {
		int apply(_generic_N_Vector y, _generic_N_Vector ewt, Pointer user_data);
	};
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public interface ARKRwtFn extends Callback {
		int apply(_generic_N_Vector y, _generic_N_Vector rwt, Pointer user_data);
	};
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public interface ARKAdaptFn extends Callback {
		int apply(_generic_N_Vector y, sunrealtype t, sunrealtype h1, sunrealtype h2, sunrealtype h3, sunrealtype e1, sunrealtype e2, sunrealtype e3, int q, int p, sunrealtype hnew, Pointer user_data);
	};
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public interface ARKExpStabFn extends Callback {
		int apply(_generic_N_Vector y, sunrealtype t, sunrealtype hstab, Pointer user_data);
	};
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public interface ARKVecResizeFn extends Callback {
		int apply(_generic_N_Vector y, _generic_N_Vector ytemplate, Pointer user_data);
	};
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public interface ARKPostProcessFn extends Callback {
		int apply(sunrealtype t, _generic_N_Vector y, Pointer user_data);
	};
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public interface ARKStagePredictFn extends Callback {
		int apply(sunrealtype t, _generic_N_Vector zpred, Pointer user_data);
	};
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public interface ARKRelaxFn extends Callback {
		int apply(_generic_N_Vector y, sunrealtype r, Pointer user_data);
	};
	/** <i>native declaration : include\arkode\arkode.h</i> */
	public interface ARKRelaxJacFn extends Callback {
		int apply(_generic_N_Vector y, _generic_N_Vector J, Pointer user_data);
	};
}
