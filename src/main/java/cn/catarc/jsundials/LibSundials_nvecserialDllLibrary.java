package cn.catarc.jsundials;
import cn.catarc.jsundials.LibSundials_coreDllLibrary.FILE;
import cn.catarc.jsundials.LibSundials_coreDllLibrary.SUNContext;
import cn.catarc.jsundials.LibSundials_coreDllLibrary.sunindextype;
import cn.catarc.jsundials.LibSundials_coreDllLibrary.sunrealtype;
import cn.catarc.jsundials._generic_N_Vector.ByReference;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
/**
 * JNA Wrapper for library <b>lib\sundials_nvecserial.dll</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public interface LibSundials_nvecserialDllLibrary extends Library {
	public static final String JNA_LIBRARY_NAME = "lib\\sundials_nvecserial.dll";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(LibSundials_nvecserialDllLibrary.JNA_LIBRARY_NAME);
	public static final LibSundials_nvecserialDllLibrary INSTANCE = (LibSundials_nvecserialDllLibrary)Native.loadLibrary(LibSundials_nvecserialDllLibrary.JNA_LIBRARY_NAME, LibSundials_nvecserialDllLibrary.class);
	/**
	 * -----------------------------------------------------------------<br>
	 * Functions exported by nvector_serial<br>
	 * -----------------------------------------------------------------<br>
	 * Original signature : <code>N_Vector N_VNewEmpty_Serial(sunindextype, SUNContext)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:45</i><br>
	 * @deprecated use the safer methods {@link #N_VNewEmpty_Serial(sunindextype, SUNContext)} and {@link #N_VNewEmpty_Serial(Pointer, Pointer)} instead
	 */
	@Deprecated 
	_generic_N_Vector N_VNewEmpty_Serial(Pointer vec_length, Pointer sunctx);
	/**
	 * -----------------------------------------------------------------<br>
	 * Functions exported by nvector_serial<br>
	 * -----------------------------------------------------------------<br>
	 * Original signature : <code>N_Vector N_VNewEmpty_Serial(sunindextype, SUNContext)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:45</i>
	 */
	_generic_N_Vector N_VNewEmpty_Serial(sunindextype vec_length, SUNContext sunctx);
	/**
	 * Original signature : <code>N_Vector N_VNew_Serial(sunindextype, SUNContext)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:48</i><br>
	 * @deprecated use the safer methods {@link #N_VNew_Serial(sunindextype, SUNContext)} and {@link #N_VNew_Serial(Pointer, Pointer)} instead
	 */
	@Deprecated 
	_generic_N_Vector N_VNew_Serial(Pointer vec_length, Pointer sunctx);
	/**
	 * Original signature : <code>N_Vector N_VNew_Serial(sunindextype, SUNContext)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:48</i>
	 */
	_generic_N_Vector N_VNew_Serial(sunindextype vec_length, SUNContext sunctx);
	/**
	 * Original signature : <code>N_Vector N_VMake_Serial(sunindextype, sunrealtype*, SUNContext)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:51</i><br>
	 * @deprecated use the safer methods {@link #N_VMake_Serial(sunindextype, sunrealtype, SUNContext)} and {@link #N_VMake_Serial(Pointer, sunrealtype, Pointer)} instead
	 */
	@Deprecated 
	_generic_N_Vector N_VMake_Serial(Pointer vec_length, sunrealtype v_data, Pointer sunctx);
	/**
	 * Original signature : <code>N_Vector N_VMake_Serial(sunindextype, sunrealtype*, SUNContext)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:51</i>
	 */
	_generic_N_Vector N_VMake_Serial(sunindextype vec_length, sunrealtype v_data, SUNContext sunctx);
	/**
	 * Original signature : <code>sunindextype N_VGetLength_Serial(N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:55</i>
	 */
	sunindextype N_VGetLength_Serial(_generic_N_Vector v);
	/**
	 * Original signature : <code>void N_VPrint_Serial(N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:58</i>
	 */
	void N_VPrint_Serial(_generic_N_Vector v);
	/**
	 * Original signature : <code>void N_VPrintFile_Serial(N_Vector, FILE*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:61</i>
	 */
	void N_VPrintFile_Serial(_generic_N_Vector v, FILE outfile);
	/**
	 * Original signature : <code>N_Vector_ID N_VGetVectorID_Serial(N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:63</i>
	 */
	int N_VGetVectorID_Serial(_generic_N_Vector v);
	/**
	 * Original signature : <code>N_Vector N_VCloneEmpty_Serial(N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:69</i>
	 */
	_generic_N_Vector N_VCloneEmpty_Serial(_generic_N_Vector w);
	/**
	 * Original signature : <code>N_Vector N_VClone_Serial(N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:72</i>
	 */
	_generic_N_Vector N_VClone_Serial(_generic_N_Vector w);
	/**
	 * Original signature : <code>void N_VDestroy_Serial(N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:75</i>
	 */
	void N_VDestroy_Serial(_generic_N_Vector v);
	/**
	 * Original signature : <code>void N_VSpace_Serial(N_Vector, sunindextype*, sunindextype*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:78</i><br>
	 * @deprecated use the safer method {@link #N_VSpace_Serial(_generic_N_Vector, PointerByReference, PointerByReference)} instead
	 */
	@Deprecated 
	void N_VSpace_Serial(_generic_N_Vector v, Pointer lrw, Pointer liw);
	/**
	 * Original signature : <code>void N_VSpace_Serial(N_Vector, sunindextype*, sunindextype*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:78</i>
	 */
	void N_VSpace_Serial(_generic_N_Vector v, PointerByReference lrw, PointerByReference liw);
	/**
	 * Original signature : <code>sunrealtype* N_VGetArrayPointer_Serial(N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:81</i>
	 */
	sunrealtype N_VGetArrayPointer_Serial(_generic_N_Vector v);
	/**
	 * Original signature : <code>void N_VSetArrayPointer_Serial(sunrealtype*, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:84</i>
	 */
	void N_VSetArrayPointer_Serial(sunrealtype v_data, _generic_N_Vector v);
	/**
	 * standard vector operations<br>
	 * Original signature : <code>void N_VLinearSum_Serial(sunrealtype, N_Vector, sunrealtype, N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:88</i>
	 */
	void N_VLinearSum_Serial(sunrealtype a, _generic_N_Vector x, sunrealtype b, _generic_N_Vector y, _generic_N_Vector z);
	/**
	 * Original signature : <code>void N_VConst_Serial(sunrealtype, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:91</i>
	 */
	void N_VConst_Serial(sunrealtype c, _generic_N_Vector z);
	/**
	 * Original signature : <code>void N_VProd_Serial(N_Vector, N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:94</i>
	 */
	void N_VProd_Serial(_generic_N_Vector x, _generic_N_Vector y, _generic_N_Vector z);
	/**
	 * Original signature : <code>void N_VDiv_Serial(N_Vector, N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:97</i>
	 */
	void N_VDiv_Serial(_generic_N_Vector x, _generic_N_Vector y, _generic_N_Vector z);
	/**
	 * Original signature : <code>void N_VScale_Serial(sunrealtype, N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:100</i>
	 */
	void N_VScale_Serial(sunrealtype c, _generic_N_Vector x, _generic_N_Vector z);
	/**
	 * Original signature : <code>void N_VAbs_Serial(N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:103</i>
	 */
	void N_VAbs_Serial(_generic_N_Vector x, _generic_N_Vector z);
	/**
	 * Original signature : <code>void N_VInv_Serial(N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:106</i>
	 */
	void N_VInv_Serial(_generic_N_Vector x, _generic_N_Vector z);
	/**
	 * Original signature : <code>void N_VAddConst_Serial(N_Vector, sunrealtype, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:109</i>
	 */
	void N_VAddConst_Serial(_generic_N_Vector x, sunrealtype b, _generic_N_Vector z);
	/**
	 * Original signature : <code>sunrealtype N_VDotProd_Serial(N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:112</i>
	 */
	sunrealtype N_VDotProd_Serial(_generic_N_Vector x, _generic_N_Vector y);
	/**
	 * Original signature : <code>sunrealtype N_VMaxNorm_Serial(N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:115</i>
	 */
	sunrealtype N_VMaxNorm_Serial(_generic_N_Vector x);
	/**
	 * Original signature : <code>sunrealtype N_VWrmsNorm_Serial(N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:118</i>
	 */
	sunrealtype N_VWrmsNorm_Serial(_generic_N_Vector x, _generic_N_Vector w);
	/**
	 * Original signature : <code>sunrealtype N_VWrmsNormMask_Serial(N_Vector, N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:121</i>
	 */
	sunrealtype N_VWrmsNormMask_Serial(_generic_N_Vector x, _generic_N_Vector w, _generic_N_Vector id);
	/**
	 * Original signature : <code>sunrealtype N_VMin_Serial(N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:124</i>
	 */
	sunrealtype N_VMin_Serial(_generic_N_Vector x);
	/**
	 * Original signature : <code>sunrealtype N_VWL2Norm_Serial(N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:127</i>
	 */
	sunrealtype N_VWL2Norm_Serial(_generic_N_Vector x, _generic_N_Vector w);
	/**
	 * Original signature : <code>sunrealtype N_VL1Norm_Serial(N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:130</i>
	 */
	sunrealtype N_VL1Norm_Serial(_generic_N_Vector x);
	/**
	 * Original signature : <code>void N_VCompare_Serial(sunrealtype, N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:133</i>
	 */
	void N_VCompare_Serial(sunrealtype c, _generic_N_Vector x, _generic_N_Vector z);
	/**
	 * Original signature : <code>sunbooleantype N_VInvTest_Serial(N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:136</i>
	 */
	int N_VInvTest_Serial(_generic_N_Vector x, _generic_N_Vector z);
	/**
	 * Original signature : <code>sunbooleantype N_VConstrMask_Serial(N_Vector, N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:139</i>
	 */
	int N_VConstrMask_Serial(_generic_N_Vector c, _generic_N_Vector x, _generic_N_Vector m);
	/**
	 * Original signature : <code>sunrealtype N_VMinQuotient_Serial(N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:142</i>
	 */
	sunrealtype N_VMinQuotient_Serial(_generic_N_Vector num, _generic_N_Vector denom);
	/**
	 * fused vector operations<br>
	 * Original signature : <code>SUNErrCode N_VLinearCombination_Serial(int, sunrealtype*, N_Vector*, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:146</i><br>
	 * @deprecated use the safer method {@link #N_VLinearCombination_Serial(int, sunrealtype, ByReference[], _generic_N_Vector)} instead
	 */
	@Deprecated 
	int N_VLinearCombination_Serial(int nvec, sunrealtype c, PointerByReference V, _generic_N_Vector z);
	/**
	 * fused vector operations<br>
	 * Original signature : <code>SUNErrCode N_VLinearCombination_Serial(int, sunrealtype*, N_Vector*, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:146</i>
	 */
	int N_VLinearCombination_Serial(int nvec, sunrealtype c, ByReference V[], _generic_N_Vector z);
	/**
	 * Original signature : <code>SUNErrCode N_VScaleAddMulti_Serial(int, sunrealtype*, N_Vector, N_Vector*, N_Vector*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:149</i><br>
	 * @deprecated use the safer method {@link #N_VScaleAddMulti_Serial(int, sunrealtype, _generic_N_Vector, ByReference[], ByReference[])} instead
	 */
	@Deprecated 
	int N_VScaleAddMulti_Serial(int nvec, sunrealtype a, _generic_N_Vector x, PointerByReference Y, PointerByReference Z);
	/**
	 * Original signature : <code>SUNErrCode N_VScaleAddMulti_Serial(int, sunrealtype*, N_Vector, N_Vector*, N_Vector*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:149</i>
	 */
	int N_VScaleAddMulti_Serial(int nvec, sunrealtype a, _generic_N_Vector x, ByReference Y[], ByReference Z[]);
	/**
	 * Original signature : <code>SUNErrCode N_VDotProdMulti_Serial(int, N_Vector, N_Vector*, sunrealtype*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:152</i><br>
	 * @deprecated use the safer method {@link #N_VDotProdMulti_Serial(int, _generic_N_Vector, ByReference[], sunrealtype)} instead
	 */
	@Deprecated 
	int N_VDotProdMulti_Serial(int nvec, _generic_N_Vector x, PointerByReference Y, sunrealtype dotprods);
	/**
	 * Original signature : <code>SUNErrCode N_VDotProdMulti_Serial(int, N_Vector, N_Vector*, sunrealtype*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:152</i>
	 */
	int N_VDotProdMulti_Serial(int nvec, _generic_N_Vector x, ByReference Y[], sunrealtype dotprods);
	/**
	 * vector array operations<br>
	 * Original signature : <code>SUNErrCode N_VLinearSumVectorArray_Serial(int, sunrealtype, N_Vector*, sunrealtype, N_Vector*, N_Vector*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:157</i><br>
	 * @deprecated use the safer method {@link #N_VLinearSumVectorArray_Serial(int, sunrealtype, ByReference[], sunrealtype, ByReference[], ByReference[])} instead
	 */
	@Deprecated 
	int N_VLinearSumVectorArray_Serial(int nvec, sunrealtype a, PointerByReference X, sunrealtype b, PointerByReference Y, PointerByReference Z);
	/**
	 * vector array operations<br>
	 * Original signature : <code>SUNErrCode N_VLinearSumVectorArray_Serial(int, sunrealtype, N_Vector*, sunrealtype, N_Vector*, N_Vector*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:157</i>
	 */
	int N_VLinearSumVectorArray_Serial(int nvec, sunrealtype a, ByReference X[], sunrealtype b, ByReference Y[], ByReference Z[]);
	/**
	 * Original signature : <code>SUNErrCode N_VScaleVectorArray_Serial(int, sunrealtype*, N_Vector*, N_Vector*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:162</i><br>
	 * @deprecated use the safer method {@link #N_VScaleVectorArray_Serial(int, sunrealtype, ByReference[], ByReference[])} instead
	 */
	@Deprecated 
	int N_VScaleVectorArray_Serial(int nvec, sunrealtype c, PointerByReference X, PointerByReference Z);
	/**
	 * Original signature : <code>SUNErrCode N_VScaleVectorArray_Serial(int, sunrealtype*, N_Vector*, N_Vector*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:162</i>
	 */
	int N_VScaleVectorArray_Serial(int nvec, sunrealtype c, ByReference X[], ByReference Z[]);
	/**
	 * Original signature : <code>SUNErrCode N_VConstVectorArray_Serial(int, sunrealtype, N_Vector*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:166</i><br>
	 * @deprecated use the safer method {@link #N_VConstVectorArray_Serial(int, sunrealtype, ByReference[])} instead
	 */
	@Deprecated 
	int N_VConstVectorArray_Serial(int nvecs, sunrealtype c, PointerByReference Z);
	/**
	 * Original signature : <code>SUNErrCode N_VConstVectorArray_Serial(int, sunrealtype, N_Vector*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:166</i>
	 */
	int N_VConstVectorArray_Serial(int nvecs, sunrealtype c, ByReference Z[]);
	/**
	 * Original signature : <code>SUNErrCode N_VWrmsNormVectorArray_Serial(int, N_Vector*, N_Vector*, sunrealtype*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:169</i><br>
	 * @deprecated use the safer method {@link #N_VWrmsNormVectorArray_Serial(int, ByReference[], ByReference[], sunrealtype)} instead
	 */
	@Deprecated 
	int N_VWrmsNormVectorArray_Serial(int nvecs, PointerByReference X, PointerByReference W, sunrealtype nrm);
	/**
	 * Original signature : <code>SUNErrCode N_VWrmsNormVectorArray_Serial(int, N_Vector*, N_Vector*, sunrealtype*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:169</i>
	 */
	int N_VWrmsNormVectorArray_Serial(int nvecs, ByReference X[], ByReference W[], sunrealtype nrm);
	/**
	 * Original signature : <code>SUNErrCode N_VWrmsNormMaskVectorArray_Serial(int, N_Vector*, N_Vector*, N_Vector, sunrealtype*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:173</i><br>
	 * @deprecated use the safer method {@link #N_VWrmsNormMaskVectorArray_Serial(int, ByReference[], ByReference[], _generic_N_Vector, sunrealtype)} instead
	 */
	@Deprecated 
	int N_VWrmsNormMaskVectorArray_Serial(int nvecs, PointerByReference X, PointerByReference W, _generic_N_Vector id, sunrealtype nrm);
	/**
	 * Original signature : <code>SUNErrCode N_VWrmsNormMaskVectorArray_Serial(int, N_Vector*, N_Vector*, N_Vector, sunrealtype*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:173</i>
	 */
	int N_VWrmsNormMaskVectorArray_Serial(int nvecs, ByReference X[], ByReference W[], _generic_N_Vector id, sunrealtype nrm);
	/**
	 * Original signature : <code>SUNErrCode N_VScaleAddMultiVectorArray_Serial(int, int, sunrealtype*, N_Vector*, N_Vector**, N_Vector**)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:177</i><br>
	 * @deprecated use the safer method {@link #N_VScaleAddMultiVectorArray_Serial(int, int, sunrealtype, ByReference[], PointerByReference, PointerByReference)} instead
	 */
	@Deprecated 
	int N_VScaleAddMultiVectorArray_Serial(int nvec, int nsum, sunrealtype a, PointerByReference X, PointerByReference Y, PointerByReference Z);
	/**
	 * Original signature : <code>SUNErrCode N_VScaleAddMultiVectorArray_Serial(int, int, sunrealtype*, N_Vector*, N_Vector**, N_Vector**)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:177</i>
	 */
	int N_VScaleAddMultiVectorArray_Serial(int nvec, int nsum, sunrealtype a, ByReference X[], PointerByReference Y, PointerByReference Z);
	/**
	 * Original signature : <code>SUNErrCode N_VLinearCombinationVectorArray_Serial(int, int, sunrealtype*, N_Vector**, N_Vector*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:182</i><br>
	 * @deprecated use the safer method {@link #N_VLinearCombinationVectorArray_Serial(int, int, sunrealtype, PointerByReference, ByReference[])} instead
	 */
	@Deprecated 
	int N_VLinearCombinationVectorArray_Serial(int nvec, int nsum, sunrealtype c, PointerByReference X, PointerByReference Z);
	/**
	 * Original signature : <code>SUNErrCode N_VLinearCombinationVectorArray_Serial(int, int, sunrealtype*, N_Vector**, N_Vector*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:182</i>
	 */
	int N_VLinearCombinationVectorArray_Serial(int nvec, int nsum, sunrealtype c, PointerByReference X, ByReference Z[]);
	/**
	 * OPTIONAL local reduction kernels (no parallel communication)<br>
	 * Original signature : <code>sunrealtype N_VWSqrSumLocal_Serial(N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:188</i>
	 */
	sunrealtype N_VWSqrSumLocal_Serial(_generic_N_Vector x, _generic_N_Vector w);
	/**
	 * Original signature : <code>sunrealtype N_VWSqrSumMaskLocal_Serial(N_Vector, N_Vector, N_Vector)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:191</i>
	 */
	sunrealtype N_VWSqrSumMaskLocal_Serial(_generic_N_Vector x, _generic_N_Vector w, _generic_N_Vector id);
	/**
	 * OPTIONAL XBraid interface operations<br>
	 * Original signature : <code>SUNErrCode N_VBufSize_Serial(N_Vector, sunindextype*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:195</i><br>
	 * @deprecated use the safer method {@link #N_VBufSize_Serial(_generic_N_Vector, PointerByReference)} instead
	 */
	@Deprecated 
	int N_VBufSize_Serial(_generic_N_Vector x, Pointer size);
	/**
	 * OPTIONAL XBraid interface operations<br>
	 * Original signature : <code>SUNErrCode N_VBufSize_Serial(N_Vector, sunindextype*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:195</i>
	 */
	int N_VBufSize_Serial(_generic_N_Vector x, PointerByReference size);
	/**
	 * Original signature : <code>SUNErrCode N_VBufPack_Serial(N_Vector, void*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:198</i>
	 */
	int N_VBufPack_Serial(_generic_N_Vector x, Pointer buf);
	/**
	 * Original signature : <code>SUNErrCode N_VBufUnpack_Serial(N_Vector, void*)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:201</i>
	 */
	int N_VBufUnpack_Serial(_generic_N_Vector x, Pointer buf);
	/**
	 * -----------------------------------------------------------------<br>
	 * Enable / disable fused vector operations<br>
	 * -----------------------------------------------------------------<br>
	 * Original signature : <code>SUNErrCode N_VEnableFusedOps_Serial(N_Vector, sunbooleantype)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:210</i>
	 */
	int N_VEnableFusedOps_Serial(_generic_N_Vector v, int tf);
	/**
	 * Original signature : <code>SUNErrCode N_VEnableLinearCombination_Serial(N_Vector, sunbooleantype)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:213</i>
	 */
	int N_VEnableLinearCombination_Serial(_generic_N_Vector v, int tf);
	/**
	 * Original signature : <code>SUNErrCode N_VEnableScaleAddMulti_Serial(N_Vector, sunbooleantype)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:216</i>
	 */
	int N_VEnableScaleAddMulti_Serial(_generic_N_Vector v, int tf);
	/**
	 * Original signature : <code>SUNErrCode N_VEnableDotProdMulti_Serial(N_Vector, sunbooleantype)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:219</i>
	 */
	int N_VEnableDotProdMulti_Serial(_generic_N_Vector v, int tf);
	/**
	 * Original signature : <code>SUNErrCode N_VEnableLinearSumVectorArray_Serial(N_Vector, sunbooleantype)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:222</i>
	 */
	int N_VEnableLinearSumVectorArray_Serial(_generic_N_Vector v, int tf);
	/**
	 * Original signature : <code>SUNErrCode N_VEnableScaleVectorArray_Serial(N_Vector, sunbooleantype)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:225</i>
	 */
	int N_VEnableScaleVectorArray_Serial(_generic_N_Vector v, int tf);
	/**
	 * Original signature : <code>SUNErrCode N_VEnableConstVectorArray_Serial(N_Vector, sunbooleantype)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:228</i>
	 */
	int N_VEnableConstVectorArray_Serial(_generic_N_Vector v, int tf);
	/**
	 * Original signature : <code>SUNErrCode N_VEnableWrmsNormVectorArray_Serial(N_Vector, sunbooleantype)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:231</i>
	 */
	int N_VEnableWrmsNormVectorArray_Serial(_generic_N_Vector v, int tf);
	/**
	 * Original signature : <code>SUNErrCode N_VEnableWrmsNormMaskVectorArray_Serial(N_Vector, sunbooleantype)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:234</i>
	 */
	int N_VEnableWrmsNormMaskVectorArray_Serial(_generic_N_Vector v, int tf);
	/**
	 * Original signature : <code>SUNErrCode N_VEnableScaleAddMultiVectorArray_Serial(N_Vector, sunbooleantype)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:237</i>
	 */
	int N_VEnableScaleAddMultiVectorArray_Serial(_generic_N_Vector v, int tf);
	/**
	 * Original signature : <code>SUNErrCode N_VEnableLinearCombinationVectorArray_Serial(N_Vector, sunbooleantype)</code><br>
	 * <i>native declaration : include\nvector\nvector_serial.h:241</i>
	 */
	int N_VEnableLinearCombinationVectorArray_Serial(_generic_N_Vector v, int tf);
}
