package cn.catarc.jsundials.sunlinsolspfgmr;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import com.sun.jna.ptr.LongByReference;
import java.nio.LongBuffer;
/**
 * JNA Wrapper for library <b>sundials_sunlinsolspfgmr</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public interface Sundials_sunlinsolspfgmrLibrary extends Library {
	public static final String JNA_LIBRARY_NAME = "sundials_sunlinsolspfgmr";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(Sundials_sunlinsolspfgmrLibrary.JNA_LIBRARY_NAME);
	public static final Sundials_sunlinsolspfgmrLibrary INSTANCE = (Sundials_sunlinsolspfgmrLibrary)Native.loadLibrary(Sundials_sunlinsolspfgmrLibrary.JNA_LIBRARY_NAME, Sundials_sunlinsolspfgmrLibrary.class);
	/** <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h</i> */
	public static final int SUNSPFGMR_MAXL_DEFAULT = (int)5;
	/** <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h</i> */
	public static final int SUNSPFGMR_MAXRS_DEFAULT = (int)0;
	/**
	 * ----------------------------------------<br>
	 * Exported Functions for SUNLINSOL_SPFGMR<br>
	 * ----------------------------------------<br>
	 * Original signature : <code>SUNLinearSolver SUNLinSol_SPFGMR(N_Vector, int, int, SUNContext)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:52</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSol_SPFGMR(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.N_Vector, int, int, cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNContext)} and {@link #SUNLinSol_SPFGMR(com.sun.jna.Pointer, int, int, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver SUNLinSol_SPFGMR(Pointer y, int pretype, int maxl, Pointer sunctx);
	/**
	 * ----------------------------------------<br>
	 * Exported Functions for SUNLINSOL_SPFGMR<br>
	 * ----------------------------------------<br>
	 * Original signature : <code>SUNLinearSolver SUNLinSol_SPFGMR(N_Vector, int, int, SUNContext)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:52</i>
	 */
	Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver SUNLinSol_SPFGMR(Sundials_sunlinsolspfgmrLibrary.N_Vector y, int pretype, int maxl, Sundials_sunlinsolspfgmrLibrary.SUNContext sunctx);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSol_SPFGMRSetPrecType(SUNLinearSolver, int)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:54</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSol_SPFGMRSetPrecType(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver, int)} and {@link #SUNLinSol_SPFGMRSetPrecType(com.sun.jna.Pointer, int)} instead
	 */
	@Deprecated 
	int SUNLinSol_SPFGMRSetPrecType(Pointer S, int pretype);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSol_SPFGMRSetPrecType(SUNLinearSolver, int)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:54</i>
	 */
	int SUNLinSol_SPFGMRSetPrecType(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S, int pretype);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSol_SPFGMRSetGSType(SUNLinearSolver, int)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:56</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSol_SPFGMRSetGSType(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver, int)} and {@link #SUNLinSol_SPFGMRSetGSType(com.sun.jna.Pointer, int)} instead
	 */
	@Deprecated 
	int SUNLinSol_SPFGMRSetGSType(Pointer S, int gstype);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSol_SPFGMRSetGSType(SUNLinearSolver, int)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:56</i>
	 */
	int SUNLinSol_SPFGMRSetGSType(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S, int gstype);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSol_SPFGMRSetMaxRestarts(SUNLinearSolver, int)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:58</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSol_SPFGMRSetMaxRestarts(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver, int)} and {@link #SUNLinSol_SPFGMRSetMaxRestarts(com.sun.jna.Pointer, int)} instead
	 */
	@Deprecated 
	int SUNLinSol_SPFGMRSetMaxRestarts(Pointer S, int maxrs);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSol_SPFGMRSetMaxRestarts(SUNLinearSolver, int)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:58</i>
	 */
	int SUNLinSol_SPFGMRSetMaxRestarts(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S, int maxrs);
	/**
	 * Original signature : <code>SUNLinearSolver_Type SUNLinSolGetType_SPFGMR(SUNLinearSolver)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:60</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSolGetType_SPFGMR(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver)} and {@link #SUNLinSolGetType_SPFGMR(com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int SUNLinSolGetType_SPFGMR(Pointer S);
	/**
	 * Original signature : <code>SUNLinearSolver_Type SUNLinSolGetType_SPFGMR(SUNLinearSolver)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:60</i>
	 */
	int SUNLinSolGetType_SPFGMR(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S);
	/**
	 * Original signature : <code>SUNLinearSolver_ID SUNLinSolGetID_SPFGMR(SUNLinearSolver)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:61</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSolGetID_SPFGMR(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver)} and {@link #SUNLinSolGetID_SPFGMR(com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int SUNLinSolGetID_SPFGMR(Pointer S);
	/**
	 * Original signature : <code>SUNLinearSolver_ID SUNLinSolGetID_SPFGMR(SUNLinearSolver)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:61</i>
	 */
	int SUNLinSolGetID_SPFGMR(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSolInitialize_SPFGMR(SUNLinearSolver)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:62</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSolInitialize_SPFGMR(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver)} and {@link #SUNLinSolInitialize_SPFGMR(com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int SUNLinSolInitialize_SPFGMR(Pointer S);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSolInitialize_SPFGMR(SUNLinearSolver)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:62</i>
	 */
	int SUNLinSolInitialize_SPFGMR(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSolSetATimes_SPFGMR(SUNLinearSolver, void*, SUNATimesFn)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:63</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSolSetATimes_SPFGMR(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver, com.sun.jna.Pointer, com.sun.jna.Pointer)} and {@link #SUNLinSolSetATimes_SPFGMR(com.sun.jna.Pointer, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int SUNLinSolSetATimes_SPFGMR(Pointer S, Pointer A_data, Pointer ATimes);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSolSetATimes_SPFGMR(SUNLinearSolver, void*, SUNATimesFn)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:63</i>
	 */
	int SUNLinSolSetATimes_SPFGMR(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S, Pointer A_data, Pointer ATimes);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSolSetPreconditioner_SPFGMR(SUNLinearSolver, void*, SUNPSetupFn, SUNPSolveFn)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:66</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSolSetPreconditioner_SPFGMR(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver, com.sun.jna.Pointer, com.sun.jna.Pointer, com.sun.jna.Pointer)} and {@link #SUNLinSolSetPreconditioner_SPFGMR(com.sun.jna.Pointer, com.sun.jna.Pointer, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int SUNLinSolSetPreconditioner_SPFGMR(Pointer S, Pointer P_data, Pointer Pset, Pointer Psol);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSolSetPreconditioner_SPFGMR(SUNLinearSolver, void*, SUNPSetupFn, SUNPSolveFn)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:66</i>
	 */
	int SUNLinSolSetPreconditioner_SPFGMR(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S, Pointer P_data, Pointer Pset, Pointer Psol);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSolSetScalingVectors_SPFGMR(SUNLinearSolver, N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:70</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSolSetScalingVectors_SPFGMR(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver, cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.N_Vector, cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.N_Vector)} and {@link #SUNLinSolSetScalingVectors_SPFGMR(com.sun.jna.Pointer, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int SUNLinSolSetScalingVectors_SPFGMR(Pointer S, Pointer s1, Pointer s2);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSolSetScalingVectors_SPFGMR(SUNLinearSolver, N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:70</i>
	 */
	int SUNLinSolSetScalingVectors_SPFGMR(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S, Sundials_sunlinsolspfgmrLibrary.N_Vector s1, Sundials_sunlinsolspfgmrLibrary.N_Vector s2);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSolSetZeroGuess_SPFGMR(SUNLinearSolver, int)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:73</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSolSetZeroGuess_SPFGMR(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver, int)} and {@link #SUNLinSolSetZeroGuess_SPFGMR(com.sun.jna.Pointer, int)} instead
	 */
	@Deprecated 
	int SUNLinSolSetZeroGuess_SPFGMR(Pointer S, int onoff);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSolSetZeroGuess_SPFGMR(SUNLinearSolver, int)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:73</i>
	 */
	int SUNLinSolSetZeroGuess_SPFGMR(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S, int onoff);
	/**
	 * Original signature : <code>int SUNLinSolSetup_SPFGMR(SUNLinearSolver, SUNMatrix)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:75</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSolSetup_SPFGMR(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver, cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNMatrix)} and {@link #SUNLinSolSetup_SPFGMR(com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int SUNLinSolSetup_SPFGMR(Pointer S, Pointer A);
	/**
	 * Original signature : <code>int SUNLinSolSetup_SPFGMR(SUNLinearSolver, SUNMatrix)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:75</i>
	 */
	int SUNLinSolSetup_SPFGMR(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S, Sundials_sunlinsolspfgmrLibrary.SUNMatrix A);
	/**
	 * Original signature : <code>int SUNLinSolSolve_SPFGMR(SUNLinearSolver, SUNMatrix, N_Vector, N_Vector, sunrealtype)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:76</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSolSolve_SPFGMR(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver, cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNMatrix, cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.N_Vector, cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.N_Vector, double)} and {@link #SUNLinSolSolve_SPFGMR(com.sun.jna.Pointer, com.sun.jna.Pointer, com.sun.jna.Pointer, com.sun.jna.Pointer, double)} instead
	 */
	@Deprecated 
	int SUNLinSolSolve_SPFGMR(Pointer S, Pointer A, Pointer x, Pointer b, double tol);
	/**
	 * Original signature : <code>int SUNLinSolSolve_SPFGMR(SUNLinearSolver, SUNMatrix, N_Vector, N_Vector, sunrealtype)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:76</i>
	 */
	int SUNLinSolSolve_SPFGMR(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S, Sundials_sunlinsolspfgmrLibrary.SUNMatrix A, Sundials_sunlinsolspfgmrLibrary.N_Vector x, Sundials_sunlinsolspfgmrLibrary.N_Vector b, double tol);
	/**
	 * Original signature : <code>int SUNLinSolNumIters_SPFGMR(SUNLinearSolver)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:79</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSolNumIters_SPFGMR(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver)} and {@link #SUNLinSolNumIters_SPFGMR(com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int SUNLinSolNumIters_SPFGMR(Pointer S);
	/**
	 * Original signature : <code>int SUNLinSolNumIters_SPFGMR(SUNLinearSolver)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:79</i>
	 */
	int SUNLinSolNumIters_SPFGMR(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S);
	/**
	 * Original signature : <code>sunrealtype SUNLinSolResNorm_SPFGMR(SUNLinearSolver)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:80</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSolResNorm_SPFGMR(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver)} and {@link #SUNLinSolResNorm_SPFGMR(com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	double SUNLinSolResNorm_SPFGMR(Pointer S);
	/**
	 * Original signature : <code>sunrealtype SUNLinSolResNorm_SPFGMR(SUNLinearSolver)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:80</i>
	 */
	double SUNLinSolResNorm_SPFGMR(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S);
	/**
	 * Original signature : <code>N_Vector SUNLinSolResid_SPFGMR(SUNLinearSolver)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:81</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSolResid_SPFGMR(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver)} and {@link #SUNLinSolResid_SPFGMR(com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	Sundials_sunlinsolspfgmrLibrary.N_Vector SUNLinSolResid_SPFGMR(Pointer S);
	/**
	 * Original signature : <code>N_Vector SUNLinSolResid_SPFGMR(SUNLinearSolver)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:81</i>
	 */
	Sundials_sunlinsolspfgmrLibrary.N_Vector SUNLinSolResid_SPFGMR(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S);
	/**
	 * Original signature : <code>sunindextype SUNLinSolLastFlag_SPFGMR(SUNLinearSolver)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:82</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSolLastFlag_SPFGMR(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver)} and {@link #SUNLinSolLastFlag_SPFGMR(com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	long SUNLinSolLastFlag_SPFGMR(Pointer S);
	/**
	 * Original signature : <code>sunindextype SUNLinSolLastFlag_SPFGMR(SUNLinearSolver)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:82</i>
	 */
	long SUNLinSolLastFlag_SPFGMR(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSolSpace_SPFGMR(SUNLinearSolver, long long*, long long*)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:83</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSolSpace_SPFGMR(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver, java.nio.LongBuffer, java.nio.LongBuffer)} and {@link #SUNLinSolSpace_SPFGMR(com.sun.jna.Pointer, com.sun.jna.ptr.LongByReference, com.sun.jna.ptr.LongByReference)} instead
	 */
	@Deprecated 
	int SUNLinSolSpace_SPFGMR(Pointer S, LongByReference lenrwLS, LongByReference leniwLS);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSolSpace_SPFGMR(SUNLinearSolver, long long*, long long*)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:83</i>
	 */
	int SUNLinSolSpace_SPFGMR(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S, LongBuffer lenrwLS, LongBuffer leniwLS);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSolFree_SPFGMR(SUNLinearSolver)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:86</i><br>
	 * @deprecated use the safer methods {@link #SUNLinSolFree_SPFGMR(cn.catarc.jsundials.sunlinsolspfgmr.Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver)} and {@link #SUNLinSolFree_SPFGMR(com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int SUNLinSolFree_SPFGMR(Pointer S);
	/**
	 * Original signature : <code>SUNErrCode SUNLinSolFree_SPFGMR(SUNLinearSolver)</code><br>
	 * <i>native declaration : include\sunlinsol\sunlinsol_spfgmr.h:86</i>
	 */
	int SUNLinSolFree_SPFGMR(Sundials_sunlinsolspfgmrLibrary.SUNLinearSolver S);
	public static class SUNLinearSolver extends PointerType {
		public SUNLinearSolver(Pointer address) {
			super(address);
		}
		public SUNLinearSolver() {
			super();
		}
	};
	public static class SUNMatrix extends PointerType {
		public SUNMatrix(Pointer address) {
			super(address);
		}
		public SUNMatrix() {
			super();
		}
	};
	public static class SUNContext extends PointerType {
		public SUNContext(Pointer address) {
			super(address);
		}
		public SUNContext() {
			super();
		}
	};
	public static class N_Vector extends PointerType {
		public N_Vector(Pointer address) {
			super(address);
		}
		public N_Vector() {
			super();
		}
	};
}
