package cn.catarc.jsundials;

import cn.catarc.jsundials.LibSundials_coreDllLibrary.FILE;
import cn.catarc.jsundials.LibSundials_coreDllLibrary.SUNContext;
import cn.catarc.jsundials.LibSundials_coreDllLibrary.sunrealtype;
import cn.catarc.jsundials._generic_N_Vector.ByReference;
import com.sun.jna.*;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.LongByReference;
import com.sun.jna.ptr.PointerByReference;

import java.nio.IntBuffer;
import java.nio.LongBuffer;
/**
 * JNA Wrapper for library <b>lib\sundials_cvode.dll</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public interface LibSundials_cvodeDllLibrary extends Library {
	public static final String JNA_LIBRARY_NAME = "lib\\sundials_cvode.dll";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(LibSundials_cvodeDllLibrary.JNA_LIBRARY_NAME);
	public static final LibSundials_cvodeDllLibrary INSTANCE = (LibSundials_cvodeDllLibrary)Native.loadLibrary(LibSundials_cvodeDllLibrary.JNA_LIBRARY_NAME, LibSundials_cvodeDllLibrary.class);
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_ADAMS = (int)1;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_BDF = (int)2;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_NORMAL = (int)1;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_ONE_STEP = (int)2;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_SUCCESS = (int)0;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_TSTOP_RETURN = (int)1;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_ROOT_RETURN = (int)2;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_WARNING = (int)99;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_TOO_MUCH_WORK = (int)-1;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_TOO_MUCH_ACC = (int)-2;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_ERR_FAILURE = (int)-3;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_CONV_FAILURE = (int)-4;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_LINIT_FAIL = (int)-5;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_LSETUP_FAIL = (int)-6;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_LSOLVE_FAIL = (int)-7;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_RHSFUNC_FAIL = (int)-8;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_FIRST_RHSFUNC_ERR = (int)-9;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_REPTD_RHSFUNC_ERR = (int)-10;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_UNREC_RHSFUNC_ERR = (int)-11;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_RTFUNC_FAIL = (int)-12;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_NLS_INIT_FAIL = (int)-13;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_NLS_SETUP_FAIL = (int)-14;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_CONSTR_FAIL = (int)-15;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_NLS_FAIL = (int)-16;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_MEM_FAIL = (int)-20;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_MEM_NULL = (int)-21;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_ILL_INPUT = (int)-22;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_NO_MALLOC = (int)-23;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_BAD_K = (int)-24;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_BAD_T = (int)-25;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_BAD_DKY = (int)-26;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_TOO_CLOSE = (int)-27;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_VECTOROP_ERR = (int)-28;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_PROJ_MEM_NULL = (int)-29;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_PROJFUNC_FAIL = (int)-30;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_REPTD_PROJFUNC_ERR = (int)-31;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_CONTEXT_ERR = (int)-32;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public static final int CV_UNRECOGNIZED_ERR = (int)-99;
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public interface CVRhsFn extends Callback {
		int apply(sunrealtype t, _generic_N_Vector y, _generic_N_Vector ydot, Pointer user_data);
	};
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public interface CVRootFn extends Callback {
		int apply(sunrealtype t, _generic_N_Vector y, sunrealtype gout, Pointer user_data);
	};
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public interface CVEwtFn extends Callback {
		int apply(_generic_N_Vector y, _generic_N_Vector ewt, Pointer user_data);
	};
	/** <i>native declaration : include\cvode\cvode.h</i> */
	public interface CVMonitorFn extends Callback {
		int apply(Pointer cvode_mem, Pointer user_data);
	};
	/**
	 * Initialization functions<br>
	 * Original signature : <code>void* CVodeCreate(int, SUNContext)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:80</i><br>
	 * @deprecated use the safer methods {@link #CVodeCreate(int, SUNContext)} and {@link #CVodeCreate(int, Pointer)} instead
	 */
	@Deprecated 
	Pointer CVodeCreate(int lmm, Pointer sunctx);
	/**
	 * Initialization functions<br>
	 * Original signature : <code>void* CVodeCreate(int, SUNContext)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:80</i>
	 */
	Pointer CVodeCreate(int lmm, SUNContext sunctx);
	/**
	 * Original signature : <code>int CVodeInit(void*, CVRhsFn, sunrealtype, N_Vector)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:82</i>
	 */
	int CVodeInit(Pointer cvode_mem, CVRhsFn f, sunrealtype t0, _generic_N_Vector y0);
	/**
	 * Original signature : <code>int CVodeReInit(void*, sunrealtype, N_Vector)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:84</i>
	 */
	int CVodeReInit(Pointer cvode_mem, sunrealtype t0, _generic_N_Vector y0);
	/**
	 * Tolerance input functions<br>
	 * Original signature : <code>int CVodeSStolerances(void*, sunrealtype, sunrealtype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:87</i>
	 */
	int CVodeSStolerances(Pointer cvode_mem, sunrealtype reltol, sunrealtype abstol);
	/**
	 * Original signature : <code>int CVodeSVtolerances(void*, sunrealtype, N_Vector)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:89</i>
	 */
	int CVodeSVtolerances(Pointer cvode_mem, sunrealtype reltol, _generic_N_Vector abstol);
	/**
	 * Original signature : <code>int CVodeWFtolerances(void*, CVEwtFn)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:91</i>
	 */
	int CVodeWFtolerances(Pointer cvode_mem, CVEwtFn efun);
	/**
	 * Optional input functions<br>
	 * Original signature : <code>int CVodeSetConstraints(void*, N_Vector)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:95</i>
	 */
	int CVodeSetConstraints(Pointer cvode_mem, _generic_N_Vector constraints);
	/**
	 * Original signature : <code>int CVodeSetDeltaGammaMaxLSetup(void*, sunrealtype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:96</i>
	 */
	int CVodeSetDeltaGammaMaxLSetup(Pointer cvode_mem, sunrealtype dgmax_lsetup);
	/**
	 * Original signature : <code>int CVodeSetInitStep(void*, sunrealtype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:98</i>
	 */
	int CVodeSetInitStep(Pointer cvode_mem, sunrealtype hin);
	/**
	 * Original signature : <code>int CVodeSetLSetupFrequency(void*, long long)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:99</i>
	 */
	int CVodeSetLSetupFrequency(Pointer cvode_mem, long msbp);
	/**
	 * Original signature : <code>int CVodeSetMaxConvFails(void*, int)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:100</i>
	 */
	int CVodeSetMaxConvFails(Pointer cvode_mem, int maxncf);
	/**
	 * Original signature : <code>int CVodeSetMaxErrTestFails(void*, int)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:101</i>
	 */
	int CVodeSetMaxErrTestFails(Pointer cvode_mem, int maxnef);
	/**
	 * Original signature : <code>int CVodeSetMaxHnilWarns(void*, int)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:102</i>
	 */
	int CVodeSetMaxHnilWarns(Pointer cvode_mem, int mxhnil);
	/**
	 * Original signature : <code>int CVodeSetMaxNonlinIters(void*, int)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:103</i>
	 */
	int CVodeSetMaxNonlinIters(Pointer cvode_mem, int maxcor);
	/**
	 * Original signature : <code>int CVodeSetMaxNumSteps(void*, long long)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:104</i>
	 */
	int CVodeSetMaxNumSteps(Pointer cvode_mem, long mxsteps);
	/**
	 * Original signature : <code>int CVodeSetMaxOrd(void*, int)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:105</i>
	 */
	int CVodeSetMaxOrd(Pointer cvode_mem, int maxord);
	/**
	 * Original signature : <code>int CVodeSetMaxStep(void*, sunrealtype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:106</i>
	 */
	int CVodeSetMaxStep(Pointer cvode_mem, sunrealtype hmax);
	/**
	 * Original signature : <code>int CVodeSetMinStep(void*, sunrealtype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:107</i>
	 */
	int CVodeSetMinStep(Pointer cvode_mem, sunrealtype hmin);
	/**
	 * Original signature : <code>int CVodeSetMonitorFn(void*, CVMonitorFn)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:108</i>
	 */
	int CVodeSetMonitorFn(Pointer cvode_mem, CVMonitorFn fn);
	/**
	 * Original signature : <code>int CVodeSetMonitorFrequency(void*, long long)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:109</i>
	 */
	int CVodeSetMonitorFrequency(Pointer cvode_mem, long nst);
	/**
	 * Original signature : <code>int CVodeSetNlsRhsFn(void*, CVRhsFn)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:110</i>
	 */
	int CVodeSetNlsRhsFn(Pointer cvode_mem, CVRhsFn f);
	/**
	 * Original signature : <code>int CVodeSetNonlinConvCoef(void*, sunrealtype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:111</i>
	 */
	int CVodeSetNonlinConvCoef(Pointer cvode_mem, sunrealtype nlscoef);
	/**
	 * Original signature : <code>int CVodeSetNonlinearSolver(void*, SUNNonlinearSolver)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:112</i>
	 */
	int CVodeSetNonlinearSolver(Pointer cvode_mem, SUNNonlinearSolver NLS);
	/**
	 * Original signature : <code>int CVodeSetStabLimDet(void*, sunbooleantype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:114</i>
	 */
	int CVodeSetStabLimDet(Pointer cvode_mem, int stldet);
	/**
	 * Original signature : <code>int CVodeSetStopTime(void*, sunrealtype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:115</i>
	 */
	int CVodeSetStopTime(Pointer cvode_mem, sunrealtype tstop);
	/**
	 * Original signature : <code>int CVodeSetInterpolateStopTime(void*, sunbooleantype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:116</i>
	 */
	int CVodeSetInterpolateStopTime(Pointer cvode_mem, int interp);
	/**
	 * Original signature : <code>int CVodeClearStopTime(void*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:118</i>
	 */
	int CVodeClearStopTime(Pointer cvode_mem);
	/**
	 * Original signature : <code>int CVodeSetUseIntegratorFusedKernels(void*, sunbooleantype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:119</i>
	 */
	int CVodeSetUseIntegratorFusedKernels(Pointer cvode_mem, int onoff);
	/**
	 * Original signature : <code>int CVodeSetUserData(void*, void*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:121</i>
	 */
	int CVodeSetUserData(Pointer cvode_mem, Pointer user_data);
	/**
	 * Optional step adaptivity input functions<br>
	 * Original signature : <code>int CVodeSetEtaFixedStepBounds(void*, sunrealtype, sunrealtype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:125</i>
	 */
	int CVodeSetEtaFixedStepBounds(Pointer cvode_mem, sunrealtype eta_min_fx, sunrealtype eta_max_fx);
	/**
	 * Original signature : <code>int CVodeSetEtaMaxFirstStep(void*, sunrealtype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:128</i>
	 */
	int CVodeSetEtaMaxFirstStep(Pointer cvode_mem, sunrealtype eta_max_fs);
	/**
	 * Original signature : <code>int CVodeSetEtaMaxEarlyStep(void*, sunrealtype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:130</i>
	 */
	int CVodeSetEtaMaxEarlyStep(Pointer cvode_mem, sunrealtype eta_max_es);
	/**
	 * Original signature : <code>int CVodeSetNumStepsEtaMaxEarlyStep(void*, long long)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:132</i>
	 */
	int CVodeSetNumStepsEtaMaxEarlyStep(Pointer cvode_mem, long small_nst);
	/**
	 * Original signature : <code>int CVodeSetEtaMax(void*, sunrealtype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:134</i>
	 */
	int CVodeSetEtaMax(Pointer cvode_mem, sunrealtype eta_max_gs);
	/**
	 * Original signature : <code>int CVodeSetEtaMin(void*, sunrealtype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:136</i>
	 */
	int CVodeSetEtaMin(Pointer cvode_mem, sunrealtype eta_min);
	/**
	 * Original signature : <code>int CVodeSetEtaMinErrFail(void*, sunrealtype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:138</i>
	 */
	int CVodeSetEtaMinErrFail(Pointer cvode_mem, sunrealtype eta_min_ef);
	/**
	 * Original signature : <code>int CVodeSetEtaMaxErrFail(void*, sunrealtype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:140</i>
	 */
	int CVodeSetEtaMaxErrFail(Pointer cvode_mem, sunrealtype eta_max_ef);
	/**
	 * Original signature : <code>int CVodeSetNumFailsEtaMaxErrFail(void*, int)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:142</i>
	 */
	int CVodeSetNumFailsEtaMaxErrFail(Pointer cvode_mem, int small_nef);
	/**
	 * Original signature : <code>int CVodeSetEtaConvFail(void*, sunrealtype)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:144</i>
	 */
	int CVodeSetEtaConvFail(Pointer cvode_mem, sunrealtype eta_cf);
	/**
	 * Rootfinding initialization function<br>
	 * Original signature : <code>int CVodeRootInit(void*, int, CVRootFn)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:147</i>
	 */
	int CVodeRootInit(Pointer cvode_mem, int nrtfn, CVRootFn g);
	/**
	 * Rootfinding optional input functions<br>
	 * Original signature : <code>int CVodeSetRootDirection(void*, int*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:150</i><br>
	 * @deprecated use the safer methods {@link #CVodeSetRootDirection(Pointer, IntBuffer)} and {@link #CVodeSetRootDirection(Pointer, IntByReference)} instead
	 */
	@Deprecated 
	int CVodeSetRootDirection(Pointer cvode_mem, IntByReference rootdir);
	/**
	 * Rootfinding optional input functions<br>
	 * Original signature : <code>int CVodeSetRootDirection(void*, int*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:150</i>
	 */
	int CVodeSetRootDirection(Pointer cvode_mem, IntBuffer rootdir);
	/**
	 * Original signature : <code>int CVodeSetNoInactiveRootWarn(void*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:151</i>
	 */
	int CVodeSetNoInactiveRootWarn(Pointer cvode_mem);
	/**
	 * Solver function<br>
	 * Original signature : <code>int CVode(void*, sunrealtype, N_Vector, sunrealtype*, int)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:154</i>
	 */
	int CVode(Pointer cvode_mem, sunrealtype tout, _generic_N_Vector yout, sunrealtype tret, int itask);
	/**
	 * Utility functions to update/compute y based on ycor<br>
	 * Original signature : <code>int CVodeComputeState(void*, N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:158</i>
	 */
	int CVodeComputeState(Pointer cvode_mem, _generic_N_Vector ycor, _generic_N_Vector y);
	/**
	 * Dense output function<br>
	 * Original signature : <code>int CVodeGetDky(void*, sunrealtype, int, N_Vector)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:161</i>
	 */
	int CVodeGetDky(Pointer cvode_mem, sunrealtype t, int k, _generic_N_Vector dky);
	/**
	 * Optional output functions<br>
	 * Original signature : <code>int CVodeGetWorkSpace(void*, long long*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:165</i><br>
	 * @deprecated use the safer methods {@link #CVodeGetWorkSpace(Pointer, LongBuffer, LongBuffer)} and {@link #CVodeGetWorkSpace(Pointer, LongByReference, LongByReference)} instead
	 */
	@Deprecated 
	int CVodeGetWorkSpace(Pointer cvode_mem, LongByReference lenrw, LongByReference leniw);
	/**
	 * Optional output functions<br>
	 * Original signature : <code>int CVodeGetWorkSpace(void*, long long*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:165</i>
	 */
	int CVodeGetWorkSpace(Pointer cvode_mem, LongBuffer lenrw, LongBuffer leniw);
	/**
	 * Original signature : <code>int CVodeGetNumSteps(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:167</i><br>
	 * @deprecated use the safer methods {@link #CVodeGetNumSteps(Pointer, LongBuffer)} and {@link #CVodeGetNumSteps(Pointer, LongByReference)} instead
	 */
	@Deprecated 
	int CVodeGetNumSteps(Pointer cvode_mem, LongByReference nsteps);
	/**
	 * Original signature : <code>int CVodeGetNumSteps(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:167</i>
	 */
	int CVodeGetNumSteps(Pointer cvode_mem, LongBuffer nsteps);
	/**
	 * Original signature : <code>int CVodeGetNumRhsEvals(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:168</i><br>
	 * @deprecated use the safer methods {@link #CVodeGetNumRhsEvals(Pointer, LongBuffer)} and {@link #CVodeGetNumRhsEvals(Pointer, LongByReference)} instead
	 */
	@Deprecated 
	int CVodeGetNumRhsEvals(Pointer cvode_mem, LongByReference nfevals);
	/**
	 * Original signature : <code>int CVodeGetNumRhsEvals(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:168</i>
	 */
	int CVodeGetNumRhsEvals(Pointer cvode_mem, LongBuffer nfevals);
	/**
	 * Original signature : <code>int CVodeGetNumLinSolvSetups(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:169</i><br>
	 * @deprecated use the safer methods {@link #CVodeGetNumLinSolvSetups(Pointer, LongBuffer)} and {@link #CVodeGetNumLinSolvSetups(Pointer, LongByReference)} instead
	 */
	@Deprecated 
	int CVodeGetNumLinSolvSetups(Pointer cvode_mem, LongByReference nlinsetups);
	/**
	 * Original signature : <code>int CVodeGetNumLinSolvSetups(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:169</i>
	 */
	int CVodeGetNumLinSolvSetups(Pointer cvode_mem, LongBuffer nlinsetups);
	/**
	 * Original signature : <code>int CVodeGetNumErrTestFails(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:171</i><br>
	 * @deprecated use the safer methods {@link #CVodeGetNumErrTestFails(Pointer, LongBuffer)} and {@link #CVodeGetNumErrTestFails(Pointer, LongByReference)} instead
	 */
	@Deprecated 
	int CVodeGetNumErrTestFails(Pointer cvode_mem, LongByReference netfails);
	/**
	 * Original signature : <code>int CVodeGetNumErrTestFails(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:171</i>
	 */
	int CVodeGetNumErrTestFails(Pointer cvode_mem, LongBuffer netfails);
	/**
	 * Original signature : <code>int CVodeGetLastOrder(void*, int*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:172</i><br>
	 * @deprecated use the safer methods {@link #CVodeGetLastOrder(Pointer, IntBuffer)} and {@link #CVodeGetLastOrder(Pointer, IntByReference)} instead
	 */
	@Deprecated 
	int CVodeGetLastOrder(Pointer cvode_mem, IntByReference qlast);
	/**
	 * Original signature : <code>int CVodeGetLastOrder(void*, int*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:172</i>
	 */
	int CVodeGetLastOrder(Pointer cvode_mem, IntBuffer qlast);
	/**
	 * Original signature : <code>int CVodeGetCurrentOrder(void*, int*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:173</i><br>
	 * @deprecated use the safer methods {@link #CVodeGetCurrentOrder(Pointer, IntBuffer)} and {@link #CVodeGetCurrentOrder(Pointer, IntByReference)} instead
	 */
	@Deprecated 
	int CVodeGetCurrentOrder(Pointer cvode_mem, IntByReference qcur);
	/**
	 * Original signature : <code>int CVodeGetCurrentOrder(void*, int*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:173</i>
	 */
	int CVodeGetCurrentOrder(Pointer cvode_mem, IntBuffer qcur);
	/**
	 * Original signature : <code>int CVodeGetCurrentGamma(void*, sunrealtype*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:174</i>
	 */
	int CVodeGetCurrentGamma(Pointer cvode_mem, sunrealtype gamma);
	/**
	 * Original signature : <code>int CVodeGetNumStabLimOrderReds(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:175</i><br>
	 * @deprecated use the safer methods {@link #CVodeGetNumStabLimOrderReds(Pointer, LongBuffer)} and {@link #CVodeGetNumStabLimOrderReds(Pointer, LongByReference)} instead
	 */
	@Deprecated 
	int CVodeGetNumStabLimOrderReds(Pointer cvode_mem, LongByReference nslred);
	/**
	 * Original signature : <code>int CVodeGetNumStabLimOrderReds(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:175</i>
	 */
	int CVodeGetNumStabLimOrderReds(Pointer cvode_mem, LongBuffer nslred);
	/**
	 * Original signature : <code>int CVodeGetActualInitStep(void*, sunrealtype*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:177</i>
	 */
	int CVodeGetActualInitStep(Pointer cvode_mem, sunrealtype hinused);
	/**
	 * Original signature : <code>int CVodeGetLastStep(void*, sunrealtype*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:178</i>
	 */
	int CVodeGetLastStep(Pointer cvode_mem, sunrealtype hlast);
	/**
	 * Original signature : <code>int CVodeGetCurrentStep(void*, sunrealtype*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:179</i>
	 */
	int CVodeGetCurrentStep(Pointer cvode_mem, sunrealtype hcur);
	/**
	 * Original signature : <code>int CVodeGetCurrentState(void*, N_Vector*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:180</i><br>
	 * @deprecated use the safer method {@link #CVodeGetCurrentState(Pointer, ByReference[])} instead
	 */
	@Deprecated 
	int CVodeGetCurrentState(Pointer cvode_mem, PointerByReference y);
	/**
	 * Original signature : <code>int CVodeGetCurrentState(void*, N_Vector*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:180</i>
	 */
	int CVodeGetCurrentState(Pointer cvode_mem, ByReference y[]);
	/**
	 * Original signature : <code>int CVodeGetCurrentTime(void*, sunrealtype*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:181</i>
	 */
	int CVodeGetCurrentTime(Pointer cvode_mem, sunrealtype tcur);
	/**
	 * Original signature : <code>int CVodeGetTolScaleFactor(void*, sunrealtype*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:182</i>
	 */
	int CVodeGetTolScaleFactor(Pointer cvode_mem, sunrealtype tolsfac);
	/**
	 * Original signature : <code>int CVodeGetErrWeights(void*, N_Vector)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:183</i>
	 */
	int CVodeGetErrWeights(Pointer cvode_mem, _generic_N_Vector eweight);
	/**
	 * Original signature : <code>int CVodeGetEstLocalErrors(void*, N_Vector)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:184</i>
	 */
	int CVodeGetEstLocalErrors(Pointer cvode_mem, _generic_N_Vector ele);
	/**
	 * Original signature : <code>int CVodeGetNumGEvals(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:185</i><br>
	 * @deprecated use the safer methods {@link #CVodeGetNumGEvals(Pointer, LongBuffer)} and {@link #CVodeGetNumGEvals(Pointer, LongByReference)} instead
	 */
	@Deprecated 
	int CVodeGetNumGEvals(Pointer cvode_mem, LongByReference ngevals);
	/**
	 * Original signature : <code>int CVodeGetNumGEvals(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:185</i>
	 */
	int CVodeGetNumGEvals(Pointer cvode_mem, LongBuffer ngevals);
	/**
	 * Original signature : <code>int CVodeGetRootInfo(void*, int*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:186</i><br>
	 * @deprecated use the safer methods {@link #CVodeGetRootInfo(Pointer, IntBuffer)} and {@link #CVodeGetRootInfo(Pointer, IntByReference)} instead
	 */
	@Deprecated 
	int CVodeGetRootInfo(Pointer cvode_mem, IntByReference rootsfound);
	/**
	 * Original signature : <code>int CVodeGetRootInfo(void*, int*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:186</i>
	 */
	int CVodeGetRootInfo(Pointer cvode_mem, IntBuffer rootsfound);
	/**
	 * Original signature : <code>int CVodeGetIntegratorStats(void*, long long*, long long*, long long*, long long*, int*, int*, sunrealtype*, sunrealtype*, sunrealtype*, sunrealtype*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:187</i><br>
	 * @deprecated use the safer methods {@link #CVodeGetIntegratorStats(Pointer, LongBuffer, LongBuffer, LongBuffer, LongBuffer, IntBuffer, IntBuffer, sunrealtype, sunrealtype, sunrealtype, sunrealtype)} and {@link #CVodeGetIntegratorStats(Pointer, LongByReference, LongByReference, LongByReference, LongByReference, IntByReference, IntByReference, sunrealtype, sunrealtype, sunrealtype, sunrealtype)} instead
	 */
	@Deprecated 
	int CVodeGetIntegratorStats(Pointer cvode_mem, LongByReference nsteps, LongByReference nfevals, LongByReference nlinsetups, LongByReference netfails, IntByReference qlast, IntByReference qcur, sunrealtype hinused, sunrealtype hlast, sunrealtype hcur, sunrealtype tcur);
	/**
	 * Original signature : <code>int CVodeGetIntegratorStats(void*, long long*, long long*, long long*, long long*, int*, int*, sunrealtype*, sunrealtype*, sunrealtype*, sunrealtype*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:187</i>
	 */
	int CVodeGetIntegratorStats(Pointer cvode_mem, LongBuffer nsteps, LongBuffer nfevals, LongBuffer nlinsetups, LongBuffer netfails, IntBuffer qlast, IntBuffer qcur, sunrealtype hinused, sunrealtype hlast, sunrealtype hcur, sunrealtype tcur);
	/**
	 * Original signature : <code>int CVodeGetNonlinearSystemData(void*, sunrealtype*, N_Vector*, N_Vector*, N_Vector*, sunrealtype*, sunrealtype*, N_Vector*, void**)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:191</i><br>
	 * @deprecated use the safer method {@link #CVodeGetNonlinearSystemData(Pointer, sunrealtype, ByReference[], ByReference[], ByReference[], sunrealtype, sunrealtype, ByReference[], PointerByReference)} instead
	 */
	@Deprecated 
	int CVodeGetNonlinearSystemData(Pointer cvode_mem, sunrealtype tcur, PointerByReference ypred, PointerByReference yn, PointerByReference fn, sunrealtype gamma, sunrealtype rl1, PointerByReference zn1, PointerByReference user_data);
	/**
	 * Original signature : <code>int CVodeGetNonlinearSystemData(void*, sunrealtype*, N_Vector*, N_Vector*, N_Vector*, sunrealtype*, sunrealtype*, N_Vector*, void**)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:191</i>
	 */
	int CVodeGetNonlinearSystemData(Pointer cvode_mem, sunrealtype tcur, ByReference ypred[], ByReference yn[], ByReference fn[], sunrealtype gamma, sunrealtype rl1, ByReference zn1[], PointerByReference user_data);
	/**
	 * Original signature : <code>int CVodeGetNumNonlinSolvIters(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:197</i><br>
	 * @deprecated use the safer methods {@link #CVodeGetNumNonlinSolvIters(Pointer, LongBuffer)} and {@link #CVodeGetNumNonlinSolvIters(Pointer, LongByReference)} instead
	 */
	@Deprecated 
	int CVodeGetNumNonlinSolvIters(Pointer cvode_mem, LongByReference nniters);
	/**
	 * Original signature : <code>int CVodeGetNumNonlinSolvIters(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:197</i>
	 */
	int CVodeGetNumNonlinSolvIters(Pointer cvode_mem, LongBuffer nniters);
	/**
	 * Original signature : <code>int CVodeGetNumNonlinSolvConvFails(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:199</i><br>
	 * @deprecated use the safer methods {@link #CVodeGetNumNonlinSolvConvFails(Pointer, LongBuffer)} and {@link #CVodeGetNumNonlinSolvConvFails(Pointer, LongByReference)} instead
	 */
	@Deprecated 
	int CVodeGetNumNonlinSolvConvFails(Pointer cvode_mem, LongByReference nnfails);
	/**
	 * Original signature : <code>int CVodeGetNumNonlinSolvConvFails(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:199</i>
	 */
	int CVodeGetNumNonlinSolvConvFails(Pointer cvode_mem, LongBuffer nnfails);
	/**
	 * Original signature : <code>int CVodeGetNonlinSolvStats(void*, long long*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:201</i><br>
	 * @deprecated use the safer methods {@link #CVodeGetNonlinSolvStats(Pointer, LongBuffer, LongBuffer)} and {@link #CVodeGetNonlinSolvStats(Pointer, LongByReference, LongByReference)} instead
	 */
	@Deprecated 
	int CVodeGetNonlinSolvStats(Pointer cvode_mem, LongByReference nniters, LongByReference nnfails);
	/**
	 * Original signature : <code>int CVodeGetNonlinSolvStats(void*, long long*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:201</i>
	 */
	int CVodeGetNonlinSolvStats(Pointer cvode_mem, LongBuffer nniters, LongBuffer nnfails);
	/**
	 * Original signature : <code>int CVodeGetNumStepSolveFails(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:203</i><br>
	 * @deprecated use the safer methods {@link #CVodeGetNumStepSolveFails(Pointer, LongBuffer)} and {@link #CVodeGetNumStepSolveFails(Pointer, LongByReference)} instead
	 */
	@Deprecated 
	int CVodeGetNumStepSolveFails(Pointer cvode_mem, LongByReference nncfails);
	/**
	 * Original signature : <code>int CVodeGetNumStepSolveFails(void*, long long*)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:203</i>
	 */
	int CVodeGetNumStepSolveFails(Pointer cvode_mem, LongBuffer nncfails);
	/**
	 * Original signature : <code>int CVodeGetUserData(void*, void**)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:205</i>
	 */
	int CVodeGetUserData(Pointer cvode_mem, PointerByReference user_data);
	/**
	 * Original signature : <code>int CVodePrintAllStats(void*, FILE*, SUNOutputFormat)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:206</i>
	 */
	int CVodePrintAllStats(Pointer cvode_mem, FILE outfile, int fmt);
	/**
	 * Original signature : <code>char* CVodeGetReturnFlagName(long long)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:208</i>
	 */
	Pointer CVodeGetReturnFlagName(long flag);
	/**
	 * Free function<br>
	 * Original signature : <code>void CVodeFree(void**)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:211</i>
	 */
	void CVodeFree(PointerByReference cvode_mem);
	/**
	 * CVLS interface function that depends on CVRhsFn<br>
	 * Original signature : <code>int CVodeSetJacTimesRhsFn(void*, CVRhsFn)</code><br>
	 * <i>native declaration : include\cvode\cvode.h:214</i>
	 */
	int CVodeSetJacTimesRhsFn(Pointer cvode_mem, CVRhsFn jtimesRhsFn);
	public static class SUNNonlinearSolver extends PointerType {
		public SUNNonlinearSolver(Pointer address) {
			super(address);
		}
		public SUNNonlinearSolver() {
			super();
		}
	};
}
